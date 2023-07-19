package com.upstox.websocket.portfolio;

import java.net.URI;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.auth.OAuth;

public class OrderUpdatesClient {
    public static void main(String[] args) throws Exception {

        // Define your access token
        String accessToken = "ACCESS_TOKEN";

        // Get an authenticated API client
        ApiClient authenticatedClient = authenticateApiClient(accessToken);

        // Get authorized WebSocket URI for portfolio stream feed
        URI serverUri = getAuthorizedWebSocketUri(authenticatedClient);

        // Create and connect the WebSocket client
        WebSocketClient client = createWebSocketClient(serverUri);
        client.connect();
    }

    private static ApiClient authenticateApiClient(String accessToken) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(accessToken);

        return defaultClient;
    }

    private static URI getAuthorizedWebSocketUri(ApiClient authenticatedClient) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi(authenticatedClient);
        WebsocketAuthRedirectResponse response = websocketApi.getPortfolioStreamFeedAuthorize("2.0");

        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }

    private static WebSocketClient createWebSocketClient(URI serverUri) {
        return new WebSocketClient(serverUri) {

            @Override
            public void onOpen(ServerHandshake handshakeData) {
                System.out.println("Opened connection");
            }

            @Override
            public void onMessage(String message) {
                System.out.println("Received: " + message);
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                System.out.println("Connection closed by " + (remote ? "remote peer" : "us") + ". Info: " + reason);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        };
    }
}
