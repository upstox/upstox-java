# HistoryApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalCandleData**](HistoryApi.md#getHistoricalCandleData) | **GET** /historical-candle/{instrumentKey}/{interval}/{to_date} | Historical candle data
[**getHistoricalCandleData1**](HistoryApi.md#getHistoricalCandleData1) | **GET** /historical-candle/{instrumentKey}/{interval}/{to_date}/{from_date} | Historical candle data
[**getIntraDayCandleData**](HistoryApi.md#getIntraDayCandleData) | **GET** /historical-candle/intraday/{instrumentKey}/{interval} | Intra day candle data

<a name="getHistoricalCandleData"></a>
# **getHistoricalCandleData**
> GetHistoricalCandleResponse getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion)

Historical candle data

Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
String instrumentKey = "instrumentKey_example"; // String | 
String interval = "interval_example"; // String | 
String toDate = "toDate_example"; // String | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getHistoricalCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **interval** | **String**|  |
 **toDate** | **String**|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetHistoricalCandleResponse**](GetHistoricalCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getHistoricalCandleData1"></a>
# **getHistoricalCandleData1**
> GetHistoricalCandleResponse getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion)

Historical candle data

Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
String instrumentKey = "instrumentKey_example"; // String | 
String interval = "interval_example"; // String | 
String toDate = "toDate_example"; // String | 
String fromDate = "fromDate_example"; // String | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **interval** | **String**|  |
 **toDate** | **String**|  |
 **fromDate** | **String**|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetHistoricalCandleResponse**](GetHistoricalCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getIntraDayCandleData"></a>
# **getIntraDayCandleData**
> GetIntraDayCandleResponse getIntraDayCandleData(instrumentKey, interval, apiVersion)

Intra day candle data

Get OHLC values for all instruments for the present trading day

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
String instrumentKey = "instrumentKey_example"; // String | 
String interval = "interval_example"; // String | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, interval, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#getIntraDayCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **interval** | **String**|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetIntraDayCandleResponse**](GetIntraDayCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

