package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetFullMarketQuoteResponse;
import com.upstox.api.GetMarketQuoteLastTradedPriceResponse;
import com.upstox.api.GetMarketQuoteOHLCResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketQuoteApi;

public class MarketQuote {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        MarketQuoteApi apiInstance = new MarketQuoteApi();
//        String symbol = "NSE_EQ|INE669E01016"; // String | Comma separated list of symbols
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            GetFullMarketQuoteResponse result = apiInstance.getFullMarketQuote(symbol, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketQuoteApi#getFullMarketQuote");
//            e.printStackTrace();
//        }
//        String symbol = "NSE_EQ|INE669E01016"; // String | Comma separated list of symbols
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            GetMarketQuoteLastTradedPriceResponse result = apiInstance.ltp(symbol, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketQuoteApi#ltp");
//            e.printStackTrace();
//        }
        String apiVersion = "2.0";
        String symbol = "NSE_EQ|INE669E01016";
        String interval = "1d";
        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC(symbol, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#getMarketQuoteOHLC");
            e.printStackTrace();
        }
    }
}
