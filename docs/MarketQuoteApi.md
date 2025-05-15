# MarketQuoteApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFullMarketQuote**](MarketQuoteApi.md#getFullMarketQuote) | **GET** /market-quote/quotes | Market quotes and instruments - Full market quotes
[**getMarketQuoteOHLC**](MarketQuoteApi.md#getMarketQuoteOHLC) | **GET** /market-quote/ohlc | Market quotes and instruments - OHLC quotes
[**ltp**](MarketQuoteApi.md#ltp) | **GET** /market-quote/ltp | Market quotes and instruments - LTP quotes.

<a name="getFullMarketQuote"></a>
# **getFullMarketQuote**
> GetFullMarketQuoteResponse getFullMarketQuote(symbol, apiVersion)

Market quotes and instruments - Full market quotes

This API provides the functionality to retrieve the full market quotes for one or more instruments.This API returns the complete market data snapshot of up to 500 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteApi apiInstance = new MarketQuoteApi();
String symbol = "symbol_example"; // String | Comma separated list of symbols
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetFullMarketQuoteResponse result = apiInstance.getFullMarketQuote(symbol, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteApi#getFullMarketQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Comma separated list of symbols |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetFullMarketQuoteResponse**](GetFullMarketQuoteResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getMarketQuoteOHLC"></a>
# **getMarketQuoteOHLC**
> GetMarketQuoteOHLCResponse getMarketQuoteOHLC(symbol, interval, apiVersion)

Market quotes and instruments - OHLC quotes

This API provides the functionality to retrieve the OHLC quotes for one or more instruments.This API returns the OHLC snapshots of up to 1000 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteApi apiInstance = new MarketQuoteApi();
String symbol = "symbol_example"; // String | Comma separated list of symbols
String interval = "interval_example"; // String | Interval to get ohlc data
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC(symbol, interval, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteApi#getMarketQuoteOHLC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Comma separated list of symbols |
 **interval** | **String**| Interval to get ohlc data |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetMarketQuoteOHLCResponse**](GetMarketQuoteOHLCResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="ltp"></a>
# **ltp**
> GetMarketQuoteLastTradedPriceResponse ltp(symbol, apiVersion)

Market quotes and instruments - LTP quotes.

This API provides the functionality to retrieve the LTP quotes for one or more instruments.This API returns the LTPs of up to 1000 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteApi apiInstance = new MarketQuoteApi();
String symbol = "symbol_example"; // String | Comma separated list of symbols
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetMarketQuoteLastTradedPriceResponse result = apiInstance.ltp(symbol, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteApi#ltp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Comma separated list of symbols |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetMarketQuoteLastTradedPriceResponse**](GetMarketQuoteLastTradedPriceResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

