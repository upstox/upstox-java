# MarketQuoteV3Api

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLtp**](MarketQuoteV3Api.md#getLtp) | **GET** /v3/market-quote/ltp | Market quotes and instruments - LTP quotes.
[**getMarketQuoteOHLC**](MarketQuoteV3Api.md#getMarketQuoteOHLC) | **GET** /v3/market-quote/ohlc | Market quotes and instruments - OHLC quotes
[**getMarketQuoteOptionGreek**](MarketQuoteV3Api.md#getMarketQuoteOptionGreek) | **GET** /v3/market-quote/option-greek | Market quotes and instruments - Option Greek

<a name="getLtp"></a>
# **getLtp**
> GetMarketQuoteLastTradedPriceResponseV3 getLtp(instrumentKey)

Market quotes and instruments - LTP quotes.

This API provides the functionality to retrieve the LTP quotes for one or more instruments.This API returns the LTPs of up to 500 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteV3Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();
String instrumentKey = "instrumentKey_example"; // String | Comma separated list of instrument keys
try {
    GetMarketQuoteLastTradedPriceResponseV3 result = apiInstance.getLtp(instrumentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteV3Api#getLtp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Comma separated list of instrument keys | [optional]

### Return type

[**GetMarketQuoteLastTradedPriceResponseV3**](GetMarketQuoteLastTradedPriceResponseV3.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getMarketQuoteOHLC"></a>
# **getMarketQuoteOHLC**
> GetMarketQuoteOHLCResponseV3 getMarketQuoteOHLC(interval, instrumentKey)

Market quotes and instruments - OHLC quotes

This API provides the functionality to retrieve the OHLC quotes for one or more instruments.This API returns the OHLC snapshots of up to 500 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteV3Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();
String interval = "interval_example"; // String | Interval to get ohlc data
String instrumentKey = "instrumentKey_example"; // String | Comma separated list of instrument keys
try {
    GetMarketQuoteOHLCResponseV3 result = apiInstance.getMarketQuoteOHLC(interval, instrumentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteV3Api#getMarketQuoteOHLC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interval** | **String**| Interval to get ohlc data |
 **instrumentKey** | **String**| Comma separated list of instrument keys | [optional]

### Return type

[**GetMarketQuoteOHLCResponseV3**](GetMarketQuoteOHLCResponseV3.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getMarketQuoteOptionGreek"></a>
# **getMarketQuoteOptionGreek**
> GetMarketQuoteOptionGreekResponseV3 getMarketQuoteOptionGreek(instrumentKey)

Market quotes and instruments - Option Greek

This API provides the functionality to retrieve the Option Greek data for one or more instruments.This API returns the Option Greek data of up to 500 instruments in one go.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketQuoteV3Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();
String instrumentKey = "instrumentKey_example"; // String | Comma separated list of instrument keys
try {
    GetMarketQuoteOptionGreekResponseV3 result = apiInstance.getMarketQuoteOptionGreek(instrumentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketQuoteV3Api#getMarketQuoteOptionGreek");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Comma separated list of instrument keys | [optional]

### Return type

[**GetMarketQuoteOptionGreekResponseV3**](GetMarketQuoteOptionGreekResponseV3.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

