package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
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

public class FundamentalsApiSanityTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        FundamentalsApi api = new FundamentalsApi();
        String isin = "INE002A01018"; // Reliance Industries

        try {
            CompanyProfileResponse result = api.getCompanyProfile(isin);
            System.out.println("getCompanyProfile => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCompanyProfile");
            System.out.println(e.getResponseBody());
        }

        try {
            BalanceSheetResponse result = api.getBalanceSheet(isin, "consolidated", false);
            System.out.println("getBalanceSheet => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getBalanceSheet");
            System.out.println(e.getResponseBody());
        }

        try {
            CashFlowResponse result = api.getCashFlow(isin, "consolidated", false);
            System.out.println("getCashFlow => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCashFlow");
            System.out.println(e.getResponseBody());
        }

        try {
            IncomeStatementResponse result = api.getIncomeStatement(isin, "consolidated", "yearly", false);
            System.out.println("getIncomeStatement => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getIncomeStatement");
            System.out.println(e.getResponseBody());
        }

        try {
            KeyRatiosResponse result = api.getKeyRatios(isin);
            System.out.println("getKeyRatios => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getKeyRatios");
            System.out.println(e.getResponseBody());
        }

        try {
            ShareHoldingsResponse result = api.getShareHoldings(isin);
            System.out.println("getShareHoldings => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getShareHoldings");
            System.out.println(e.getResponseBody());
        }

        try {
            CorporateActionsResponse result = api.getCorporateActions(isin);
            System.out.println("getCorporateActions => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCorporateActions");
            System.out.println(e.getResponseBody());
        }

        try {
            CompetitorsResponse result = api.getCompetitors("NSE_EQ|INE002A01018");
            System.out.println("getCompetitors => " + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsApi#getCompetitors");
            System.out.println(e.getResponseBody());
        }
    }
}
