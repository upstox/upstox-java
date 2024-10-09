package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CancelOrExitMultiOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

import java.util.ArrayList;

public class CancelMultiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApi apiInstance = new OrderApi();

        try {
            CancelOrExitMultiOrderResponse result = apiInstance.cancelMultiOrder("java_sdk_testing_tag_1","NSE_EQ");
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1109")) System.out.println("Error in cancel order");
        }
    }
}
