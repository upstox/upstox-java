# ChargeApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrokerage**](ChargeApi.md#getBrokerage) | **GET** /charges/brokerage | Brokerage details

<a name="getBrokerage"></a>
# **getBrokerage**
> GetBrokerageResponse getBrokerage(instrumentToken, quantity, product, transactionType, price, apiVersion)

Brokerage details

Compute Brokerage Charges

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ChargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ChargeApi apiInstance = new ChargeApi();
String instrumentToken = "instrumentToken_example"; // String | Key of the instrument
Integer quantity = 56; // Integer | Quantity with which the order is to be placed
String product = "product_example"; // String | Product with which the order is to be placed
String transactionType = "transactionType_example"; // String | Indicates whether its a BUY or SELL order
Float price = 3.4F; // Float | Price with which the order is to be placed
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetBrokerageResponse result = apiInstance.getBrokerage(instrumentToken, quantity, product, transactionType, price, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeApi#getBrokerage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentToken** | **String**| Key of the instrument |
 **quantity** | **Integer**| Quantity with which the order is to be placed | [enum: ]
 **product** | **String**| Product with which the order is to be placed |
 **transactionType** | **String**| Indicates whether its a BUY or SELL order |
 **price** | **Float**| Price with which the order is to be placed |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetBrokerageResponse**](GetBrokerageResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="postMargin"></a>
# **postMargin**
> PostMarginResponse postMargin(body)

Calculate Margin

Compute Margin

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.ChargeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

ChargeApi apiInstance = new ChargeApi();
MarginRequest body = new MarginRequest(); // MarginRequest | 
try {
    PostMarginResponse result = apiInstance.postMargin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeApi#postMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MarginRequest**](MarginRequest.md)|  |

### Return type

[**PostMarginResponse**](PostMarginResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

