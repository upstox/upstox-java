# HistoryV3Api

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalCandleData**](HistoryV3Api.md#getHistoricalCandleData) | **GET** /v3/historical-candle/{instrumentKey}/{unit}/{interval}/{to_date} | Historical candle data
[**getHistoricalCandleData1**](HistoryV3Api.md#getHistoricalCandleData1) | **GET** /v3/historical-candle/{instrumentKey}/{unit}/{interval}/{to_date}/{from_date} | Historical candle data
[**getIntraDayCandleData**](HistoryV3Api.md#getIntraDayCandleData) | **GET** /v3/historical-candle/intraday/{instrumentKey}/{unit}/{interval} | Intra day candle data

<a name="getHistoricalCandleData"></a>
# **getHistoricalCandleData**
> GetHistoricalCandleResponse getHistoricalCandleData(instrumentKey, unit, interval, toDate)

Historical candle data

Get OHLC values for all instruments for the present trading day with expanded interval options.

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryV3Api;


HistoryV3Api apiInstance = new HistoryV3Api();
String instrumentKey = "instrumentKey_example"; // String | 
String unit = "unit_example"; // String | 
Integer interval = 56; // Integer | 
String toDate = "toDate_example"; // String | 
try {
    GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, unit, interval, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryV3Api#getHistoricalCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **unit** | **String**|  |
 **interval** | **Integer**|  |
 **toDate** | **String**|  |

### Return type

[**GetHistoricalCandleResponse**](GetHistoricalCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getHistoricalCandleData1"></a>
# **getHistoricalCandleData1**
> GetHistoricalCandleResponse getHistoricalCandleData1(instrumentKey, unit, interval, toDate, fromDate)

Historical candle data

Get OHLC values for all instruments for the present trading day with expanded interval options

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryV3Api;


HistoryV3Api apiInstance = new HistoryV3Api();
String instrumentKey = "instrumentKey_example"; // String | 
String unit = "unit_example"; // String | 
Integer interval = 56; // Integer | 
String toDate = "toDate_example"; // String | 
String fromDate = "fromDate_example"; // String | 
try {
    GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, unit, interval, toDate, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryV3Api#getHistoricalCandleData1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **unit** | **String**|  |
 **interval** | **Integer**|  |
 **toDate** | **String**|  |
 **fromDate** | **String**|  |

### Return type

[**GetHistoricalCandleResponse**](GetHistoricalCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getIntraDayCandleData"></a>
# **getIntraDayCandleData**
> GetIntraDayCandleResponse getIntraDayCandleData(instrumentKey, unit, interval)

Intra day candle data

Get OHLC values for all instruments for the present trading day

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.HistoryV3Api;


HistoryV3Api apiInstance = new HistoryV3Api();
String instrumentKey = "instrumentKey_example"; // String | 
String unit = "unit_example"; // String | 
Integer interval = 56; // Integer | 
try {
    GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, unit, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryV3Api#getIntraDayCandleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**|  |
 **unit** | **String**|  |
 **interval** | **Integer**|  |

### Return type

[**GetIntraDayCandleResponse**](GetIntraDayCandleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

