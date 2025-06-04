package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;
import io.swagger.client.api.PortfolioApi;

public class SCPTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApi apiInstance = new OrderApi();

        try {
            GetOrderBookResponse result = apiInstance.getOrderBook("2.0");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Error in fetching order book: " + e.getResponseBody());
        }

        try {
            GetOrderDetailsResponse result = apiInstance.getOrderStatus("250604000121443");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Error in fetching order book: " + e.getResponseBody());
        }

        try {
            GetOrderResponse result = apiInstance.getOrderDetails("2.0","250604000121443",null);
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Error in fetching order book: " + e.getResponseBody());
        }

        try {
            GetTradeResponse result = apiInstance.getTradeHistory("2.0");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Error in fetching order book: " + e.getResponseBody());
        }

        try {
            GetTradeResponse result = apiInstance.getTradesByOrder("250604000121443","2.0");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Error in fetching order book: " + e.getResponseBody());
        }

        PortfolioApi portfolioApi = new PortfolioApi();
        try {
            GetHoldingsResponse result = portfolioApi.getHoldings("2.0");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getHoldings");
            e.printStackTrace();
        }
        try {
            GetPositionResponse result = portfolioApi.getPositions("2.0");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPositions");
            e.printStackTrace();
        }
    }
}
