package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoDetailsResponse;
import com.upstox.api.IpoListingResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

public class IpoApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        IpoApi apiInstance = new IpoApi();

        try {
            IpoListingResponse result = apiInstance.getIpoListing("open", "regular", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoListing");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoListingResponse result = apiInstance.getIpoListing(null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoListing (no params)");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoDetailsResponse result = apiInstance.getIpoDetails("sample-ipo-slug");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoDetails");
            System.out.println(e.getResponseBody());
        }
    }
}
