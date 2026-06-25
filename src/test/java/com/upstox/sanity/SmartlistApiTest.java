package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class SmartlistApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        MarketApi apiInstance = new MarketApi();

        try {
            AnalyticsResponse result = apiInstance.getSmartlistFutures("EQUITY", "active", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getSmartlistFutures");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = apiInstance.getSmartlistMtf(1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getSmartlistMtf");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = apiInstance.getSmartlistOptions("EQUITY", "active", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getSmartlistOptions");
            System.out.println(e.getResponseBody());
        }
    }
}
