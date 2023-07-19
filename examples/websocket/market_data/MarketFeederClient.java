package com.upstox.websocket.market;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.auth.OAuth;

import io.swagger.client.api.MarketFeeder.FeedResponse;

public class MarketFeederClient {

    public static void main(String[] args) throws Exception {

        // Define your access token
        String accessToken = "ACCESS_TOKEN";

        // Get an authenticated API client
        ApiClient authenticatedClient = authenticateApiClient(accessToken);

        // Get authorized WebSocket URI for market data feed
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
        WebsocketAuthRedirectResponse response = websocketApi.getMarketDataFeedAuthorize("2.0");

        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }

    private static WebSocketClient createWebSocketClient(URI serverUri) {
        return new WebSocketClient(serverUri) {

            @Override
            public void onOpen(ServerHandshake handshakedata) {
                System.out.println("Opened connection");

                // Send subscription request after opening the connection
                sendSubscriptionRequest(this);
            }

            @Override
            public void onMessage(String message) {
                System.out.println("Received: " + message);
            }

            @Override
            public void onMessage(ByteBuffer bytes) {
                handleBinaryMessage(bytes);
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

    private static void sendSubscriptionRequest(WebSocketClient client) {
        JsonObject requestObject = constructSubscriptionRequest();
        byte[] binaryData = requestObject.toString()
                .getBytes(StandardCharsets.UTF_8);

        System.out.println("Sending: " + requestObject);
        client.send(binaryData);
    }

    private static JsonObject constructSubscriptionRequest() {
        JsonObject dataObject = new JsonObject();
        dataObject.addProperty("mode", "full");

        JsonArray instrumentKeys = new Gson().toJsonTree(Arrays.asList("NSE_INDEX|Nifty Bank", "NSE_INDEX|Nifty 50"))
                .getAsJsonArray();
        dataObject.add("instrumentKeys", instrumentKeys);

        JsonObject mainObject = new JsonObject();
        mainObject.addProperty("guid", "someguid");
        mainObject.addProperty("method", "sub");
        mainObject.add("data", dataObject);

        return mainObject;
    }

    private static void handleBinaryMessage(ByteBuffer bytes) {
        System.out.println("Received: " + bytes);

        try {
            FeedResponse feedResponse = FeedResponse.parseFrom(bytes.array());

            // Convert the protobuf object to a JSON string
            String jsonFormat = JsonFormat.printer()
                    .print(feedResponse);

            // Print the JSON string
            System.out.println(jsonFormat);

        } catch (InvalidProtocolBufferException e) {
            System.out.println("Received unparseable message");
            e.printStackTrace();
        }
    }
}
