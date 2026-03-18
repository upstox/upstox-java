package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.SearchInstrumentResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.InstrumentsApi;

public class InstrumentSearchTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        InstrumentsApi apiInstance = new InstrumentsApi();

        // Basic search with just query
        try {
            SearchInstrumentResponse result = apiInstance.searchInstrument("Nifty 50", null, null, null, null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling InstrumentsApi#searchInstrument");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }

        // Search with exchange filter
        try {
            SearchInstrumentResponse result = apiInstance.searchInstrument("Reliance", "NSE", null, null, null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling InstrumentsApi#searchInstrument with exchange");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }

        // Search with segment filter
        try {
            SearchInstrumentResponse result = apiInstance.searchInstrument("TCS", null, "EQ", null, null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling InstrumentsApi#searchInstrument with segment");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }

        // Search with instrument type filter
        try {
            SearchInstrumentResponse result = apiInstance.searchInstrument("Nifty", null, null, "INDEX", null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling InstrumentsApi#searchInstrument with instrumentTypes");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }

        // Search with pagination
        try {
            SearchInstrumentResponse result = apiInstance.searchInstrument("HDFC", null, null, null, null, null, 1, 5);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling InstrumentsApi#searchInstrument with pagination");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
}
