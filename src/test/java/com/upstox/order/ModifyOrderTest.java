package com.upstox.order;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

public class ModifyOrderTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("your_access_token");

        OrderApi apiInstance = new OrderApi();
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.MARKET);
        body.setOrderId("240125010587640");
        String apiVersion = "2.0"; // String | API Version Header
        try {
            ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
