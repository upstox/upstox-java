package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GttCancelOrderRequest;
import com.upstox.api.GttModifyOrderRequest;
import com.upstox.api.GttRule;
import com.upstox.api.GttTriggerOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;

import java.util.ArrayList;
import java.util.List;

public class GttCancelOrderV3Test {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApiV3 apiInstance = new OrderApiV3();
        GttCancelOrderRequest cancelOrderRequest = new GttCancelOrderRequest();
        cancelOrderRequest.setGttOrderId("GTT-C25040300142547");


        try {
            GttTriggerOrderResponse result = apiInstance.cancelGTTOrder(cancelOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
}
