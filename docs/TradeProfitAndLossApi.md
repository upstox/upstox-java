# TradeProfitAndLossApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfitAndLossCharges**](TradeProfitAndLossApi.md#getProfitAndLossCharges) | **GET** /trade/profit-loss/charges | Get profit and loss on trades
[**getTradeWiseProfitAndLossData**](TradeProfitAndLossApi.md#getTradeWiseProfitAndLossData) | **GET** /trade/profit-loss/data | Get Trade-wise Profit and Loss Report Data
[**getTradeWiseProfitAndLossMetaData**](TradeProfitAndLossApi.md#getTradeWiseProfitAndLossMetaData) | **GET** /trade/profit-loss/metadata | Get profit and loss meta data on trades

<a name="getProfitAndLossCharges"></a>
# **getProfitAndLossCharges**
> GetProfitAndLossChargesResponse getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate)

Get profit and loss on trades

This API gives the charges incurred by users for their trades

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.TradeProfitAndLossApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
String segment = "segment_example"; // String | Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives
String financialYear = "financialYear_example"; // String | Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122
String apiVersion = "apiVersion_example"; // String | API Version Header
String fromDate = "fromDate_example"; // String | Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
String toDate = "toDate_example"; // String | Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
try {
    GetProfitAndLossChargesResponse result = apiInstance.getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeProfitAndLossApi#getProfitAndLossCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segment** | **String**| Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives |
 **financialYear** | **String**| Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122 |
 **apiVersion** | **String**| API Version Header |
 **fromDate** | **String**| Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]
 **toDate** | **String**| Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]

### Return type

[**GetProfitAndLossChargesResponse**](GetProfitAndLossChargesResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getTradeWiseProfitAndLossData"></a>
# **getTradeWiseProfitAndLossData**
> GetTradeWiseProfitAndLossDataResponse getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate)

Get Trade-wise Profit and Loss Report Data

This API gives the data of the realised Profit and Loss report requested by a user

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.TradeProfitAndLossApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
String segment = "segment_example"; // String | Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives
String financialYear = "financialYear_example"; // String | Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122
Integer pageNumber = 56; // Integer | Page Number, the pages are starting from 1
Integer pageSize = 56; // Integer | Page size for pagination. The maximum page size value is obtained from P and L report metadata API.
String apiVersion = "apiVersion_example"; // String | API Version Header
String fromDate = "fromDate_example"; // String | Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
String toDate = "toDate_example"; // String | Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
try {
    GetTradeWiseProfitAndLossDataResponse result = apiInstance.getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segment** | **String**| Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives |
 **financialYear** | **String**| Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122 |
 **pageNumber** | **Integer**| Page Number, the pages are starting from 1 |
 **pageSize** | **Integer**| Page size for pagination. The maximum page size value is obtained from P and L report metadata API. |
 **apiVersion** | **String**| API Version Header |
 **fromDate** | **String**| Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]
 **toDate** | **String**| Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]

### Return type

[**GetTradeWiseProfitAndLossDataResponse**](GetTradeWiseProfitAndLossDataResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getTradeWiseProfitAndLossMetaData"></a>
# **getTradeWiseProfitAndLossMetaData**
> GetTradeWiseProfitAndLossMetaDataResponse getTradeWiseProfitAndLossMetaData(segment, financialYear, apiVersion, fromDate, toDate)

Get profit and loss meta data on trades

This API gives the data of the realised Profit and Loss report requested by a user

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.TradeProfitAndLossApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
String segment = "segment_example"; // String | Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives
String financialYear = "financialYear_example"; // String | Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122
String apiVersion = "apiVersion_example"; // String | API Version Header
String fromDate = "fromDate_example"; // String | Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
String toDate = "toDate_example"; // String | Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format
try {
    GetTradeWiseProfitAndLossMetaDataResponse result = apiInstance.getTradeWiseProfitAndLossMetaData(segment, financialYear, apiVersion, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossMetaData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segment** | **String**| Segment for which data is requested can be from the following options EQ - Equity,   FO - Futures and Options,   COM  - Commodity,   CD - Currency Derivatives |
 **financialYear** | **String**| Financial year for which data has been requested. Concatenation of last 2 digits of from year and to year Sample:for 2021-2022, financial_year will be 2122 |
 **apiVersion** | **String**| API Version Header |
 **fromDate** | **String**| Date from which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]
 **toDate** | **String**| Date till which data needs to be fetched. from_date and to_date should fall under the same financial year as mentioned in financial_year attribute. Date in dd-mm-yyyy format | [optional]

### Return type

[**GetTradeWiseProfitAndLossMetaDataResponse**](GetTradeWiseProfitAndLossMetaDataResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

