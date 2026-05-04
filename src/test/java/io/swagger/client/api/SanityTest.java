package io.swagger.client.api;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CancelOrderResponse;
import com.upstox.api.ConvertPositionRequest;
import com.upstox.api.ConvertPositionResponse;
import com.upstox.api.GetBrokerageResponse;
import com.upstox.api.GetFullMarketQuoteResponse;
import com.upstox.api.GetHistoricalCandleResponse;
import com.upstox.api.GetHoldingsResponse;
import com.upstox.api.GetIntraDayCandleResponse;
import com.upstox.api.GetMarketQuoteLastTradedPriceResponse;
import com.upstox.api.GetMarketQuoteOHLCResponse;
import com.upstox.api.GetOrderBookResponse;
import com.upstox.api.GetOrderResponse;
import com.upstox.api.GetPositionResponse;
import com.upstox.api.GetProfileResponse;
import com.upstox.api.GetProfitAndLossChargesResponse;
import com.upstox.api.GetTradeResponse;
import com.upstox.api.GetTradeWiseProfitAndLossDataResponse;
import com.upstox.api.GetTradeWiseProfitAndLossMetaDataResponse;
import com.upstox.api.GetUserFundMarginResponse;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderResponse;
import com.upstox.api.PlaceOrderRequest;
import com.upstox.api.PlaceOrderResponse;
import com.upstox.api.TokenResponse;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.auth.OAuth;

public class SanityTest {
    public static void main(String[] args) throws ApiException {
        String apiVersion = "2.0";
        String clientId = "<API_KEY>";
        String clientSecret = "<API_SECRET>";
        String redirectUri = "<APP_REDIRECTION_URL>";
        String authCode = "<AUTH_CODE>";
        String instrumentToken = "NSE_EQ|INE848E01016";
        String interval = "1d";

        // Configure OAuth2 access token for authorization: OAUTH2
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");

        // Login and authorization
        LoginApi loginApi = new LoginApi();
        TokenResponse tokenResponse = loginApi.token(apiVersion, authCode, clientId, clientSecret, redirectUri,
                "authorization_code");
        String accessToken = tokenResponse.getAccessToken();
        oAuth.setAccessToken(accessToken);

        // Get user profile
        UserApi userApi = new UserApi();
        GetProfileResponse userProfile = userApi.getProfile(apiVersion);
        System.out.println(userProfile);

        // Get funds and margin
        String segment = "SEC";
        GetUserFundMarginResponse fundMarginResponse = userApi.getUserFundMargin(apiVersion, segment);
        System.out.println(fundMarginResponse);

        // Get positions
        PortfolioApi portfolioApi = new PortfolioApi();
        GetPositionResponse positions = portfolioApi.getPositions(apiVersion);
        System.out.println(positions);

        // Get holdings
        GetHoldingsResponse holdings = portfolioApi.getHoldings(apiVersion);
        System.out.println(holdings);

        // Place order
        OrderApi orderApi = new OrderApi();
        PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest();
        placeOrderRequest.setQuantity(1);
        placeOrderRequest.setProduct(PlaceOrderRequest.ProductEnum.D);
        placeOrderRequest.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        placeOrderRequest.setPrice(40F);
        placeOrderRequest.setTag("string");
        placeOrderRequest.setInstrumentToken(instrumentToken);
        placeOrderRequest.setOrderType(PlaceOrderRequest.OrderTypeEnum.LIMIT);
        placeOrderRequest.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        placeOrderRequest.setDisclosedQuantity(0);
        placeOrderRequest.setTriggerPrice(0f);
        placeOrderRequest.setIsAmo(false);
        PlaceOrderResponse placeOrderResponse = orderApi.placeOrder(placeOrderRequest, apiVersion);
        System.out.println(placeOrderResponse);

        // Modify order
        ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest();
        modifyOrderRequest.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        modifyOrderRequest.setQuantity(1);
        modifyOrderRequest.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        modifyOrderRequest.setDisclosedQuantity(0);
        modifyOrderRequest.setTriggerPrice(0f);
        modifyOrderRequest.setPrice(41F);
        modifyOrderRequest.setOrderId(placeOrderResponse.getData()
                .getOrderId());
        ModifyOrderResponse modifyOrderResponse = orderApi.modifyOrder(modifyOrderRequest, apiVersion);
        System.out.println(modifyOrderResponse);

        // Cancel order
        CancelOrderResponse cancelOrderResponse = orderApi.cancelOrder(placeOrderResponse.getData()
                .getOrderId(), apiVersion);
        System.out.println(cancelOrderResponse);

        // Get trades by order
        GetTradeResponse tradesByOrder = orderApi.getTradesByOrder(placeOrderResponse.getData()
                .getOrderId(), apiVersion);
        System.out.println(tradesByOrder);

        // Get trade history
        GetTradeResponse tradeHistory = orderApi.getTradeHistory(apiVersion);
        System.out.println(tradeHistory);

        // Get order book
        GetOrderBookResponse orderBook = orderApi.getOrderBook(apiVersion);
        System.out.println(orderBook);

        // Get order details
        GetOrderResponse orderDetailsResponse = orderApi.getOrderDetails(apiVersion, placeOrderResponse.getData()
                .getOrderId(), null);
        System.out.println(orderDetailsResponse);

        // Place order CP
        PlaceOrderRequest placeOrderRequestCp = new PlaceOrderRequest();
        placeOrderRequestCp.setQuantity(1);
        placeOrderRequestCp.setProduct(PlaceOrderRequest.ProductEnum.D);
        placeOrderRequestCp.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        placeOrderRequestCp.setPrice(0F);
        placeOrderRequestCp.setTag("string");
        placeOrderRequestCp.setInstrumentToken(instrumentToken);
        placeOrderRequestCp.setOrderType(PlaceOrderRequest.OrderTypeEnum.MARKET);
        placeOrderRequestCp.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        placeOrderRequestCp.setDisclosedQuantity(0);
        placeOrderRequestCp.setTriggerPrice(0f);
        placeOrderRequestCp.setIsAmo(false);
        PlaceOrderResponse placeOrderCpResponse = orderApi.placeOrder(placeOrderRequestCp, apiVersion);
        System.out.println(placeOrderCpResponse);

        // Convert positions
        ConvertPositionRequest convertPositionRequest = new ConvertPositionRequest();
        convertPositionRequest.setInstrumentToken(instrumentToken);
        convertPositionRequest.setNewProduct(ConvertPositionRequest.NewProductEnum.I);
        convertPositionRequest.setOldProduct(ConvertPositionRequest.OldProductEnum.D);
        convertPositionRequest.setTransactionType(ConvertPositionRequest.TransactionTypeEnum.BUY);
        convertPositionRequest.setQuantity(1);
        ConvertPositionResponse convertPositionsResponse = portfolioApi.convertPositions(convertPositionRequest,
                apiVersion);
        System.out.println(convertPositionsResponse);

        // Get full market quote
        MarketQuoteApi marketQuoteApi = new MarketQuoteApi();
        GetFullMarketQuoteResponse fullMarketQuoteResponse = marketQuoteApi.getFullMarketQuote(instrumentToken,
                apiVersion);
        System.out.println(fullMarketQuoteResponse);

        // Get market quote OHLC
        GetMarketQuoteOHLCResponse marketQuoteOHLCResponse = marketQuoteApi.getMarketQuoteOHLC(instrumentToken,
                interval, apiVersion);
        System.out.println(marketQuoteOHLCResponse);

        // Get LTP
        GetMarketQuoteLastTradedPriceResponse ltpResponse = marketQuoteApi.ltp(instrumentToken, apiVersion);
        System.out.println(ltpResponse);

        // Get trade-wise profit and loss metadata
        TradeProfitAndLossApi tradeProfitAndLossApi = new TradeProfitAndLossApi();
        GetTradeWiseProfitAndLossMetaDataResponse tradeWiseProfitAndLossMetaDataResponse = tradeProfitAndLossApi
                .getTradeWiseProfitAndLossMetaData("EQ", "2223", apiVersion, null, null);
        System.out.println(tradeWiseProfitAndLossMetaDataResponse);

        // Get trade-wise profit and loss data
        GetTradeWiseProfitAndLossDataResponse tradeWiseProfitAndLossDataResponse = tradeProfitAndLossApi
                .getTradeWiseProfitAndLossData("EQ", "2223", 1, 100, apiVersion, null, null);
        System.out.println(tradeWiseProfitAndLossDataResponse);

        // Get profit and loss charges
        GetProfitAndLossChargesResponse getProfitAndLossChargesResponse = tradeProfitAndLossApi
                .getProfitAndLossCharges("EQ", "2223", apiVersion, null, null);
        System.out.println(getProfitAndLossChargesResponse);

        // Get historical candle data
        HistoryApi historyApi = new HistoryApi();
        GetHistoricalCandleResponse historicalCandleDataResponse = historyApi.getHistoricalCandleData(instrumentToken,
                "day", "2023-01-01", apiVersion);
        System.out.println(historicalCandleDataResponse);

        // Get intra-day candle data
        GetIntraDayCandleResponse intradayCandleDataResponse = historyApi.getIntraDayCandleData(instrumentToken,
                "30minute", apiVersion);
        System.out.println(intradayCandleDataResponse);

        // Get brokerage
        ChargeApi chargeApi = new ChargeApi();
        GetBrokerageResponse brokerageResponse = chargeApi.getBrokerage(instrumentToken, 56, "I", "BUY", 3.4F,
                apiVersion);
        System.out.println(brokerageResponse);

        // Get portfolio stream feed authorize
        WebsocketApi websocketApi = new WebsocketApi();
        WebsocketAuthRedirectResponse portfolioStreamFeedAuthorizeResponse = websocketApi
                .getPortfolioStreamFeedAuthorize(apiVersion);
        System.out.println(portfolioStreamFeedAuthorizeResponse);

        // Get market data feed authorize
        WebsocketAuthRedirectResponse marketDataFeedAuthorizeResponse = websocketApi
                .getMarketDataFeedAuthorize(apiVersion);
        System.out.println(marketDataFeedAuthorizeResponse);
    }
}
