

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.google.gson.JsonArray;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;



public class MarketFeederClient {

    public static void main(String[] args) throws Exception {

        // Define your access token
        String accessToken = "YOUR_ACCESS_TOKEN";

        WebSocketClient client = createWebSocketClient(getWebsocketUrl(accessToken));
        client.connect();
    }
    public static URI getWebsocketUrl(String accessToken) throws IOException, InterruptedException {
        String url = "https://api.upstox.com/v3/feed/market-data-feed/authorize";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + accessToken)
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        WebSocketResponse webSocketResponse = gson.fromJson(response.body(), WebSocketResponse.class);
        return URI.create(webSocketResponse.getData().getAuthorizedRedirectUri());
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

    private static <FeedResponse> void handleBinaryMessage(ByteBuffer bytes) {
        System.out.println("Received: " + bytes);

        try {
            MarketDataFeedV3.FeedResponse feedResponse = MarketDataFeedV3.FeedResponse.parseFrom(bytes.array());

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
class WebSocketResponse {
    private String status;
    private Data data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private String authorizedRedirectUri;
        private String authorized_redirect_uri;

        public String getAuthorizedRedirectUri() {
            return authorizedRedirectUri;
        }

        public void setAuthorizedRedirectUri(String authorizedRedirectUri) {
            this.authorizedRedirectUri = authorizedRedirectUri;
        }

        public String getAuthorized_redirect_uri() {
            return authorized_redirect_uri;
        }

        public void setAuthorized_redirect_uri(String authorized_redirect_uri) {
            this.authorized_redirect_uri = authorized_redirect_uri;
        }
    }
}