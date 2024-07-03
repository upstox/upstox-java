package com.upstox.order;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CancelOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

public class CancelOrderTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("your_access_token");
        OrderApi apiInstance = new OrderApi();
        String orderId = "240125010599037";
        String apiVersion = "2.0"; // String | API Version Header
        try {
            CancelOrderResponse result = apiInstance.cancelOrder(orderId,apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
