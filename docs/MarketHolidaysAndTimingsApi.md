# MarketHolidaysAndTimingsApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchangeTimings**](MarketHolidaysAndTimingsApi.md#getExchangeTimings) | **GET** /v2/market/timings/{date} | Get Exchange Timings on particular date
[**getHoliday**](MarketHolidaysAndTimingsApi.md#getHoliday) | **GET** /v2/market/holidays/{date} | Get Holiday on particular date
[**getHolidays**](MarketHolidaysAndTimingsApi.md#getHolidays) | **GET** /v2/market/holidays | Get Holiday list of current year
[**getMarketStatus**](MarketHolidaysAndTimingsApi.md#getMarketStatus) | **GET** /v2/market/status/{exchange} | Get Market status for particular exchange

<a name="getExchangeTimings"></a>
# **getExchangeTimings**
> GetExchangeTimingResponse getExchangeTimings(date)

Get Exchange Timings on particular date

This API provides the functionality to retrieve the exchange timings on particular date

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.MarketHolidaysAndTimingsApi;


MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
String date = "date_example"; // String | 
try {
    GetExchangeTimingResponse result = apiInstance.getExchangeTimings(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHolidaysAndTimingsApi#getExchangeTimings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  |

### Return type

[**GetExchangeTimingResponse**](GetExchangeTimingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getHoliday"></a>
# **getHoliday**
> GetHolidayResponse getHoliday(date)

Get Holiday on particular date

This API provides the functionality to retrieve the holiday on particular date

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.MarketHolidaysAndTimingsApi;


MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
String date = "date_example"; // String | 
try {
    GetHolidayResponse result = apiInstance.getHoliday(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHolidaysAndTimingsApi#getHoliday");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  |

### Return type

[**GetHolidayResponse**](GetHolidayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getHolidays"></a>
# **getHolidays**
> GetHolidayResponse getHolidays()

Get Holiday list of current year

This API provides the functionality to retrieve the holiday list of current year

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.MarketHolidaysAndTimingsApi;


MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
try {
    GetHolidayResponse result = apiInstance.getHolidays();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHolidaysAndTimingsApi#getHolidays");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHolidayResponse**](GetHolidayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getMarketStatus"></a>
# **getMarketStatus**
> GetMarketStatusResponse getMarketStatus(exchange)

Get Market status for particular exchange

This API provides the functionality to retrieve the market status for particular exchange

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.MarketHolidaysAndTimingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
String exchange = "exchange_example"; // String | 
try {
    GetMarketStatusResponse result = apiInstance.getMarketStatus(exchange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketHolidaysAndTimingsApi#getMarketStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **String**|  |

### Return type

[**GetMarketStatusResponse**](GetMarketStatusResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

