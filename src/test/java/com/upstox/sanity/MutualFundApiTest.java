package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMutualFundHoldingsResponse;
import com.upstox.api.GetMutualFundOrderDetailsResponse;
import com.upstox.api.GetMutualFundOrdersResponse;
import com.upstox.api.GetMutualFundSipsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MutualFundApi;

public class MutualFundApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        MutualFundApi apiInstance = new MutualFundApi();

        try {
            GetMutualFundHoldingsResponse result = apiInstance.getMutualFundHoldings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundApi#getMutualFundHoldings");
            System.out.println(e.getResponseBody());
        }

        try {
            GetMutualFundOrdersResponse result = apiInstance.getMutualFundOrders(null, null, 1, 10);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundApi#getMutualFundOrders");
            System.out.println(e.getResponseBody());
        }

        try {
            GetMutualFundOrderDetailsResponse result = apiInstance.getMutualFundOrder("MF-ORDER-12345");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundApi#getMutualFundOrder");
            System.out.println(e.getResponseBody());
        }

        try {
            GetMutualFundSipsResponse result = apiInstance.getMutualFundSips(1, 10);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MutualFundApi#getMutualFundSips");
            System.out.println(e.getResponseBody());
        }
    }
}
