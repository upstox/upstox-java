# OptionsApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionContracts**](OptionsApi.md#getOptionContracts) | **GET** /v2/option/contract | Get option contracts
[**getPutCallOptionChain**](OptionsApi.md#getPutCallOptionChain) | **GET** /v2/option/chain | Get option chain

<a name="getOptionContracts"></a>
# **getOptionContracts**
> GetOptionContractResponse getOptionContracts(instrumentKey, expiryDate)

Get option contracts

This API provides the functionality to retrieve the option contracts

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OptionsApi apiInstance = new OptionsApi();
String instrumentKey = "instrumentKey_example"; // String | Instrument key for an underlying symbol
String expiryDate = "expiryDate_example"; // String | Expiry date in format: YYYY-mm-dd
try {
    GetOptionContractResponse result = apiInstance.getOptionContracts(instrumentKey, expiryDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OptionsApi#getOptionContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Instrument key for an underlying symbol |
 **expiryDate** | **String**| Expiry date in format: YYYY-mm-dd | [optional]

### Return type

[**GetOptionContractResponse**](GetOptionContractResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getPutCallOptionChain"></a>
# **getPutCallOptionChain**
> GetOptionChainResponse getPutCallOptionChain(instrumentKey, expiryDate)

Get option chain

This API provides the functionality to retrieve the option chain

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OptionsApi apiInstance = new OptionsApi();
String instrumentKey = "instrumentKey_example"; // String | Instrument key for an underlying symbol
String expiryDate = "expiryDate_example"; // String | Expiry date in format: YYYY-mm-dd
try {
    GetOptionChainResponse result = apiInstance.getPutCallOptionChain(instrumentKey, expiryDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OptionsApi#getPutCallOptionChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentKey** | **String**| Instrument key for an underlying symbol |
 **expiryDate** | **String**| Expiry date in format: YYYY-mm-dd |

### Return type

[**GetOptionChainResponse**](GetOptionChainResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

