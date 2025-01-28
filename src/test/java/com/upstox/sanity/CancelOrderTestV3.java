package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;

public class CancelOrderTestV3 {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApiV3 apiInstance = new OrderApiV3();
        try {
            System.out.println(apiInstance.cancelOrder("250128010534339"));;
        }
        catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#cancelOrder ");
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
