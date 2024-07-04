package com.upstox.feeder;

import java.nio.ByteBuffer;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.upstox.ApiClient;
import com.upstox.feeder.exception.StreamerException;
import com.upstox.feeder.listener.*;

public class PortfolioDataStreamer extends Streamer {

    private OnOrderUpdateListener onOrderUpdateListener;
    private OnHoldingUpdateListener onHoldingUpdateListener;
    private OnPositionUpdateListener onPositionUpdateListener;
    private boolean orderUpdate = true;
    private boolean holdingUpdate = false;
    private boolean positionUpdate = false;

    private static final String SOCKET_NOT_OPEN_ERROR = "WebSocket is not open.";
    private static final String INVALID_VALUES_ERROR = "Values provided are invalid.";

    public void setOnOrderUpdateListener(OnOrderUpdateListener onOrderUpdateListener) {
        this.onOrderUpdateListener = onOrderUpdateListener;
    }
    public void setOnHoldingUpdateListener(OnHoldingUpdateListener onHoldingUpdateListener){
        this.onHoldingUpdateListener = onHoldingUpdateListener;
    }
    public void setOPositionUpdateListener(OnPositionUpdateListener onPositionUpdateListener){
        this.onPositionUpdateListener = onPositionUpdateListener;
    }

    public PortfolioDataStreamer(ApiClient apiClient) {

        if (apiClient == null) {
            throw new StreamerException(INVALID_VALUES_ERROR);
        }

        this.apiClient = apiClient;
    }
    public PortfolioDataStreamer(ApiClient apiClient, boolean orderUpdate, boolean positionUpdate, boolean holdingUpdate){
        if (apiClient == null) {
            throw new StreamerException(INVALID_VALUES_ERROR);
        }

        this.apiClient = apiClient;
        this.orderUpdate = orderUpdate;
        this.positionUpdate = positionUpdate;
        this.holdingUpdate = holdingUpdate;
    }
    @Override
    public void connect() {
        feeder = new PortfolioDataFeeder(apiClient, new OnOpenListener() {

            @Override
            public void onOpen() {
                handleOpen();

            }
        }, new OnMessageListener() {

            @Override
            public void onMessageAsBytes(ByteBuffer bytes) {

            }

            @Override
            public void onMessageAsString(String message) {
                handleMessage(message);

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
        },orderUpdate,positionUpdate,holdingUpdate);

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
        System.out.println("message= "  + message);
        if (updateData instanceof OrderUpdate && onOrderUpdateListener != null) {
            onOrderUpdateListener.onUpdate((OrderUpdate) updateData);
        }
        else if(updateData instanceof HoldingUpdate && onHoldingUpdateListener != null){
            onHoldingUpdateListener.onUpdate((HoldingUpdate) updateData);
        }
        else if(updateData instanceof PositionUpdate && onPositionUpdateListener != null){
            onPositionUpdateListener.onUpdate((PositionUpdate) updateData);
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
        else if("holding".equals(updateType)){
            return gson.fromJson(data,HoldingUpdate.class);
        }
        else if("position".equals(updateType)){
            return gson.fromJson(data,PositionUpdate.class);
        }
        return null;

    }
}
