package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetFullMarketQuoteResponseV3;
import com.upstox.api.MarketQuoteSymbolV3;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketQuoteV3Api;

import java.util.Map;

public class MarketQuoteV3ApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        // Single instrument
        try {
            GetFullMarketQuoteResponseV3 result = apiInstance.getFullMarketQuoteV3("NSE_EQ|INE160A01022");
            System.out.println(result);
            printQuotes(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api#getFullMarketQuoteV3 (single instrument)"
                    + " status=" + e.getCode());
            System.out.println(e.getResponseBody());
        }

        // Multiple instruments (comma separated)
        try {
            GetFullMarketQuoteResponseV3 result =
                    apiInstance.getFullMarketQuoteV3("NSE_EQ|INE160A01022,NSE_INDEX|Nifty 50");
            System.out.println(result);
            printQuotes(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api#getFullMarketQuoteV3 (multiple instruments)"
                    + " status=" + e.getCode());
            System.out.println(e.getResponseBody());
        }

        // Invalid instrument key - exercises the partial_success / error status path
        try {
            GetFullMarketQuoteResponseV3 result =
                    apiInstance.getFullMarketQuoteV3("NSE_EQ|INE160A01022,NSE_EQ|INVALID");
            System.out.println("status: " + result.getStatus());
            printQuotes(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api#getFullMarketQuoteV3 (invalid instrument)"
                    + " status=" + e.getCode());
            System.out.println(e.getResponseBody());
        }
    }

    private static void printQuotes(GetFullMarketQuoteResponseV3 result) {
        if (result == null || result.getData() == null) {
            System.out.println("No data returned");
            return;
        }
        for (Map.Entry<String, MarketQuoteSymbolV3> entry : result.getData().entrySet()) {
            MarketQuoteSymbolV3 quote = entry.getValue();
            // Typed accessors - these must compile as real types, not Object
            String symbol = quote.getSymbol();
            Double lastPrice = quote.getLastPrice();
            Long volume = quote.getVolume();
            Boolean casEligible = quote.getCasEligible();
            System.out.println(entry.getKey()
                    + " symbol=" + symbol
                    + " lastPrice=" + lastPrice
                    + " volume=" + volume
                    + " casEligible=" + casEligible
                    + " ohlc=" + quote.getOhlc()
                    + " depth=" + quote.getDepth());
        }
    }
}
