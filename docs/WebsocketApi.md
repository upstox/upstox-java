# WebsocketApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketDataFeed**](WebsocketApi.md#getMarketDataFeed) | **GET** /feed/market-data-feed | Market Data Feed
[**getMarketDataFeedAuthorize**](WebsocketApi.md#getMarketDataFeedAuthorize) | **GET** /feed/market-data-feed/authorize | Market Data Feed Authorize
[**getPortfolioStreamFeed**](WebsocketApi.md#getPortfolioStreamFeed) | **GET** /feed/portfolio-stream-feed | Portfolio Stream Feed
[**getPortfolioStreamFeedAuthorize**](WebsocketApi.md#getPortfolioStreamFeedAuthorize) | **GET** /feed/portfolio-stream-feed/authorize | Portfolio Stream Feed Authorize

<a name="getMarketDataFeed"></a>
# **getMarketDataFeed**
> getMarketDataFeed(apiVersion)

Market Data Feed

 This API redirects the client to the respective socket endpoint to receive Market updates.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.WebsocketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

WebsocketApi apiInstance = new WebsocketApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    apiInstance.getMarketDataFeed(apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsocketApi#getMarketDataFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

null (empty response body)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMarketDataFeedAuthorize"></a>
# **getMarketDataFeedAuthorize**
> WebsocketAuthRedirectResponse getMarketDataFeedAuthorize(apiVersion)

Market Data Feed Authorize

This API provides the functionality to retrieve the socket endpoint URI for Market updates.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.WebsocketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

WebsocketApi apiInstance = new WebsocketApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    WebsocketAuthRedirectResponse result = apiInstance.getMarketDataFeedAuthorize(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsocketApi#getMarketDataFeedAuthorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**WebsocketAuthRedirectResponse**](WebsocketAuthRedirectResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getPortfolioStreamFeed"></a>
# **getPortfolioStreamFeed**
> getPortfolioStreamFeed(apiVersion)

Portfolio Stream Feed

This API redirects the client to the respective socket endpoint to receive Portfolio updates.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.WebsocketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

WebsocketApi apiInstance = new WebsocketApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    apiInstance.getPortfolioStreamFeed(apiVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsocketApi#getPortfolioStreamFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

null (empty response body)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioStreamFeedAuthorize"></a>
# **getPortfolioStreamFeedAuthorize**
> WebsocketAuthRedirectResponse getPortfolioStreamFeedAuthorize(apiVersion)

Portfolio Stream Feed Authorize

 This API provides the functionality to retrieve the socket endpoint URI for Portfolio updates.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.WebsocketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

WebsocketApi apiInstance = new WebsocketApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    WebsocketAuthRedirectResponse result = apiInstance.getPortfolioStreamFeedAuthorize(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsocketApi#getPortfolioStreamFeedAuthorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**WebsocketAuthRedirectResponse**](WebsocketAuthRedirectResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

