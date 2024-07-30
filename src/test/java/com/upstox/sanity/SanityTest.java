package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.*;

public class SanityTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);
        UserApi apiInstance = new UserApi();
        String apiVersion = "2.0";
        try {
            GetProfileResponse result = apiInstance.getProfile(apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getProfile");
            e.printStackTrace();
        }
        try {
            GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, "");
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMargin");
            e.printStackTrace();
        }
        ChargeApi apiInstance1 = new ChargeApi();
        String instrumentToken = "NSE_EQ|INE669E01016";
        int quantity = 56;
        String product = "D";
        String transactionType = "BUY";
        float price = 31.4F;
        try {
            GetBrokerageResponse result = apiInstance1.getBrokerage(instrumentToken, quantity, product, transactionType, price, apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargeApi#getBrokerage");
            e.printStackTrace();
        }
        placeOrder();
        modifyOrder();
        cancelOrder();
        getOrderBook();
        getOrderDetails();
        getTradeHistory(); //TODO
        getTradesByOrder(); //TODO
        convertPosition();
        getTradeWiseProfitLossMetaData();
        historicalApis();
        marketQuote();
        optionChain();
        marketInformation();
        logout();
    }
    public static void placeOrder(){
        OrderApi apiInstance = new OrderApi();
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderRequest.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);

        String apiVersion = "2.0"; // String | API Version Header
        try {
            PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1052")) System.out.println("error in place order");
        }
    }
    public static void modifyOrder(){
        OrderApi apiInstance = new OrderApi();
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.MARKET);
        body.setOrderId("240125010587640");
        String apiVersion = "2.0"; // String | API Version Header
        try {
            ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("Error in modify order");
        }
    }
    public static void cancelOrder(){
        OrderApi apiInstance = new OrderApi();
        String orderId = "240125010599037";
        String apiVersion = "2.0"; // String | API Version Header
        try {
            CancelOrderResponse result = apiInstance.cancelOrder(orderId,apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("Error in cancel order");
        }
    }
    public static void getOrderBook(){
        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0"; // String | API Version Header
        try {
            GetOrderBookResponse result = apiInstance.getOrderBook(apiVersion);
        } catch (ApiException e) {
            System.err.println("Error in order book");
            System.out.println(e.getResponseBody());
        }
    }
    public static void getOrderDetails(){
        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        String orderId = "240729010004302";
        String tag = "string";
        try {
            GetOrderResponse result = apiInstance.getOrderDetails(apiVersion, orderId, tag);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getOrderDetails");
            e.printStackTrace();
        }
    }
    public static void getTradeHistory(){
        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0"; // String | API Version Header
        try {
            GetTradeResponse result = apiInstance.getTradeHistory(apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getTradeHistory");
            e.printStackTrace();
        }
    }
    public static void getTradesByOrder(){

        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        String orderId = "240125010587640";
        try {
            GetTradeResponse result = apiInstance.getTradesByOrder(orderId, apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getTradesByOrder");
            e.printStackTrace();
        }
    }
    public static void convertPosition(){
        PortfolioApi apiInstance = new PortfolioApi();
        ConvertPositionRequest body = new ConvertPositionRequest();
        body.setInstrumentToken("NSE_EQ|INE528G01035");
        body.setNewProduct(ConvertPositionRequest.NewProductEnum.D);
        body.setOldProduct(ConvertPositionRequest.OldProductEnum.I);
        body.setQuantity(2);
        body.setTransactionType(ConvertPositionRequest.TransactionTypeEnum.BUY);
        String apiVersion = "2.0";
        try {
            ConvertPositionResponse result = apiInstance.convertPositions(body, apiVersion);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1035")) System.out.println("Error in convert Position");
        }
        try {
            GetHoldingsResponse result = apiInstance.getHoldings(apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getHoldings");
            e.printStackTrace();
        }try {
            GetPositionResponse result = apiInstance.getPositions(apiVersion);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPositions");
            e.printStackTrace();
        }
    }
    public static void getTradeWiseProfitLossMetaData(){
        TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
        String segment = "EQ";
        String financialYear = "2324";
        String apiVersion = "2.0";
        String fromDate = "02-04-2023";
        String toDate = "20-03-2024";
        try {
            GetTradeWiseProfitAndLossMetaDataResponse result = apiInstance.getTradeWiseProfitAndLossMetaData(segment, financialYear, apiVersion, fromDate, toDate);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossMetaData");
            e.printStackTrace();
        }
        try {
            GetTradeWiseProfitAndLossDataResponse result = apiInstance.getTradeWiseProfitAndLossData(segment, financialYear, 1, 5, apiVersion, fromDate, toDate);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossData");
            e.printStackTrace();
        }
        try {
            GetProfitAndLossChargesResponse result = apiInstance.getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getProfitAndLossCharges");
            e.printStackTrace();
        }
    }
    public static void historicalApis(){
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "1minute";
        String toDate = "2024-06-13";
        String fromDate = "2024-01-12";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            if(result.getStatus().equals(GetHistoricalCandleResponse.StatusEnum.ERROR)){
                System.out.println("error in historical api 1");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            if(result.getStatus().equals(GetHistoricalCandleResponse.StatusEnum.ERROR)){
                System.out.println("error in historical api");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
        try {
            GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, interval, apiVersion);
            if(result.getStatus().equals(GetIntraDayCandleResponse.StatusEnum.ERROR)){
                System.out.println("error in intraday candle");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getIntraDayCandleData");
            e.printStackTrace();
        }
    }
    public static void marketQuote(){
        MarketQuoteApi apiInstance = new MarketQuoteApi();
        String symbol = "NSE_EQ|INE669E01016"; // String | Comma separated list of symbols
        String apiVersion = "2.0"; // String | API Version Header
        try {
            GetFullMarketQuoteResponse result = apiInstance.getFullMarketQuote(symbol, apiVersion);
            if(result.getStatus().equals(GetFullMarketQuoteResponse.StatusEnum.ERROR)){
                System.out.println("error in full market quote");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#getFullMarketQuote");
            e.printStackTrace();
        }
        try {
            GetMarketQuoteLastTradedPriceResponse result = apiInstance.ltp(symbol, apiVersion);
            if(result.getStatus().equals(GetMarketQuoteLastTradedPriceResponse.StatusEnum.ERROR)){
                System.out.println("error in ltp market quote");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#ltp");
            e.printStackTrace();
        }
        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC(symbol, "1d", apiVersion);
            if(result.getStatus().equals(GetMarketQuoteOHLCResponse.StatusEnum.ERROR)){
                System.out.println("error in OHLC market quote");
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#getMarketQuoteOHLC");
            e.printStackTrace();
        }
    }
    public static void optionChain(){
        OptionsApi apiInstance = new OptionsApi();
        try{
            GetOptionContractResponse getOptionContractResponse = apiInstance.getOptionContracts("NSE_INDEX|Nifty 50","2024-08-01");
            if(getOptionContractResponse.getStatus().equals(GetOptionContractResponse.StatusEnum.ERROR)){
                System.out.println("error in option contract response");
            }

            GetOptionChainResponse getOptionChainResponse = apiInstance.getPutCallOptionChain("NSE_INDEX|Nifty 50","2024-08-01");
            if(getOptionChainResponse.getStatus().equals(GetOptionChainResponse.StatusEnum.ERROR)){
                System.out.println("error in option chain response");
            }

            getOptionContractResponse = apiInstance.getOptionContracts("NSE_INDEX|Nifty 50","");
            if(getOptionContractResponse.getStatus().equals(GetOptionContractResponse.StatusEnum.ERROR)){
                System.out.println("error in option contract response");
            }
        }
        catch (ApiException e){
            System.err.println("Exception in option chain api");
            e.printStackTrace();
        }
    }
    public static void marketInformation(){
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
        try{
            if(apiInstance.getMarketStatus("NSE").getStatus().equals(GetMarketStatusResponse.StatusEnum.ERROR)){
                System.out.println("error in market status");
            }
            if(apiInstance.getHoliday("2024-01-22").getStatus().equals(GetHolidayResponse.StatusEnum.ERROR)){
                System.out.println("error in get holiday");
            }
            if(apiInstance.getHolidays().getStatus().equals(GetHolidayResponse.StatusEnum.ERROR)){
                System.out.println("error in get holidays");
            }
            if(apiInstance.getExchangeTimings("2024-01-20").getStatus().equals(GetExchangeTimingResponse.StatusEnum.ERROR)){
                System.out.println("error in get exchange timings");
            }
        }
        catch (ApiException e){
            System.err.println("Exception in market information api");
            e.printStackTrace();
        }
    }
    public static void logout(){
        LoginApi apiInstance = new LoginApi();
        String apiVersion = "2.0";
        String code = "{your_code}";
        String clientId = "{your_clientId}";
        String clientSecret = "{your_clientSecret}";
        String redirectUri = "{your_redirect_url}";
        String grantType = "authorization_code";
        try {
            TokenResponse result = apiInstance.token(apiVersion, code, clientId, clientSecret, redirectUri, grantType);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100069")){
                System.err.println("Exception when calling LoginApi#token");
                e.printStackTrace();
            }

        }
        try {
            LogoutResponse result = apiInstance.logout(apiVersion);
            System.out.println(result.getStatus());
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#logout");
            e.printStackTrace();
        }
    }
}
