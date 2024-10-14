package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CancelOrExitMultiOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

public class ExitAllTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApi apiInstance = new OrderApi();

        try {
            CancelOrExitMultiOrderResponse result = apiInstance.exitPositions("java_sdk_testing_tag_1",null);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1111") && !e.getResponseBody().contains("UDAPI1113")) System.out.println("Error in exit all order");
        }
    }
}
