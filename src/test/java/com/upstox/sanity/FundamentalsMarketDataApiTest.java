package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.api.BalanceSheetResponse;
import com.upstox.api.CashFlowResponse;
import com.upstox.api.CompanyProfileResponse;
import com.upstox.api.CompetitorsResponse;
import com.upstox.api.CorporateActionsResponse;
import com.upstox.api.IncomeStatementResponse;
import com.upstox.api.KeyRatiosResponse;
import com.upstox.api.ShareHoldingsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;
import io.swagger.client.api.MarketApi;

public class FundamentalsMarketDataApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        // Fundamentals API tests
        FundamentalsApi fundamentalsApi = new FundamentalsApi();
        String isin = "INE848E01016"; // Wipro

        try {
            CompanyProfileResponse result = fundamentalsApi.getCompanyProfile(isin);
            System.out.println("getCompanyProfile => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCompanyProfile");
            System.out.println(e.getResponseBody());
        }

        try {
            BalanceSheetResponse result = fundamentalsApi.getBalanceSheet(isin, "consolidated", false);
            System.out.println("getBalanceSheet => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheet");
            System.out.println(e.getResponseBody());
        }

        try {
            CashFlowResponse result = fundamentalsApi.getCashFlow(isin, "consolidated", false);
            System.out.println("getCashFlow => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlow");
            System.out.println(e.getResponseBody());
        }

        try {
            IncomeStatementResponse result = fundamentalsApi.getIncomeStatement(isin, "consolidated", "annual", false);
            System.out.println("getIncomeStatement => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatement");
            System.out.println(e.getResponseBody());
        }

        try {
            KeyRatiosResponse result = fundamentalsApi.getKeyRatios(isin);
            System.out.println("getKeyRatios => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getKeyRatios");
            System.out.println(e.getResponseBody());
        }

        try {
            ShareHoldingsResponse result = fundamentalsApi.getShareHoldings(isin);
            System.out.println("getShareHoldings => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getShareHoldings");
            System.out.println(e.getResponseBody());
        }

        try {
            CompetitorsResponse result = fundamentalsApi.getCompetitors("NSE_EQ|INE848E01016");
            System.out.println("getCompetitors => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCompetitors");
            System.out.println(e.getResponseBody());
        }

        try {
            CorporateActionsResponse result = fundamentalsApi.getCorporateActions(isin);
            System.out.println("getCorporateActions => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCorporateActions");
            System.out.println(e.getResponseBody());
        }

        // Market API tests
        MarketApi marketApi = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2025-06-26";
        String date = "2025-06-12";

        try {
            AnalyticsResponse result = marketApi.getOiData(instrumentKey, expiry, date);
            System.out.println("getOiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getOiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = marketApi.getChangeOiData(instrumentKey, expiry, date, 1);
            System.out.println("getChangeOiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getChangeOiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = marketApi.getMaxPainData(instrumentKey, expiry, date, 30);
            System.out.println("getMaxPainData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getMaxPainData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = marketApi.getPcrData(instrumentKey, expiry, date, 30);
            System.out.println("getPcrData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getPcrData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = marketApi.getFiiData("NSE_EQ|CASH", "1D", null);
            System.out.println("getFiiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getFiiData");
            System.out.println(e.getResponseBody());
        }

        try {
            AnalyticsResponse result = marketApi.getDiiData("NSE_EQ|CASH", "1D", null);
            System.out.println("getDiiData => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getDiiData");
            System.out.println(e.getResponseBody());
        }
    }
}
