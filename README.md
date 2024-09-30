# Upstox Java SDK for API v2

## Introduction

The official Java client for communicating with the <a href="https://upstox.com/uplink/">Upstox API</a>.

Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.

- API version: v2

Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)

## Documentation.

<a href="https://upstox.com/developer/api-documentation">Upstox API Documentation</a>

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.upstox.api</groupId>
  <artifactId>upstox-java-sdk</artifactId>
  <version>1.8.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.upstox.api:upstox-java-sdk:1.8.0"
```

## Examples

[Sample Implementations](examples/) can be found within `/examples` folder.

- [Websocket Market data](examples/websocket/market_data/)
- [Websocket Order updates](examples/websocket/order_updates/)

## Documentation for API Endpoints

All URIs are relative to *https://api.upstox.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChargeApi* | [**getBrokerage**](docs/ChargeApi.md#getBrokerage) | **GET** /v2/charges/brokerage | Brokerage details
*ChargeApi* | [**postMargin**](docs/ChargeApi.md#postMargin) | **POST** /v2/charges/margin | Calculate Margin
*HistoryApi* | [**getHistoricalCandleData**](docs/HistoryApi.md#getHistoricalCandleData) | **GET** /v2/historical-candle/{instrumentKey}/{interval}/{to_date} | Historical candle data
*HistoryApi* | [**getHistoricalCandleData1**](docs/HistoryApi.md#getHistoricalCandleData1) | **GET** /v2/historical-candle/{instrumentKey}/{interval}/{to_date}/{from_date} | Historical candle data
*HistoryApi* | [**getIntraDayCandleData**](docs/HistoryApi.md#getIntraDayCandleData) | **GET** /v2/historical-candle/intraday/{instrumentKey}/{interval} | Intra day candle data
*LoginApi* | [**authorize**](docs/LoginApi.md#authorize) | **GET** /v2/login/authorization/dialog | Authorize API
*LoginApi* | [**autoLogin**](docs/LoginApi.md#autoLogin) | **GET** /v2/auth/auto-login | Auto Login
*LoginApi* | [**logout**](docs/LoginApi.md#logout) | **DELETE** /v2/logout | Logout
*LoginApi* | [**token**](docs/LoginApi.md#token) | **POST** /v2/login/authorization/token | Get token API
*MarketHolidaysAndTimingsApi* | [**getExchangeTimings**](docs/MarketHolidaysAndTimingsApi.md#getExchangeTimings) | **GET** /v2/market/timings/{date} | Get Exchange Timings on particular date
*MarketHolidaysAndTimingsApi* | [**getHoliday**](docs/MarketHolidaysAndTimingsApi.md#getHoliday) | **GET** /v2/market/holidays/{date} | Get Holiday on particular date
*MarketHolidaysAndTimingsApi* | [**getHolidays**](docs/MarketHolidaysAndTimingsApi.md#getHolidays) | **GET** /v2/market/holidays | Get Holiday list of current year
*MarketHolidaysAndTimingsApi* | [**getMarketStatus**](docs/MarketHolidaysAndTimingsApi.md#getMarketStatus) | **GET** /v2/market/status/{exchange} | Get Market status for particular exchange
*MarketQuoteApi* | [**getFullMarketQuote**](docs/MarketQuoteApi.md#getFullMarketQuote) | **GET** /v2/market-quote/quotes | Market quotes and instruments - Full market quotes
*MarketQuoteApi* | [**getMarketQuoteOHLC**](docs/MarketQuoteApi.md#getMarketQuoteOHLC) | **GET** /v2/market-quote/ohlc | Market quotes and instruments - OHLC quotes
*MarketQuoteApi* | [**ltp**](docs/MarketQuoteApi.md#ltp) | **GET** /v2/market-quote/ltp | Market quotes and instruments - LTP quotes.
*OptionsApi* | [**getOptionContracts**](docs/OptionsApi.md#getOptionContracts) | **GET** /v2/option/contract | Get option contracts
*OptionsApi* | [**getPutCallOptionChain**](docs/OptionsApi.md#getPutCallOptionChain) | **GET** /v2/option/chain | Get option chain
*OrderApi* | [**cancelOrder**](docs/OrderApi.md#cancelOrder) | **DELETE** /v2/order/cancel | Cancel order
*OrderApi* | [**getOrderBook**](docs/OrderApi.md#getOrderBook) | **GET** /v2/order/retrieve-all | Get order book
*OrderApi* | [**getOrderDetails**](docs/OrderApi.md#getOrderDetails) | **GET** /v2/order/history | Get order history
*OrderApi* | [**getOrderStatus**](docs/OrderApi.md#getOrderStatus) | **GET** /v2/order/details | Get order details
*OrderApi* | [**getTradeHistory**](docs/OrderApi.md#getTradeHistory) | **GET** /v2/order/trades/get-trades-for-day | Get trades
*OrderApi* | [**getTradesByOrder**](docs/OrderApi.md#getTradesByOrder) | **GET** /v2/order/trades | Get trades for order
*OrderApi* | [**modifyOrder**](docs/OrderApi.md#modifyOrder) | **PUT** /v2/order/modify | Modify order
*OrderApi* | [**placeOrder**](docs/OrderApi.md#placeOrder) | **POST** /v2/order/place | Place order
*PortfolioApi* | [**convertPositions**](docs/PortfolioApi.md#convertPositions) | **PUT** /v2/portfolio/convert-position | Convert Positions
*PortfolioApi* | [**getHoldings**](docs/PortfolioApi.md#getHoldings) | **GET** /v2/portfolio/long-term-holdings | Get Holdings
*PortfolioApi* | [**getPositions**](docs/PortfolioApi.md#getPositions) | **GET** /v2/portfolio/short-term-positions | Get Positions
*PostTradeApi* | [**getTradesByDateRange**](docs/PostTradeApi.md#getTradesByDateRange) | **GET** /v2/charges/historical-trades | Get historical trades
*TradeProfitAndLossApi* | [**getProfitAndLossCharges**](docs/TradeProfitAndLossApi.md#getProfitAndLossCharges) | **GET** /v2/trade/profit-loss/charges | Get profit and loss on trades
*TradeProfitAndLossApi* | [**getTradeWiseProfitAndLossData**](docs/TradeProfitAndLossApi.md#getTradeWiseProfitAndLossData) | **GET** /v2/trade/profit-loss/data | Get Trade-wise Profit and Loss Report Data
*TradeProfitAndLossApi* | [**getTradeWiseProfitAndLossMetaData**](docs/TradeProfitAndLossApi.md#getTradeWiseProfitAndLossMetaData) | **GET** /v2/trade/profit-loss/metadata | Get profit and loss meta data on trades
*UserApi* | [**getProfile**](docs/UserApi.md#getProfile) | **GET** /v2/user/profile | Get profile
*UserApi* | [**getUserFundMargin**](docs/UserApi.md#getUserFundMargin) | **GET** /v2/user/get-funds-and-margin | Get User Fund And Margin
*WebsocketApi* | [**getMarketDataFeed**](docs/WebsocketApi.md#getMarketDataFeed) | **GET** /v2/feed/market-data-feed | Market Data Feed
*WebsocketApi* | [**getMarketDataFeedAuthorize**](docs/WebsocketApi.md#getMarketDataFeedAuthorize) | **GET** /v2/feed/market-data-feed/authorize | Market Data Feed Authorize
*WebsocketApi* | [**getPortfolioStreamFeed**](docs/WebsocketApi.md#getPortfolioStreamFeed) | **GET** /v2/feed/portfolio-stream-feed | Portfolio Stream Feed
*WebsocketApi* | [**getPortfolioStreamFeedAuthorize**](docs/WebsocketApi.md#getPortfolioStreamFeedAuthorize) | **GET** /v2/feed/portfolio-stream-feed/authorize | Portfolio Stream Feed Authorize

<br/>

## Documentation for Feeder Interfaces

Connecting to the WebSocket for market and portfolio updates is streamlined through two primary Feeder functions:

1. **MarketDataStreamer**: Offers real-time market updates, providing a seamless way to receive instantaneous information on various market instruments.
2. **PortfolioDataStreamer**: Delivers updates related to the user's orders, enhancing the ability to track order status and portfolio changes effectively.

Both functions are designed to simplify the process of subscribing to essential data streams, ensuring users have quick and easy access to the information they need.

### Detailed Explanation of Feeder Interfaces

### MarketDataStreamer

The `MarketDataStreamer` interface is designed for effortless connection to the market WebSocket, enabling users to receive instantaneous updates on various instruments. The following example demonstrates how to quickly set up and start receiving market updates for selected instrument keys:

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        Set<String> instrumentKeys = new HashSet<>();
        instrumentKeys.add("NSE_INDEX|Nifty 50");
        instrumentKeys.add("NSE_INDEX|Nifty Bank");

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient, instrumentKeys, Mode.FULL);

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}
```

In this example, you first authenticate using an access token, then instantiate MarketDataStreamer with specific instrument keys and a subscription mode. Upon connecting, the streamer listens for market updates, which are logged to the console as they arrive.

Feel free to adjust the access token placeholder and any other specifics to better fit your actual implementation or usage scenario.

### Exploring the MarketDataStreamer Functionality

#### Modes
- **Mode.LTPC**: ltpc provides information solely about the most recent trade, encompassing details such as the last trade price, time of the last trade, quantity traded, and the closing price from the previous day.
- **Mode.FULL**: The full option offers comprehensive information, including the latest trade prices, D5 depth, 1-minute, 30-minute, and daily candlestick data, along with some additional details.

#### Functions
1. **constructor MarketDataStreamer(apiClient)**: Initializes the streamer.
1. **constructor MarketDataStreamer(apiClient, instrumentKeys, mode)**: Initializes the streamer with instrument keys and mode (`Mode.FULL` or `Mode.LTPC`).
2. **connect()**: Establishes the WebSocket connection.
3. **subscribe(instrumentKeys, mode)**: Subscribes to updates for given instrument keys in the specified mode. Both parameters are mandatory.
4. **unsubscribe(instrumentKeys)**: Stops updates for the specified instrument keys.
5. **changeMode(instrumentKeys, mode)**: Switches the mode for already subscribed instrument keys.
6. **disconnect()**: Ends the active WebSocket connection.
7. **autoReconnect(enable)**: Enable/Disable the auto reconnect capability.
7. **autoReconnect(enable, interval, retryCount)**: Customizes auto-reconnect functionality. Parameters include a flag to enable/disable it, the interval(in seconds) between attempts, and the maximum number of retries.

#### Events Listeners
- **onOpenListener**: Called on successful connection establishment.
- **onCloseListener**: Called when WebSocket connection has been closed.
- **onMarketUpdateListener**: Delivers market updates.
- **onErrorListener**: Signals an error has occurred.
- **onReconnectingListener**: Announced when a reconnect attempt is initiated.
- **onAutoReconnectStoppedListener**: Informs when auto-reconnect efforts have ceased after exhausting the retry count.

The following documentation includes examples to illustrate the usage of these functions and events, providing a practical understanding of how to interact with the MarketDataStreamer effectively.

<br/>

1. Subscribing to Market Data on Connection Open with MarketDataStreamer

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys = new HashSet<>();
                instrumentKeys.add("NSE_INDEX|Nifty 50");
                instrumentKeys.add("NSE_INDEX|Nifty Bank");

                marketDataStreamer.subscribe(instrumentKeys, Mode.FULL);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}
```

<br/>

2. Subscribing to Instruments with Delays

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys1 = new HashSet<>();
                instrumentKeys1.add("NSE_INDEX|Nifty 50");

                marketDataStreamer.subscribe(instrumentKeys1, Mode.FULL);

                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

                scheduler.schedule(() -> {
                    Set<String> instrumentKeys2 = new HashSet<>();
                    instrumentKeys2.add("NSE_INDEX|Nifty Bank");
                    marketDataStreamer.subscribe(instrumentKeys2, Mode.FULL);
                    scheduler.shutdown();
                }, 5, TimeUnit.SECONDS);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}
```

<br/>

3. Subscribing and Unsubscribing to Instruments

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys = new HashSet<>();
                instrumentKeys.add("NSE_INDEX|Nifty 50");
                instrumentKeys.add("NSE_INDEX|Nifty Bank");

                marketDataStreamer.subscribe(instrumentKeys, Mode.FULL);

                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

                scheduler.schedule(() -> {
                    marketDataStreamer.unsubscribe(instrumentKeys);
                    scheduler.shutdown();
                }, 5, TimeUnit.SECONDS);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}
```

<br/>

4. Subscribe, Change Mode and Unsubscribe

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys = new HashSet<>();
                instrumentKeys.add("NSE_INDEX|Nifty 50");
                instrumentKeys.add("NSE_INDEX|Nifty Bank");

                marketDataStreamer.subscribe(instrumentKeys, Mode.FULL);

                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

                scheduler.schedule(() -> {
                    marketDataStreamer.changeMode(instrumentKeys, Mode.LTPC);
                    scheduler.shutdown();
                }, 5, TimeUnit.SECONDS);

                scheduler.schedule(() -> {
                    marketDataStreamer.unsubscribe(instrumentKeys);
                    scheduler.shutdown();
                }, 10, TimeUnit.SECONDS);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}
```

<br/>

5. Disable Auto-Reconnect

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnAutoReconnectStoppedListener(new OnAutoReconnectStoppedListener() {

            @Override
            public void onHault(String message) {
                System.out.println(message);

            }
        });

        marketDataStreamer.autoReconnect(false);
        marketDataStreamer.connect();
    }
}
```

<br/>

6. Modify Auto-Reconnect parameters

```java
public class MarketFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.autoReconnect(true, 10, 3);
        marketDataStreamer.connect();
    }
}
```

<br/>

### PortfolioDataStreamer

Connecting to the Portfolio WebSocket for real-time order updates is straightforward with the PortfolioDataStreamer class. Below is a concise guide to get you started on receiving updates:

```java
public class PortfolioFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(<ACCESS_TOKEN>);

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient);

        portfolioDataStreamer.setOnOrderUpdateListener(new OnOrderUpdateListener() {

            @Override
            public void onUpdate(OrderUpdate orderUpdate) {
                System.out.println(orderUpdate);

            }
        });

        portfolioDataStreamer.connect();
    }
}
```
<br/>

Position and holding updates can be enabled by setting the corresponding flag to `true` in the constructor of the `PortfolioDataStreamer` class.

```java
import com.upstox.feeder.HoldingUpdate;
import com.upstox.feeder.PositionUpdate;

public class PortfolioFeederTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken( < ACCESS_TOKEN >);

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient, true, true, true);

        portfolioDataStreamer.setOnOrderUpdateListener(new OnOrderUpdateListener() {

            @Override
            public void onUpdate(OrderUpdate orderUpdate) {
                System.out.println(orderUpdate);

            }
        });

        portfolioDataStreamer.setOnHoldingUpdateListener(new OnHoldingUpdateListener() {

            @Override
            public void onUpdate(HoldingUpdate holdingUpdate) {
                System.out.println(holdingUpdate);

            }
        });

        portfolioDataStreamer.setOnPositionUpdateListener(new OnPositionUpdateListener() {

            @Override
            public void onUpdate(PositionUpdate positionUpdate) {
                System.out.println(positionUpdate);

            }
        });

        portfolioDataStreamer.connect();
    }
}
```
<br/>
This example demonstrates initializing the PortfolioDataStreamer, connecting it to the WebSocket, and setting up an event listener to receive and print order updates. Replace <ACCESS_TOKEN> with your valid access token to authenticate the session.

### Exploring the PortfolioDataStreamer Functionality

#### Functions
1. **constructor PortfolioDataStreamer(apiClient)**: Initializes the streamer.
2. **connect()**: Establishes the WebSocket connection.
6. **disconnect()**: Ends the active WebSocket connection.
7. **autoReconnect(enable)**: Enable/Disable the auto reconnect capability.
7. **autoReconnect(enable, interval, retryCount)**: Customizes auto-reconnect functionality. Parameters include a flag to enable/disable it, the interval(in seconds) between attempts, and the maximum number of retries.

#### Events Listeners
- **onOpenListener**: Called on successful connection establishment.
- **onCloseListener**: Called when WebSocket connection has been closed.
- **onOrderUpdateListener**: Delivers order updates.
- **onErrorListener**: Signals an error has occurred.
- **onReconnectingListener**: Announced when a reconnect attempt is initiated.
- **onAutoReconnectStoppedListener**: Informs when auto-reconnect efforts have ceased after exhausting the retry count.

<br/>

## Documentation for Models

 - [AnalyticsData](docs/AnalyticsData.md)
 - [ApiGatewayErrorResponse](docs/ApiGatewayErrorResponse.md)
 - [BrokerageData](docs/BrokerageData.md)
 - [BrokerageTaxes](docs/BrokerageTaxes.md)
 - [BrokerageWrapperData](docs/BrokerageWrapperData.md)
 - [CancelOrderData](docs/CancelOrderData.md)
 - [CancelOrderResponse](docs/CancelOrderResponse.md)
 - [ConvertPositionData](docs/ConvertPositionData.md)
 - [ConvertPositionRequest](docs/ConvertPositionRequest.md)
 - [ConvertPositionResponse](docs/ConvertPositionResponse.md)
 - [Depth](docs/Depth.md)
 - [DepthMap](docs/DepthMap.md)
 - [DpPlan](docs/DpPlan.md)
 - [ExchangeTimingData](docs/ExchangeTimingData.md)
 - [GetBrokerageResponse](docs/GetBrokerageResponse.md)
 - [GetExchangeTimingResponse](docs/GetExchangeTimingResponse.md)
 - [GetFullMarketQuoteResponse](docs/GetFullMarketQuoteResponse.md)
 - [GetHistoricalCandleResponse](docs/GetHistoricalCandleResponse.md)
 - [GetHoldingsResponse](docs/GetHoldingsResponse.md)
 - [GetHolidayResponse](docs/GetHolidayResponse.md)
 - [GetIntraDayCandleResponse](docs/GetIntraDayCandleResponse.md)
 - [GetMarketQuoteLastTradedPriceResponse](docs/GetMarketQuoteLastTradedPriceResponse.md)
 - [GetMarketQuoteOHLCResponse](docs/GetMarketQuoteOHLCResponse.md)
 - [GetMarketStatusResponse](docs/GetMarketStatusResponse.md)
 - [GetOptionChainResponse](docs/GetOptionChainResponse.md)
 - [GetOptionContractResponse](docs/GetOptionContractResponse.md)
 - [GetOrderBookResponse](docs/GetOrderBookResponse.md)
 - [GetOrderDetailsResponse](docs/GetOrderDetailsResponse.md)
 - [GetOrderResponse](docs/GetOrderResponse.md)
 - [GetPositionResponse](docs/GetPositionResponse.md)
 - [GetProfileResponse](docs/GetProfileResponse.md)
 - [GetProfitAndLossChargesResponse](docs/GetProfitAndLossChargesResponse.md)
 - [GetTradeResponse](docs/GetTradeResponse.md)
 - [GetTradeWiseProfitAndLossDataResponse](docs/GetTradeWiseProfitAndLossDataResponse.md)
 - [GetTradeWiseProfitAndLossMetaDataResponse](docs/GetTradeWiseProfitAndLossMetaDataResponse.md)
 - [GetUserFundMarginResponse](docs/GetUserFundMarginResponse.md)
 - [HistoricalCandleData](docs/HistoricalCandleData.md)
 - [HoldingsData](docs/HoldingsData.md)
 - [HolidayData](docs/HolidayData.md)
 - [Instrument](docs/Instrument.md)
 - [InstrumentData](docs/InstrumentData.md)
 - [IntraDayCandleData](docs/IntraDayCandleData.md)
 - [LogoutResponse](docs/LogoutResponse.md)
 - [Margin](docs/Margin.md)
 - [MarginData](docs/MarginData.md)
 - [MarginRequest](docs/MarginRequest.md)
 - [MarketData](docs/MarketData.md)
 - [MarketQuoteOHLC](docs/MarketQuoteOHLC.md)
 - [MarketQuoteSymbol](docs/MarketQuoteSymbol.md)
 - [MarketQuoteSymbolLtp](docs/MarketQuoteSymbolLtp.md)
 - [MarketStatusData](docs/MarketStatusData.md)
 - [ModifyOrderData](docs/ModifyOrderData.md)
 - [ModifyOrderRequest](docs/ModifyOrderRequest.md)
 - [ModifyOrderResponse](docs/ModifyOrderResponse.md)
 - [OAuthClientException](docs/OAuthClientException.md)
 - [OAuthClientExceptionCause](docs/OAuthClientExceptionCause.md)
 - [OAuthClientExceptionCauseStackTrace](docs/OAuthClientExceptionCauseStackTrace.md)
 - [OAuthClientExceptionCauseSuppressed](docs/OAuthClientExceptionCauseSuppressed.md)
 - [Ohlc](docs/Ohlc.md)
 - [OptionStrikeData](docs/OptionStrikeData.md)
 - [OrderBookData](docs/OrderBookData.md)
 - [OrderData](docs/OrderData.md)
 - [OtherTaxes](docs/OtherTaxes.md)
 - [PlaceOrderData](docs/PlaceOrderData.md)
 - [PlaceOrderRequest](docs/PlaceOrderRequest.md)
 - [PlaceOrderResponse](docs/PlaceOrderResponse.md)
 - [PositionData](docs/PositionData.md)
 - [PostMarginResponse](docs/PostMarginResponse.md)
 - [Problem](docs/Problem.md)
 - [ProfileData](docs/ProfileData.md)
 - [ProfitAndLossChargesData](docs/ProfitAndLossChargesData.md)
 - [ProfitAndLossChargesTaxes](docs/ProfitAndLossChargesTaxes.md)
 - [ProfitAndLossChargesWrapperData](docs/ProfitAndLossChargesWrapperData.md)
 - [ProfitAndLossMetaData](docs/ProfitAndLossMetaData.md)
 - [ProfitAndLossMetaDataWrapper](docs/ProfitAndLossMetaDataWrapper.md)
 - [ProfitAndLossOtherChargesTaxes](docs/ProfitAndLossOtherChargesTaxes.md)
 - [PutCallOptionChainData](docs/PutCallOptionChainData.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TradeData](docs/TradeData.md)
 - [TradeHistoryResponse](docs/TradeHistoryResponse.md)
 - [TradeHistoryResponseMetaData](docs/TradeHistoryResponseMetaData.md)
 - [TradeHistoryResponsePageData](docs/TradeHistoryResponsePageData.md)
 - [TradeHistoryResponseTradeData](docs/TradeHistoryResponseTradeData.md)
 - [TradeWiseMetaData](docs/TradeWiseMetaData.md)
 - [TradeWiseProfitAndLossData](docs/TradeWiseProfitAndLossData.md)
 - [UserFundMarginData](docs/UserFundMarginData.md)
 - [WebsocketAuthRedirectResponse](docs/WebsocketAuthRedirectResponse.md)
 - [WebsocketAuthRedirectResponseData](docs/WebsocketAuthRedirectResponseData.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.