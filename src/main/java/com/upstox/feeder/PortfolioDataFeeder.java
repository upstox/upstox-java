package com.upstox.feeder;

import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.feeder.listener.OnCloseListener;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOpenListener;

import io.swagger.client.api.WebsocketApi;

public class PortfolioDataFeeder extends Feeder {

    private OnMessageListener onMessageListener;
    private boolean orderUpdate;
    private boolean holdingUpdate;
    private boolean positionUpdate;
    private boolean gttUpdate;

    public boolean isOrderUpdate() {
        return orderUpdate;
    }

    public boolean isHoldingUpdate() {
        return holdingUpdate;
    }

    public boolean isPositionUpdate() {
        return positionUpdate;
    }

    public boolean isGttUpdate() {
        return gttUpdate;
    }

    protected PortfolioDataFeeder(ApiClient apiClient, OnOpenListener onOpenListener,
                                  OnMessageListener onMessageListener, OnErrorListener onErrorListener, OnCloseListener onCloseListener, boolean orderUpdate, boolean holdingUpdate, boolean positionUpdate, boolean gttUpdate) {
        super(apiClient);
        this.onOpenListener = onOpenListener;
        this.onMessageListener = onMessageListener;
        this.onErrorListener = onErrorListener;
        this.onCloseListener = onCloseListener;
        this.positionUpdate = positionUpdate;
        this.holdingUpdate = holdingUpdate;
        this.orderUpdate = orderUpdate;
        this.gttUpdate = gttUpdate;
    }

    @Override
    protected void connect() {

        if (this.webSocket != null) {
            return;
        }

        // Get authorized WebSocket URI for market data feed
        URI serverUri;

        try {
            serverUri = getAuthorizedWebSocketUri(apiClient);
        } catch (ApiException e) {

            if (onErrorListener != null) {
                onErrorListener.onError(e);
            }
            return;
        }

        this.webSocket = new WebSocketClient(serverUri) {

            @Override
            public void onOpen(ServerHandshake handshakedata) {

                if (onOpenListener != null) {
                    onOpenListener.onOpen();
                }
            }

            @Override
            public void onMessage(String message) {

                if (onMessageListener != null) {
                    onMessageListener.onMessageAsString(message);
                }
            }

            @Override
            public void onMessage(ByteBuffer bytes) {
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {

                if (onCloseListener != null) {
                    onCloseListener.onClose(code, reason);
                }
            }

            @Override
            public void onError(Exception error) {

                if (onErrorListener != null) {
                    onErrorListener.onError(error);
                }
            }
        };

        this.webSocket.connect();
    }

    private URI getAuthorizedWebSocketUri(ApiClient authenticatedClient) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi(authenticatedClient);
        websocketApi.setOrderUpdate(this.orderUpdate);
        websocketApi.setHoldingUpdate(this.holdingUpdate);
        websocketApi.setPositionUpdate(this.positionUpdate);
        websocketApi.setGttUpdate(this.gttUpdate);
        WebsocketAuthRedirectResponse response = websocketApi.getPortfolioStreamFeedAuthorize("2.0");
        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }
}
