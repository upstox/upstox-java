# PostTradeApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTradesByDateRange**](PostTradeApi.md#getTradesByDateRange) | **GET** /v2/charges/historical-trades | Get historical trades

<a name="getTradesByDateRange"></a>
# **getTradesByDateRange**
> TradeHistoryResponse getTradesByDateRange(startDate, endDate, pageNumber, pageSize, segment)

Get historical trades

This API retrieves the trade history for a specified time interval.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.PostTradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

PostTradeApi apiInstance = new PostTradeApi();
String startDate = "startDate_example"; // String | Date from which trade history needs to be fetched. Date in YYYY-mm-dd format
String endDate = "endDate_example"; // String | Date till which history needs needs to be fetched. Date in YYYY-mm-dd format
Integer pageNumber = 56; // Integer | Page number for which you want to fetch trade history 
Integer pageSize = 56; // Integer | How many records you want for a page 
String segment = ""; // String | Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives MF - Mutual Funds
try {
    TradeHistoryResponse result = apiInstance.getTradesByDateRange(startDate, endDate, pageNumber, pageSize, segment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostTradeApi#getTradesByDateRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Date from which trade history needs to be fetched. Date in YYYY-mm-dd format |
 **endDate** | **String**| Date till which history needs needs to be fetched. Date in YYYY-mm-dd format |
 **pageNumber** | **Integer**| Page number for which you want to fetch trade history  |
 **pageSize** | **Integer**| How many records you want for a page  |
 **segment** | **String**| Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives MF - Mutual Funds | [optional]

### Return type

[**TradeHistoryResponse**](TradeHistoryResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

