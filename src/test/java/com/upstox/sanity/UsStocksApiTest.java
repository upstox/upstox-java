package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketStatusResponse;
import com.upstox.api.GetUsExchangeTimingResponse;
import com.upstox.api.GetUsHolidayResponse;
import com.upstox.api.UsFundsResponse;
import com.upstox.api.UsHoldingsResponse;
import com.upstox.api.UsMarginRequest;
import com.upstox.api.UsMarginResponse;
import com.upstox.api.UsModifyOrderRequest;
import com.upstox.api.UsOrderBookResponse;
import com.upstox.api.UsOrderDetailsResponse;
import com.upstox.api.UsOrderEstimateRequest;
import com.upstox.api.UsOrderEstimateResponse;
import com.upstox.api.UsOrderResponse;
import com.upstox.api.UsPlaceOrderRequest;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsMarketHolidaysAndTimingsApi;
import io.swagger.client.api.UsStocksChargesApi;
import io.swagger.client.api.UsStocksFundsApi;
import io.swagger.client.api.UsStocksOrderApi;
import io.swagger.client.api.UsStocksPortfolioApi;

import java.math.BigDecimal;

/** Sanity calls for the US Stocks APIs. */
public class UsStocksApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        UsStocksOrderApi orderApi = new UsStocksOrderApi(defaultClient);
        UsStocksChargesApi chargesApi = new UsStocksChargesApi(defaultClient);
        UsStocksPortfolioApi portfolioApi = new UsStocksPortfolioApi(defaultClient);
        UsStocksFundsApi fundsApi = new UsStocksFundsApi(defaultClient);
        UsMarketHolidaysAndTimingsApi marketApi = new UsMarketHolidaysAndTimingsApi(defaultClient);

        String instrumentKey = "US_EQ|AAPL";
        String orderId = "1a9ecf08-e5f8-475c-a7c0-9056826d4b18";

        UsPlaceOrderRequest placeBody = new UsPlaceOrderRequest();
        placeBody.setInstrumentKey(instrumentKey);
        placeBody.setQuantity(new BigDecimal("1"));
        placeBody.setPrice(new BigDecimal("180.25"));
        placeBody.setOrderType(UsPlaceOrderRequest.OrderTypeEnum.LIMIT);
        placeBody.setTransactionType(UsPlaceOrderRequest.TransactionTypeEnum.BUY);
        placeBody.setValidity(UsPlaceOrderRequest.ValidityEnum.DAY);
        placeBody.setTag("sdk-sanity");
        try {
            UsOrderResponse result = orderApi.placeUsOrder(placeBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#placeUsOrder");
            System.out.println(e.getResponseBody());
        }

        UsPlaceOrderRequest amountBody = new UsPlaceOrderRequest();
        amountBody.setInstrumentKey(instrumentKey);
        amountBody.setAmount(new BigDecimal("25.00"));
        amountBody.setOrderType(UsPlaceOrderRequest.OrderTypeEnum.MARKET);
        amountBody.setTransactionType(UsPlaceOrderRequest.TransactionTypeEnum.BUY);
        amountBody.setValidity(UsPlaceOrderRequest.ValidityEnum.DAY);
        try {
            UsOrderResponse result = orderApi.placeUsOrder(amountBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#placeUsOrder (amount)");
            System.out.println(e.getResponseBody());
        }

        UsModifyOrderRequest modifyBody = new UsModifyOrderRequest();
        modifyBody.setOrderId(orderId);
        modifyBody.setInstrumentKey(instrumentKey);
        modifyBody.setQuantity(new BigDecimal("2"));
        modifyBody.setPrice(new BigDecimal("181.0"));
        modifyBody.setOrderType(UsModifyOrderRequest.OrderTypeEnum.LIMIT);
        modifyBody.setTransactionType(UsModifyOrderRequest.TransactionTypeEnum.BUY);
        modifyBody.setValidity(UsModifyOrderRequest.ValidityEnum.DAY);
        try {
            UsOrderResponse result = orderApi.modifyUsOrder(modifyBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#modifyUsOrder");
            System.out.println(e.getResponseBody());
        }

        try {
            UsOrderResponse result = orderApi.cancelUsOrder(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#cancelUsOrder");
            System.out.println(e.getResponseBody());
        }

        try {
            UsOrderBookResponse result = orderApi.getUsOrderBook();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#getUsOrderBook");
            System.out.println(e.getResponseBody());
        }

        try {
            UsOrderDetailsResponse result = orderApi.getUsOrderDetails(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#getUsOrderDetails");
            System.out.println(e.getResponseBody());
        }

        UsOrderEstimateRequest estimateBody = new UsOrderEstimateRequest();
        estimateBody.setInstrumentKey(instrumentKey);
        estimateBody.setQuantity(new BigDecimal("1"));
        estimateBody.setPrice(new BigDecimal("180.25"));
        estimateBody.setOrderType(UsOrderEstimateRequest.OrderTypeEnum.LIMIT);
        estimateBody.setTransactionType(UsOrderEstimateRequest.TransactionTypeEnum.BUY);
        try {
            UsOrderEstimateResponse result = orderApi.estimateUsOrder(estimateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#estimateUsOrder");
            System.out.println(e.getResponseBody());
        }

        UsMarginRequest marginBody = new UsMarginRequest();
        marginBody.addInstrumentsItem(estimateBody);
        try {
            UsMarginResponse result = chargesApi.calculateUsMargin(marginBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksChargesApi#calculateUsMargin");
            System.out.println(e.getResponseBody());
        }

        try {
            UsHoldingsResponse result = portfolioApi.getUsHoldings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksPortfolioApi#getUsHoldings");
            System.out.println(e.getResponseBody());
        }

        try {
            UsFundsResponse result = fundsApi.getUsFunds();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksFundsApi#getUsFunds");
            System.out.println(e.getResponseBody());
        }

        try {
            GetUsHolidayResponse result = marketApi.getUsHolidays();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsHolidays");
            System.out.println(e.getResponseBody());
        }

        try {
            GetUsHolidayResponse result = marketApi.getUsHoliday("2026-12-25");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsHoliday");
            System.out.println(e.getResponseBody());
        }

        try {
            GetUsExchangeTimingResponse result = marketApi.getUsExchangeTimings("2026-10-29");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsExchangeTimings");
            System.out.println(e.getResponseBody());
        }

        try {
            GetMarketStatusResponse result = marketApi.getUsMarketStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsMarketStatus");
            System.out.println(e.getResponseBody());
        }
    }
}
