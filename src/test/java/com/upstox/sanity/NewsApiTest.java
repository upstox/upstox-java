package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetNewsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.NewsApi;

public class NewsApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        NewsApi apiInstance = new NewsApi();

        try {
            GetNewsResponse result = apiInstance.getNews("instrument_keys", "NSE_EQ|INE669E01016", null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNews with instrument_keys");
            System.out.println(e.getResponseBody());
        }

        try {
            GetNewsResponse result = apiInstance.getNews("positions", null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNews with positions");
            System.out.println(e.getResponseBody());
        }

        try {
            GetNewsResponse result = apiInstance.getNews("holdings", null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNews with holdings");
            System.out.println(e.getResponseBody());
        }
    }
}
