package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.ExpiredInstrumentApi;
import io.swagger.client.api.HistoryV3Api;
import io.swagger.client.api.MarketQuoteV3Api;
import io.swagger.client.api.PortfolioApi;

public class PlusApisTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);
        maretQuoteV3Test();
        mtfPositionApiTest();
        historicalCandleV3test();
        expiredInstrumentTest();

    }
    private static  void maretQuoteV3Test(){
        MarketQuoteV3Api marketQuoteV3Api = new MarketQuoteV3Api();

        try {
            GetMarketQuoteLastTradedPriceResponseV3 result = marketQuoteV3Api.getLtp("NSE_EQ|INE669E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling MarketQuoteV3Api#getLtp");
            System.out.println("Status code: " + e.getCode());
        }
        try {
            GetMarketQuoteOHLCResponseV3 result = marketQuoteV3Api.getMarketQuoteOHLC("I1", "NSE_EQ|INE669E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling MarketQuoteV3Api#getMarketQuoteOHLC");
            System.out.println("Status code: " + e.getCode());
        }
        try {
            GetMarketQuoteOptionGreekResponseV3 response = marketQuoteV3Api.getMarketQuoteOptionGreek("NSE_FO|44822");
            System.out.println(response);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling MarketQuoteV3Api#getMarketQuoteOptionGreek");
            System.out.println("Status code: " + e.getCode());
        }
    }
    private static void mtfPositionApiTest(){
        PortfolioApi portfolioApi = new PortfolioApi();
        try {
            GetPositionResponse result = portfolioApi.getMtfPositions();
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling PortfolioApi#getMtfPosition");
            System.out.println("Status code: " + e.getCode());
        }
    }
    private static void historicalCandleV3test(){
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData("NSE_EQ|INE669E01016", "weeks", 1, "2025-04-04");
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling HistoryV3Api#getHistoricalCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE669E01016", "weeks", 1, "2025-04-04","2020-04-04");
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling HistoryV3Api#getHistoricalCandleData1");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE669E01016", "minutes", 1);
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling HistoryV3Api#getIntraDayCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
    private static void expiredInstrumentTest(){
        ExpiredInstrumentApi expiredInstrumentApi = new ExpiredInstrumentApi();
        try {
            GetExpiriesResponse getExpiriesResponse = expiredInstrumentApi.getExpiries("NSE_INDEX|Nifty 50");
            System.out.println(getExpiriesResponse);
        } catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredInstruments");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetExpiredFuturesContractResponse result = expiredInstrumentApi.getExpiredFutureContracts("NSE_INDEX|Nifty 50", "2025-04-24");
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredFutureContracts");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetOptionContractResponse result = expiredInstrumentApi.getExpiredOptionContracts("NSE_INDEX|Nifty 50", "2025-04-24");
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredOptionsContracts");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetHistoricalCandleResponse result = expiredInstrumentApi.getExpiredHistoricalCandleData("NSE_FO|54452|24-04-2025","30minute","2025-06-04","2002-06-04");
            System.out.println(result);
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredHistoricalCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
}
