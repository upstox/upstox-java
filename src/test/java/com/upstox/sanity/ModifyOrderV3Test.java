package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderV3Response;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;

public class ModifyOrderV3Test {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);
        OrderApiV3 apiInstance = new OrderApiV3();
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(9F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        body.setOrderId("250128010532402");
        String apiVersion = "2.0"; // String | API Version Header
        try {
            ModifyOrderV3Response result = apiInstance.modifyOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) {
                System.err.println(e.getResponseBody());
            }

        }
    }
}
