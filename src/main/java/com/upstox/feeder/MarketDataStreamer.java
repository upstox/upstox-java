package com.upstox.feeder;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.upstox.ApiClient;
import com.upstox.feeder.constants.Mode;
import com.upstox.feeder.exception.StreamerException;
import com.upstox.feeder.listener.OnCloseListener;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMarketUpdateListener;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOpenListener;
import com.upstox.marketdatafeeder.rpc.proto.MarketDataFeed.FeedResponse;

public class MarketDataStreamer extends Streamer {

    private OnMarketUpdateListener onMarketUpdateListener;

    private static final String SOCKET_NOT_OPEN_ERROR = "WebSocket is not open.";
    private static final String INVALID_VALUES_ERROR = "Values provided are invalid.";

    private Map<Mode, Set<String>> subscriptions;

    public void setOnMarketUpdateListener(OnMarketUpdateListener onMarketUpdateListener) {
        this.onMarketUpdateListener = onMarketUpdateListener;
    }

    public MarketDataStreamer(ApiClient apiClient) {

        if (apiClient == null) {
            throw new StreamerException(INVALID_VALUES_ERROR);
        }

        this.apiClient = apiClient;
        subscriptions = new HashMap<>();
        subscriptions.put(Mode.LTPC, new HashSet<String>());
        subscriptions.put(Mode.FULL, new HashSet<String>());
    }

    public MarketDataStreamer(ApiClient apiClient, Set<String> instrumentKeys, Mode mode) {

        if (apiClient == null || instrumentKeys == null || mode == null) {
            throw new StreamerException(INVALID_VALUES_ERROR);
        }

        this.apiClient = apiClient;
        subscriptions = new HashMap<>();
        subscriptions.put(Mode.LTPC, new HashSet<String>());
        subscriptions.put(Mode.FULL, new HashSet<String>());

        // Populate initial subscriptions if provided
        this.subscriptions.get(mode)
                .addAll(instrumentKeys);
    }

    @Override
    public void connect() {
        feeder = new MarketDataFeeder(apiClient, new OnOpenListener() {

            @Override
            public void onOpen() {
                handleOpen();

            }
        }, new OnMessageListener() {

            @Override
            public void onMessageAsBytes(ByteBuffer bytes) {
                handleMessage(bytes);

            }

            @Override
            public void onMessageAsString(String message) {

            }
        }, new OnErrorListener() {

            @Override
            public void onError(Throwable error) {
                handleError(error);

            }
        }, new OnCloseListener() {

            @Override
            public void onClose(int statusCode, String reason) {
                handleClose(statusCode, reason);

            }
        });

        feeder.connect();
    }

    public void disconnect() {

        if (feeder != null) {
            disconnectValid = true;
            feeder.disconnect();
            clearSubscriptions();
        } else {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }
    }

    public void subscribe(Set<String> instrumentKeys, Mode mode) {

        if (instrumentKeys == null || mode == null) {
            this.handleError(new StreamerException(INVALID_VALUES_ERROR));
            return;
        }

        MarketDataFeeder marketDataFeeder = (MarketDataFeeder) feeder;

        if (marketDataFeeder == null) {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }

        subscriptions.get(mode)
                .addAll(instrumentKeys);

        marketDataFeeder.subscribe(instrumentKeys, mode);
    }

    public void unsubscribe(Set<String> instrumentKeys) {

        if (instrumentKeys == null) {
            this.handleError(new StreamerException(INVALID_VALUES_ERROR));
            return;
        }

        MarketDataFeeder marketDataFeeder = (MarketDataFeeder) feeder;

        if (marketDataFeeder == null) {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }

        for (Set<String> modeKeys : subscriptions.values()) {
            modeKeys.removeAll(instrumentKeys);
        }

        marketDataFeeder.unsubscribe(instrumentKeys);
    }

    public void changeMode(Set<String> instrumentKeys, Mode newMode) {

        if (instrumentKeys == null || newMode == null) {
            this.handleError(new StreamerException(INVALID_VALUES_ERROR));
            return;
        }

        MarketDataFeeder marketDataFeeder = (MarketDataFeeder) feeder;

        if (marketDataFeeder == null) {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }

        Mode oldMode = (newMode == Mode.FULL) ? Mode.LTPC : Mode.FULL;
        subscriptions.get(oldMode)
                .removeAll(instrumentKeys);
        subscriptions.get(newMode)
                .addAll(instrumentKeys);

        marketDataFeeder.changeMode(instrumentKeys, newMode);
    }

    private void subscribeToInitialKeys() {

        MarketDataFeeder marketDataFeeder = (MarketDataFeeder) feeder;

        for (Map.Entry<Mode, Set<String>> entry : subscriptions.entrySet()) {
            Mode mode = entry.getKey();
            Set<String> keys = entry.getValue();

            if (!keys.isEmpty()) {
                marketDataFeeder.subscribe(keys, mode);
            }
        }
    }

    private void clearSubscriptions() {

        for (Set<String> modeKeys : this.subscriptions.values()) {
            modeKeys.clear();
        }
    }

    protected void handleOpen() {
        disconnectValid = false;
        reconnectInProgress = false;
        reconnectAttempts = 0;

        if (onOpenListener != null) {
            onOpenListener.onOpen();
        }

        subscribeToInitialKeys();

    }

    protected void handleMessage(ByteBuffer bytes) {

        try {
            FeedResponse feedResponse = FeedResponse.parseFrom(bytes);
            String jsonFormat = JsonFormat.printer()
                    .print(feedResponse);

            Gson gson = new Gson();

            MarketUpdate marketUpdate = gson.fromJson(jsonFormat, MarketUpdate.class);

            if (onMarketUpdateListener != null) {
                onMarketUpdateListener.onUpdate(marketUpdate);
            }

        } catch (InvalidProtocolBufferException e) {
            handleError(e);
        }
    }
}
