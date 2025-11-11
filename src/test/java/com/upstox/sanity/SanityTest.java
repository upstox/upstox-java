package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.*;

import java.util.ArrayList;
import java.util.List;

import static com.upstox.api.GetGttOrderResponse.StatusEnum.SUCCESS;

public class SanityTest {
    public static void main(String[] args) throws ApiException {
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
         getTradeHistory();
         getTradesByOrder();
         convertPosition();
         getTradeWiseProfitLossMetaData();
         historicalApis();
         marketQuote();
         optionChain();
         marketInformation();
         testPostTrade();
         testCalculateMargin();
         testOrderStatus();
         testCancelMultiOrder();
         testExitAllOrder();
         testPlaceMultiOrder();
         testV3Orders();
         maretQuoteV3Test();
         mtfPositionApiTest();
         historicalCandleV3test();
         expiredInstrumentTest();
         logout();
         testAllApisWithAlgoName();
    }
    public static void placeOrder(){
        OrderApi apiInstance = new OrderApi();
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(7F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderRequest.OrderTypeEnum.LIMIT);
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
        body.setPrice(7F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
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
        String toDate = "2025-06-30";
        String fromDate = "2025-06-12";
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
    private static void testCalculateMargin() throws ApiException {
        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument1 = new Instrument();
        instrument1.setInstrumentKey("NSE_EQ|INE669E01016");
        instrument1.setQuantity(1);
        instrument1.setProduct("D");
        instrument1.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument1);


        Instrument instrument2 = new Instrument();
        instrument2.setInstrumentKey("NSE_EQ|INE528G01035");
        instrument2.setQuantity(1);
        instrument2.setProduct("D");
        instrument2.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument2);
        PostMarginResponse response = api.postMargin(marginRequest);

    }

    private static void testPostTrade() throws ApiException {
        PostTradeApi api = new PostTradeApi();
        api.getTradesByDateRange("2023-04-01","2024-08-01",1,1000,null);
        api.getTradesByDateRange("2023-04-01","2024-08-01",1,1000,"EQ");
        api.getTradesByDateRange("2023-04-01","2024-08-01",1,1000,"MF");
        api.getTradesByDateRange("2023-04-01","2024-08-01",1,1000,"FO");
        api.getTradesByDateRange("2023-04-01","2024-08-01",1,1000,"COM");
    }

    private static void testOrderStatus() throws ApiException {
        OrderApi api = new OrderApi();
        try {
            GetOrderDetailsResponse result = api.getOrderStatus("240930010605591");
            System.out.println(result);
        }

        catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("Error in order status");
        }
    }

    private static void testCancelMultiOrder(){
        OrderApi apiInstance = new OrderApi();

        try {
            CancelOrExitMultiOrderResponse result = apiInstance.cancelMultiOrder("java_sdk_testing_tag_1","NSE_EQ");
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1109")) System.out.println("Error in cancel order");
        }
    }

    private static void testPlaceMultiOrder(){
        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest request1 = new MultiOrderRequest();
        request1.setQuantity(1);
        request1.setProduct(MultiOrderRequest.ProductEnum.D);
        request1.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request1.setPrice(7F);
        request1.setTag("java_sdk_tester1");
        request1.setInstrumentToken("NSE_EQ|INE669E01016");
        request1.orderType(MultiOrderRequest.OrderTypeEnum.LIMIT);
        request1.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request1.setDisclosedQuantity(0);
        request1.setTriggerPrice(0F);
        request1.setIsAmo(true);
        request1.setCorrelationId("cid1");
        request1.setSlice(true);


        MultiOrderRequest request2 = new MultiOrderRequest();
        request2.setQuantity(1);
        request2.setProduct(MultiOrderRequest.ProductEnum.D);
        request2.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request2.setPrice(8.7F);
        request2.setTag("java_sdk_tester2");
        request2.setInstrumentToken("NSE_EQ|INE669E01016");
        request2.orderType(MultiOrderRequest.OrderTypeEnum.LIMIT);
        request2.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request2.setDisclosedQuantity(0);
        request2.setTriggerPrice(0F);
        request2.setIsAmo(true);
        request2.setCorrelationId("cid2");
        request2.setSlice(true);

        String apiVersion = "2.0"; // String | API Version Header
        try {
            ArrayList<MultiOrderRequest> list = new ArrayList<>();
            list.add(request1);
            list.add(request2);
            MultiOrderResponse result = apiInstance.placeMultiOrder(list);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
    private static void testExitAllOrder(){
        OrderApi apiInstance = new OrderApi();

        try {
            CancelOrExitMultiOrderResponse result = apiInstance.exitPositions("java_sdk_testing_tag_1",null);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1111") && !e.getResponseBody().contains("UDAPI1113")) System.out.println("Error in exit all order");
        }
    }
    private static void testV3Orders(){
        OrderApiV3 apiInstance = new OrderApiV3();
        GttPlaceOrderRequest gttPlaceOrderRequest = new GttPlaceOrderRequest();
        gttPlaceOrderRequest.setQuantity(1);
        gttPlaceOrderRequest.setProduct(GttPlaceOrderRequest.ProductEnum.D);
        gttPlaceOrderRequest.setInstrumentToken("NSE_EQ|INE669E01016");
        gttPlaceOrderRequest.setType(GttPlaceOrderRequest.TypeEnum.MULTIPLE);
        gttPlaceOrderRequest.setTransactionType(GttPlaceOrderRequest.TransactionTypeEnum.BUY);
        List<GttRule> gttRules = new ArrayList<>();
        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7D);
        gttRules.add(entryRule);

        GttRule stopLossRule = new GttRule();
        stopLossRule.setStrategy(GttRule.StrategyEnum.STOPLOSS);
        stopLossRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        stopLossRule.setTriggerPrice(6D);
        gttRules.add(stopLossRule);

        GttRule targetRule = new GttRule();
        targetRule.setStrategy(GttRule.StrategyEnum.TARGET);
        targetRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        targetRule.setTriggerPrice(60D);
        gttRules.add(targetRule);

        gttPlaceOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.placeGTTOrder(gttPlaceOrderRequest);
            System.out.println("GTT place order => "  + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }


        GttModifyOrderRequest modifyOrderRequest = new GttModifyOrderRequest();
        modifyOrderRequest.setQuantity(2);
        modifyOrderRequest.setGttOrderId("GTT-C25040144712");
        modifyOrderRequest.setType(GttModifyOrderRequest.TypeEnum.MULTIPLE);
        modifyOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.modifyGTTOrder(modifyOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("error in modify gtt error");
        }

        GttCancelOrderRequest gttCancelOrderRequest = new GttCancelOrderRequest();
        gttCancelOrderRequest.setGttOrderId("GTT-C25040144712");
        try {
            GttTriggerOrderResponse result = apiInstance.cancelGTTOrder(gttCancelOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("error in cancel gtt error");
        }

        try {
            GetGttOrderResponse result = apiInstance.getGttOrderDetails("GTT-C25040144712");
            if(result.getStatus() != SUCCESS) System.out.println("error in get gtt order details");
        }
        catch (ApiException e) {
            System.err.println("Exception when calling get gtt order details ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1);
        body.setProduct(PlaceOrderV3Request.ProductEnum.D);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(9F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderV3Request.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);

        try {
            PlaceOrderV3Response result = apiInstance.placeOrder(body);
            System.out.println( "Place order v3 =>" + result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
        }

        ModifyOrderRequest modifyOrderRequest1 = new ModifyOrderRequest();
        modifyOrderRequest1.setQuantity(2);
        modifyOrderRequest1.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        modifyOrderRequest1.setPrice(9F);
        modifyOrderRequest1.setDisclosedQuantity(0);
        modifyOrderRequest1.setTriggerPrice(0F);
        modifyOrderRequest1.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        modifyOrderRequest1.setOrderId("250128010532402");
        try {
            ModifyOrderV3Response result = apiInstance.modifyOrder(modifyOrderRequest1);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) {
                System.err.println(e.getResponseBody());
            }
        }

        try {
            System.out.println(apiInstance.cancelOrder("250128010534339"));;
        }
        catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) {
                System.err.println(e.getResponseBody());
            }
        }

        LoginApi loginApi = new LoginApi();
        IndieUserTokenRequest indieUserTokenRequest = new IndieUserTokenRequest();
        indieUserTokenRequest.setClientSecret("naen");
        try {
            IndieUserInitTokenResponse indieUserInitTokenResponse = loginApi.initTokenRequestForIndieUser(indieUserTokenRequest, "e82");
            System.out.println(indieUserInitTokenResponse);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100069")) {
                System.err.println(e.getResponseBody());
            }
        }

    }
    private static void maretQuoteV3Test(){
        MarketQuoteV3Api marketQuoteV3Api = new MarketQuoteV3Api();

        try {
            GetMarketQuoteLastTradedPriceResponseV3 result = marketQuoteV3Api.getLtp("NSE_EQ|INE669E01016");
            if(result.getStatus() != GetMarketQuoteLastTradedPriceResponseV3.StatusEnum.SUCCESS){
                System.out.println("error in ltp market quote");
            }
        } catch (ApiException e) {
            System.out.println("Exception when calling MarketQuoteV3Api#getLtp");
            System.out.println("Status code: " + e.getCode());
        }
        try {
            GetMarketQuoteOHLCResponseV3 result = marketQuoteV3Api.getMarketQuoteOHLC("I1", "NSE_EQ|INE669E01016");
            if(result.getStatus() != GetMarketQuoteOHLCResponseV3.StatusEnum.SUCCESS){
                System.out.println("error in ohlc market quote");
            }
        } catch (ApiException e) {
            System.out.println("Exception when calling MarketQuoteV3Api#getMarketQuoteOHLC");
            System.out.println("Status code: " + e.getCode());
        }
        try {
            GetMarketQuoteOptionGreekResponseV3 response = marketQuoteV3Api.getMarketQuoteOptionGreek("NSE_FO|44822");
            if(response.getStatus() != GetMarketQuoteOptionGreekResponseV3.StatusEnum.SUCCESS){
                System.out.println("error in option greek market quote");
            }
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
            if(result.getStatus() != GetPositionResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        } catch (ApiException e) {
            System.out.println("Exception when calling PortfolioApi#getMtfPosition");
            System.out.println("Status code: " + e.getCode());
        }
    }
    private static void historicalCandleV3test(){
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData("NSE_EQ|INE669E01016", "weeks", 1, "2025-04-04");
            if(result.getStatus() != GetHistoricalCandleResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        }
        catch (ApiException e) {
            System.out.println("Exception when calling HistoryV3Api#getHistoricalCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE669E01016", "weeks", 1, "2025-04-04","2020-04-04");
            if(result.getStatus() != GetHistoricalCandleResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        }
        catch (ApiException e) {
            System.out.println("Exception when calling HistoryV3Api#getHistoricalCandleData1");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE669E01016", "minutes", 1);
            if(result.getStatus() != GetIntraDayCandleResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
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
            if(getExpiriesResponse.getStatus() != GetExpiriesResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        } catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredInstruments");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetExpiredFuturesContractResponse result = expiredInstrumentApi.getExpiredFutureContracts("NSE_INDEX|Nifty 50", "2025-04-24");
            if(result.getStatus() != GetExpiredFuturesContractResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredFutureContracts");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetOptionContractResponse result = expiredInstrumentApi.getExpiredOptionContracts("NSE_INDEX|Nifty 50", "2025-04-24");
            if(result.getStatus() != GetOptionContractResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredOptionsContracts");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
        try {
            GetHistoricalCandleResponse result = expiredInstrumentApi.getExpiredHistoricalCandleData("NSE_FO|54452|24-04-2025","30minute","2025-06-04","2002-06-04");
            if(result.getStatus() != GetHistoricalCandleResponse.StatusEnum.SUCCESS){
                System.out.println("error in mtf positions");
            }
        }
        catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredHistoricalCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
    
    public static void testAllApisWithAlgoName() {
        testPlaceOrderWithAlgoName();
        testModifyOrderWithAlgoName();
        testCancelOrderWithAlgoName();
        testPlaceMultiOrderWithAlgoName();
        testCancelMultiOrderWithAlgoName();
        testExitPositionsWithAlgoName();

        testPlaceOrderV3WithAlgoName();
        testModifyOrderV3WithAlgoName();
        testCancelOrderV3WithAlgoName();
        testPlaceGTTOrderWithAlgoName();
        testModifyGTTOrderWithAlgoName();
        testCancelGTTOrderWithAlgoName();

    }

    // V2 API AlgoName Tests
    
    private static void testPlaceOrderWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(7F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderRequest.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);

        String apiVersion = "2.0";
        String algoName = DataToken.algoName;
        
        try {
            apiInstance.placeOrder(body, apiVersion, algoName);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1052")) {
                System.out.println("error in place order with algoName");
                System.out.println(e.getResponseBody());
            }
        }
    }

    private static void testModifyOrderWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(7F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        body.setOrderId("240125010587640");
        
        String apiVersion = "2.0";
        String algoName = DataToken.algoName;
        
        try {
            ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion, algoName);
            System.out.println("ModifyOrder with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("Error in modify order with algoName");
        }
    }

    private static void testCancelOrderWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        String orderId = "240125010599037";
        String apiVersion = "2.0";
        String algoName = DataToken.algoName;
        
        try {
            CancelOrderResponse result = apiInstance.cancelOrder(orderId, apiVersion, algoName);
            System.out.println("CancelOrder with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("Error in cancel order with algoName");
        }
    }

    private static void testPlaceMultiOrderWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest request1 = new MultiOrderRequest();
        request1.setQuantity(1);
        request1.setProduct(MultiOrderRequest.ProductEnum.D);
        request1.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request1.setPrice(7F);
        request1.setTag("java_sdk_tester1_algoname");
        request1.setInstrumentToken("NSE_EQ|INE669E01016");
        request1.orderType(MultiOrderRequest.OrderTypeEnum.LIMIT);
        request1.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request1.setDisclosedQuantity(0);
        request1.setTriggerPrice(0F);
        request1.setIsAmo(true);
        request1.setCorrelationId("cid1_algoname");
        request1.setSlice(true);

        MultiOrderRequest request2 = new MultiOrderRequest();
        request2.setQuantity(1);
        request2.setProduct(MultiOrderRequest.ProductEnum.D);
        request2.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request2.setPrice(8.7F);
        request2.setTag("java_sdk_tester2_algoname");
        request2.setInstrumentToken("NSE_EQ|INE669E01016");
        request2.orderType(MultiOrderRequest.OrderTypeEnum.LIMIT);
        request2.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request2.setDisclosedQuantity(0);
        request2.setTriggerPrice(0F);
        request2.setIsAmo(true);
        request2.setCorrelationId("cid2_algoname");
        request2.setSlice(true);

        String algoName = DataToken.algoName;
        
        try {
            ArrayList<MultiOrderRequest> list = new ArrayList<>();
            list.add(request1);
            list.add(request2);
            MultiOrderResponse result = apiInstance.placeMultiOrder(list, algoName);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeMultiOrder with algoName");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }

    private static void testCancelMultiOrderWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        String algoName = DataToken.algoName;
        
        try {
            CancelOrExitMultiOrderResponse result = apiInstance.cancelMultiOrder("java_sdk_testing_tag_algoname", "NSE_EQ", algoName);
            System.out.println("CancelMultiOrder with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1109")) System.out.println("Error in cancel multi order with algoName");
        }
    }

    private static void testExitPositionsWithAlgoName() {
        OrderApi apiInstance = new OrderApi();
        String algoName = DataToken.algoName;
        
        try {
            CancelOrExitMultiOrderResponse result = apiInstance.exitPositions("java_sdk_testing_tag_algoname", null, algoName);
            System.out.println("ExitPositions with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI1111") && !e.getResponseBody().contains("UDAPI1113")) {
                System.out.println("Error in exit positions with algoName");
                System.out.println(e.getResponseBody());
            }
        }
    }

    // V3 API AlgoName Tests
    
    private static void testPlaceOrderV3WithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1);
        body.setProduct(PlaceOrderV3Request.ProductEnum.D);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(9F);
        body.setTag("algoname_test");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderV3Request.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);

        String algoName = DataToken.algoName;
        
        try {
            apiInstance.placeOrder(body, algoName);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApiV3#placeOrder with algoName");
            e.printStackTrace();
        }
    }

    private static void testModifyOrderV3WithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest();
        modifyOrderRequest.setQuantity(2);
        modifyOrderRequest.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        modifyOrderRequest.setPrice(9F);
        modifyOrderRequest.setDisclosedQuantity(0);
        modifyOrderRequest.setTriggerPrice(0F);
        modifyOrderRequest.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        modifyOrderRequest.setOrderId("250128010532402");
        
        String algoName = DataToken.algoName;
        
        try {
            ModifyOrderV3Response result = apiInstance.modifyOrder(modifyOrderRequest, algoName);
            System.out.println("ModifyOrderV3 with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) {
                System.err.println("Error in modify order V3 with algoName: " + e.getResponseBody());
            }
        }
    }

    private static void testCancelOrderV3WithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        String algoName = DataToken.algoName;
        
        try {
            CancelOrderV3Response result = apiInstance.cancelOrder("250128010534339", algoName);
            System.out.println("CancelOrderV3 with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) {
                System.err.println("Error in cancel order V3 with algoName: " + e.getResponseBody());
            }
        }
    }

    private static void testPlaceGTTOrderWithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        GttPlaceOrderRequest gttPlaceOrderRequest = new GttPlaceOrderRequest();
        gttPlaceOrderRequest.setQuantity(1);
        gttPlaceOrderRequest.setProduct(GttPlaceOrderRequest.ProductEnum.D);
        gttPlaceOrderRequest.setInstrumentToken("NSE_EQ|INE669E01016");
        gttPlaceOrderRequest.setType(GttPlaceOrderRequest.TypeEnum.MULTIPLE);
        gttPlaceOrderRequest.setTransactionType(GttPlaceOrderRequest.TransactionTypeEnum.BUY);
        
        List<GttRule> gttRules = new ArrayList<>();
        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7D);
        gttRules.add(entryRule);

        GttRule stopLossRule = new GttRule();
        stopLossRule.setStrategy(GttRule.StrategyEnum.STOPLOSS);
        stopLossRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        stopLossRule.setTriggerPrice(6D);
        gttRules.add(stopLossRule);

        GttRule targetRule = new GttRule();
        targetRule.setStrategy(GttRule.StrategyEnum.TARGET);
        targetRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        targetRule.setTriggerPrice(60D);
        gttRules.add(targetRule);

        gttPlaceOrderRequest.setRules(gttRules);
        String algoName = DataToken.algoName;

        try {
            apiInstance.placeGTTOrder(gttPlaceOrderRequest, algoName);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApiV3#placeGTTOrder with algoName");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }

    private static void testModifyGTTOrderWithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        GttModifyOrderRequest modifyOrderRequest = new GttModifyOrderRequest();
        modifyOrderRequest.setQuantity(2);
        modifyOrderRequest.setGttOrderId("GTT-C25040144712");
        modifyOrderRequest.setType(GttModifyOrderRequest.TypeEnum.MULTIPLE);
        
        List<GttRule> gttRules = new ArrayList<>();
        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7D);
        gttRules.add(entryRule);
        
        modifyOrderRequest.setRules(gttRules);
        String algoName = DataToken.algoName;

        try {
            GttTriggerOrderResponse result = apiInstance.modifyGTTOrder(modifyOrderRequest, algoName);
            System.out.println("ModifyGTTOrder with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("error in modify gtt with algoName");
        }
    }

    private static void testCancelGTTOrderWithAlgoName() {
        OrderApiV3 apiInstance = new OrderApiV3();
        GttCancelOrderRequest gttCancelOrderRequest = new GttCancelOrderRequest();
        gttCancelOrderRequest.setGttOrderId("GTT-C25040144712");
        String algoName = DataToken.algoName;
        
        try {
            GttTriggerOrderResponse result = apiInstance.cancelGTTOrder(gttCancelOrderRequest, algoName);
            System.out.println("CancelGTTOrder with AlgoName: " + result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100010")) System.out.println("error in cancel gtt with algoName");
        }
    }
}
