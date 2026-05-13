package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class MarketApiSanityTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        MarketApi api = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2026-05-26";
        String date = "2026-05-12";

        try {
            AnalyticsResponse result = api.getOiData(instrumentKey, expiry, date);
            System.out.println("getOiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getOiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = api.getChangeOiData(instrumentKey, expiry, date, 5);
            System.out.println("getChangeOiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getChangeOiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = api.getPcrData(instrumentKey, expiry, date, 30);
            System.out.println("getPcrData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getPcrData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = api.getMaxPainData(instrumentKey, expiry, date, 30);
            System.out.println("getMaxPainData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getMaxPainData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = api.getFiiData("NSE_EQ|CASH", "1D", null);
            System.out.println("getFiiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getFiiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = api.getDiiData("NSE_EQ|CASH", "1D", null);
            System.out.println("getDiiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getDiiData");
            System.out.println(e.getResponseBody());
        }
    }
}
