# PortfolioApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertPositions**](PortfolioApi.md#convertPositions) | **PUT** /portfolio/convert-position | Convert Positions
[**getHoldings**](PortfolioApi.md#getHoldings) | **GET** /portfolio/long-term-holdings | Get Holdings
[**getPositions**](PortfolioApi.md#getPositions) | **GET** /portfolio/short-term-positions | Get Positions

<a name="convertPositions"></a>
# **convertPositions**
> ConvertPositionResponse convertPositions(body, apiVersion)

Convert Positions

Convert the margin product of an open position

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.PortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioApi apiInstance = new PortfolioApi();
ConvertPositionRequest body = new ConvertPositionRequest(); // ConvertPositionRequest | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    ConvertPositionResponse result = apiInstance.convertPositions(body, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#convertPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConvertPositionRequest**](ConvertPositionRequest.md)|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**ConvertPositionResponse**](ConvertPositionResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="getHoldings"></a>
# **getHoldings**
> GetHoldingsResponse getHoldings(apiVersion)

Get Holdings

Fetches the holdings which the user has bought/sold in previous trading sessions.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.PortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioApi apiInstance = new PortfolioApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetHoldingsResponse result = apiInstance.getHoldings(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetHoldingsResponse**](GetHoldingsResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getPositions"></a>
# **getPositions**
> GetPositionResponse getPositions(apiVersion)

Get Positions

Fetches the current positions for the user for the current day.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.PortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioApi apiInstance = new PortfolioApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetPositionResponse result = apiInstance.getPositions(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetPositionResponse**](GetPositionResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

