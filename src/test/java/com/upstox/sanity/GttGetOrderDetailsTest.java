package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetGttOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;

public class GttGetOrderDetailsTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApiV3 apiInstance = new OrderApiV3();


        try {
            GetGttOrderResponse result = apiInstance.getGttOrderDetails("GTT-C25040300144712");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
}
