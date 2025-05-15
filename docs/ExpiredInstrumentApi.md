# ExpiredInstrumentApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExpiredFutureContracts**](ExpiredInstrumentApi.md#getExpiredFutureContracts) | **GET** /v2/expired-instruments/future/contract | Expired instruments - Get future contracts
[**getExpiredHistoricalCandleData**](ExpiredInstrumentApi.md#getExpiredHistoricalCandleData) | **GET** /v2/expired-instruments/historical-candle/{expired_instrument_key}/{interval}/{to_date}/{from_date} | Expired Historical candle data
[**getExpiredOptionContracts**](ExpiredInstrumentApi.md#getExpiredOptionContracts) | **GET** /v2/expired-instruments/option/contract | Get expired option contracts
[**getExpiries**](ExpiredInstrumentApi.md#getExpiries) | **GET** /v2/expired-instruments/expiries | Expired instruments - Get expiries

<a name="getExpiredFutureContracts"></a>
# **getExpiredFutureContracts**
> GetExpiredFuturesContractResponse getExpiredFutureContracts(instrumentKey, expiryDate)

Expired instruments - Get future contracts

This API provides the functionality to retrieve expired future contracts for a given instrument key and expiry date.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ExpiredInstrumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ExpiredInstrumentApi apiInstance = new ExpiredInstrumentApi();
String instrumentKey = "instrumentKey_example"; // String | Instrument Key of asset
String expiryDate = "expiryDate_example"; // String | Expiry date of the instrument
try {
    GetExpiredFuturesContractResponse result = apiInstance.getExpiredFutureContracts(instrumentKey, expiryDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiredInstrumentApi#getExpiredFutureContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Instrument Key of asset |
 **expiryDate** | **String**| Expiry date of the instrument |

### Return type

[**GetExpiredFuturesContractResponse**](GetExpiredFuturesContractResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getExpiredHistoricalCandleData"></a>
# **getExpiredHistoricalCandleData**
> GetHistoricalCandleResponse getExpiredHistoricalCandleData(expiredInstrumentKey, interval, toDate, fromDate)

Expired Historical candle data

Get Expired OHLC values for all instruments across various timeframes. Expired Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ExpiredInstrumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ExpiredInstrumentApi apiInstance = new ExpiredInstrumentApi();
String expiredInstrumentKey = "expiredInstrumentKey_example"; // String | Expired Instrument Key of asset
String interval = "interval_example"; // String | Interval to get expired ohlc data
String toDate = "toDate_example"; // String | to date
String fromDate = "fromDate_example"; // String | from date
try {
    GetHistoricalCandleResponse result = apiInstance.getExpiredHistoricalCandleData(expiredInstrumentKey, interval, toDate, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiredInstrumentApi#getExpiredHistoricalCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiredInstrumentKey** | **String**| Expired Instrument Key of asset |
 **interval** | **String**| Interval to get expired ohlc data |
 **toDate** | **String**| to date |
 **fromDate** | **String**| from date |

### Return type

[**GetHistoricalCandleResponse**](GetHistoricalCandleResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getExpiredOptionContracts"></a>
# **getExpiredOptionContracts**
> GetOptionContractResponse getExpiredOptionContracts(instrumentKey, expiryDate)

Get expired option contracts

This API provides the functionality to retrieve the expired option contracts

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ExpiredInstrumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ExpiredInstrumentApi apiInstance = new ExpiredInstrumentApi();
String instrumentKey = "instrumentKey_example"; // String | Instrument key for an underlying symbol
String expiryDate = "expiryDate_example"; // String | Expiry date in format: YYYY-mm-dd
try {
    GetOptionContractResponse result = apiInstance.getExpiredOptionContracts(instrumentKey, expiryDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiredInstrumentApi#getExpiredOptionContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Instrument key for an underlying symbol |
 **expiryDate** | **String**| Expiry date in format: YYYY-mm-dd |

### Return type

[**GetOptionContractResponse**](GetOptionContractResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getExpiries"></a>
# **getExpiries**
> GetExpiriesResponse getExpiries(instrumentKey)

Expired instruments - Get expiries

This API provides the functionality to retrieve expiry dates for a given instrument key.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ExpiredInstrumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ExpiredInstrumentApi apiInstance = new ExpiredInstrumentApi();
String instrumentKey = "instrumentKey_example"; // String | Instrument Key of asset
try {
    GetExpiriesResponse result = apiInstance.getExpiries(instrumentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpiredInstrumentApi#getExpiries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Instrument Key of asset |

### Return type

[**GetExpiriesResponse**](GetExpiriesResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

