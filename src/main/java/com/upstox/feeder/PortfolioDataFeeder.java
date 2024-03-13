package com.upstox.feeder;

import java.net.URI;
import java.nio.ByteBuffer;

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

    protected PortfolioDataFeeder(ApiClient apiClient, OnOpenListener onOpenListener,
            OnMessageListener onMessageListener, OnErrorListener onErrorListener, OnCloseListener onCloseListener) {
        super(apiClient);
        this.onOpenListener = onOpenListener;
        this.onMessageListener = onMessageListener;
        this.onErrorListener = onErrorListener;
        this.onCloseListener = onCloseListener;
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

    private static URI getAuthorizedWebSocketUri(ApiClient authenticatedClient) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi(authenticatedClient);
        WebsocketAuthRedirectResponse response = websocketApi.getPortfolioStreamFeedAuthorize("2.0");

        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }
}
