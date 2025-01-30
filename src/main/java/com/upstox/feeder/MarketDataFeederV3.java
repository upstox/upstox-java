package com.upstox.feeder;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.google.gson.Gson;
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.feeder.constants.Method;
import com.upstox.feeder.constants.Mode;
import com.upstox.feeder.exception.StreamerException;
import com.upstox.feeder.listener.OnCloseListener;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOpenListener;

import io.swagger.client.api.WebsocketApi;

public class MarketDataFeederV3 extends Feeder {

    private static final String SOCKET_NOT_OPEN_ERROR = "WebSocket is not open.";

    protected MarketDataFeederV3(ApiClient apiClient, OnOpenListener onOpenListener, OnMessageListener onMessageListener,
                               OnErrorListener onErrorListener, OnCloseListener onCloseListener) {
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

                System.out.println("On Message as string: " + message);
            }

            @Override
            public void onMessage(ByteBuffer bytes) {

                if (onMessageListener != null) {
                    onMessageListener.onMessageAsBytes(bytes);
                }
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

    protected void subscribe(Set<String> instrumentKeys, Mode mode) {

        if (webSocket != null && webSocket.isOpen()) {
            String request = buildRequest(instrumentKeys, Method.SUBSCRIBE, mode);
            byte[] binaryData = request.getBytes(StandardCharsets.UTF_8);
            webSocket.send(binaryData);
        } else {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }
    }

    protected void unsubscribe(Set<String> instrumentKeys) {

        if (webSocket != null && webSocket.isOpen()) {
            String request = buildRequest(instrumentKeys, Method.UNSUBSCRIBE, null);
            byte[] binaryData = request.getBytes(StandardCharsets.UTF_8);
            webSocket.send(binaryData);
        } else {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }
    }

    protected void changeMode(Set<String> instrumentKeys, Mode newMode) {

        if (webSocket != null && webSocket.isOpen()) {
            String request = buildRequest(instrumentKeys, Method.CHANGE_METHOD, newMode);
            byte[] binaryData = request.getBytes(StandardCharsets.UTF_8);
            webSocket.send(binaryData);
        } else {
            throw new StreamerException(SOCKET_NOT_OPEN_ERROR);
        }
    }

    private String buildRequest(Set<String> instrumentKeys, Method method, Mode mode) {
        Map<String, Object> requestObj = new HashMap<>();
        requestObj.put("guid", UUID.randomUUID()
                .toString());
        requestObj.put("method", method.getValue());
        Map<String, Object> data = new HashMap<>();
        data.put("instrumentKeys", instrumentKeys);

        if (mode != null) {
            data.put("mode", mode.name()
                    .toLowerCase());
        }
        requestObj.put("data", data);
        return new Gson().toJson(requestObj);
    }

    private static URI getAuthorizedWebSocketUri(ApiClient authenticatedClient) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi(authenticatedClient);
        WebsocketAuthRedirectResponse response = websocketApi.getMarketDataFeedAuthorizeV3();

        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }
}
