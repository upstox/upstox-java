package com.upstox.feeder;

import java.nio.ByteBuffer;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.upstox.ApiClient;
import com.upstox.feeder.exception.StreamerException;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOrderUpdateListener;

public class PortfolioDataStreamer extends Streamer {

    private OnOrderUpdateListener onOrderUpdateListener;

    private static final String SOCKET_NOT_OPEN_ERROR = "WebSocket is not open.";
    private static final String INVALID_VALUES_ERROR = "Values provided are invalid.";

    public void setOnOrderUpdateListener(OnOrderUpdateListener onOrderUpdateListener) {
        this.onOrderUpdateListener = onOrderUpdateListener;
    }

    public PortfolioDataStreamer(ApiClient apiClient) {

        if (apiClient == null) {
            throw new StreamerException(INVALID_VALUES_ERROR);
        }

        this.apiClient = apiClient;
    }

    @Override
    public void connect() {
        feeder = new PortfolioDataFeeder(apiClient, this::handleOpen, new OnMessageListener() {

            @Override
            public void onMessageAsBytes(ByteBuffer bytes) {

            }

            @Override
            public void onMessageAsString(String message) {
                handleMessage(message);

            }
        }, this::handleError, this::handleClose);

        feeder.connect();
    }

    public void disconnect() {

        if (feeder != null) {
            disconnectValid = true;
            feeder.disconnect();
        } else {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }
    }

    protected void handleOpen() {
        disconnectValid = false;
        reconnectInProgress = false;
        reconnectAttempts = 0;

        if (onOpenListener != null) {
            onOpenListener.onOpen();
        }

    }

    protected void handleMessage(String message) {

        Object updateData = parseUpdateMessage(message);

        if (updateData instanceof OrderUpdate && onOrderUpdateListener != null) {
            onOrderUpdateListener.onUpdate((OrderUpdate) updateData);
        }
    }

    private static Object parseUpdateMessage(String data) {
        JsonObject jsonObject = JsonParser.parseString(data)
                .getAsJsonObject();
        String updateType = jsonObject.get("update_type")
                .getAsString();
        Gson gson = new Gson();

        if ("order".equals(updateType)) {
            return gson.fromJson(data, OrderUpdate.class);
        }

        return null;

    }
}
