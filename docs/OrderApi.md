# OrderApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelMultiOrder**](OrderApi.md#cancelMultiOrder) | **DELETE** /v2/order/multi/cancel | Cancel multi order
[**cancelOrder1**](OrderApi.md#cancelOrder1) | **DELETE** /v2/order/cancel | Cancel order
[**exitPositions**](OrderApi.md#exitPositions) | **POST** /v2/order/positions/exit | Exit all positions
[**getOrderBook**](OrderApi.md#getOrderBook) | **GET** /v2/order/retrieve-all | Get order book
[**getOrderDetails**](OrderApi.md#getOrderDetails) | **GET** /v2/order/history | Get order history
[**getOrderStatus**](OrderApi.md#getOrderStatus) | **GET** /v2/order/details | Get order details
[**getTradeHistory**](OrderApi.md#getTradeHistory) | **GET** /v2/order/trades/get-trades-for-day | Get trades
[**getTradesByOrder**](OrderApi.md#getTradesByOrder) | **GET** /v2/order/trades | Get trades for order
[**modifyOrder1**](OrderApi.md#modifyOrder1) | **PUT** /v2/order/modify | Modify order
[**placeMultiOrder**](OrderApi.md#placeMultiOrder) | **POST** /v2/order/multi/place | Place multi order
[**placeOrder1**](OrderApi.md#placeOrder1) | **POST** /v2/order/place | Place order

<a name="cancelMultiOrder"></a>
# **cancelMultiOrder**
> CancelOrExitMultiOrderResponse cancelMultiOrder(tag, segment)

Cancel multi order

API to cancel all the open or pending orders which can be applied to both AMO and regular orders.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String tag = "tag_example"; // String | The tag associated with the orders for which the orders must be cancelled
String segment = "segment_example"; // String | The segment for which the orders must be cancelled
try {
    CancelOrExitMultiOrderResponse result = apiInstance.cancelMultiOrder(tag, segment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancelMultiOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| The tag associated with the orders for which the orders must be cancelled | [optional]
 **segment** | **String**| The segment for which the orders must be cancelled | [optional]

### Return type

[**CancelOrExitMultiOrderResponse**](CancelOrExitMultiOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="cancelOrder1"></a>
# **cancelOrder1**
> CancelOrderResponse cancelOrder1(orderId)

Cancel order

Cancel order API can be used for two purposes: Cancelling an open order which could be an AMO or a normal order It is also used to EXIT a CO or OCO(bracket order)

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order ID for which the order must be cancelled
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    CancelOrderResponse result = apiInstance.cancelOrder(orderId, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order ID for which the order must be cancelled |
 **apiVersion** | **String**| API Version Header |

### Return type

[**CancelOrderResponse**](CancelOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="exitPositions"></a>
# **exitPositions**
> CancelOrExitMultiOrderResponse exitPositions(tag, segment)

Exit all positions

This API provides the functionality to exit all the positions 

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String tag = "tag_example"; // String | The tag associated with the positions for which the positions must be exit
String segment = "segment_example"; // String | The segment for which the positions must be exit
try {
    CancelOrExitMultiOrderResponse result = apiInstance.exitPositions(tag, segment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#exitPositions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| The tag associated with the positions for which the positions must be exit | [optional]
 **segment** | **String**| The segment for which the positions must be exit | [optional]

### Return type

[**CancelOrExitMultiOrderResponse**](CancelOrExitMultiOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getOrderBook"></a>
# **getOrderBook**
> GetOrderBookResponse getOrderBook(apiVersion)

Get order book

This API provides the list of orders placed by the user. The orders placed by the user is transient for a day and is cleared by the end of the trading session. This API returns all states of the orders, namely, open, pending, and filled ones.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetOrderBookResponse result = apiInstance.getOrderBook(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetOrderBookResponse**](GetOrderBookResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getOrderDetails"></a>
# **getOrderDetails**
> GetOrderResponse getOrderDetails(apiVersion, orderId, tag)

Get order details

This API provides the details of the particular order the user has placed. The orders placed by the user is transient for a day and are cleared by the end of the trading session. This API returns all states of the orders, namely, open, pending, and filled ones.  The order history can be requested either using order_id or tag.  If both the options are passed, the history of the order which precisely matches both the order_id and tag will be returned in the response.  If only the tag is passed, the history of all the associated orders which matches the tag will be shared in the response.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
String orderId = "orderId_example"; // String | The order reference ID for which the order history is required
String tag = "tag_example"; // String | The unique tag of the order for which the order history is being requested
try {
    GetOrderResponse result = apiInstance.getOrderDetails(apiVersion, orderId, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |
 **orderId** | **String**| The order reference ID for which the order history is required | [optional]
 **tag** | **String**| The unique tag of the order for which the order history is being requested | [optional]

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="getOrderStatus"></a>
# **getOrderStatus**
> GetOrderDetailsResponse getOrderStatus(orderId)

Get order details

This API provides the recent detail of the particular order the user has placed. The orders placed by the user is transient for a day and are cleared by the end of the trading session.\\n\\nThe order details can be requested using order_id.  

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order reference ID for which the order details is required
try {
    GetOrderDetailsResponse result = apiInstance.getOrderStatus(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order reference ID for which the order details is required | [optional]

### Return type

[**GetOrderDetailsResponse**](GetOrderDetailsResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getTradeHistory"></a>
# **getTradeHistory**
> GetTradeResponse getTradeHistory(apiVersion)

Get trades

Retrieve the trades executed for the day

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetTradeResponse result = apiInstance.getTradeHistory(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getTradeHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetTradeResponse**](GetTradeResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getTradesByOrder"></a>
# **getTradesByOrder**
> GetTradeResponse getTradesByOrder(orderId, apiVersion)

Get trades for order

Retrieve the trades executed for an order

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order ID for which the order to get order trades
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetTradeResponse result = apiInstance.getTradesByOrder(orderId, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getTradesByOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order ID for which the order to get order trades |
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetTradeResponse**](GetTradeResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="modifyOrder"></a>
# **modifyOrder**
> ModifyOrderResponse modifyOrder(body, apiVersion)

Modify order

This API allows you to modify an order. For modification orderId is mandatory. With orderId you need to send the optional parameter which needs to be modified. In case the optional parameters aren&#x27;t sent, the default will be considered from the original order

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
ModifyOrderRequest body = new ModifyOrderRequest(); // ModifyOrderRequest | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#modifyOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyOrderRequest**](ModifyOrderRequest.md)|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**ModifyOrderResponse**](ModifyOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

<a name="placeMultiOrder"></a>
# **placeMultiOrder**
> MultiOrderResponse placeMultiOrder(body)

Place multi order

This API allows you to place multiple orders to the exchange via Upstox.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
List<MultiOrderRequest> body = Arrays.asList(new MultiOrderRequest()); // List<MultiOrderRequest> | 
try {
    MultiOrderResponse result = apiInstance.placeMultiOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#placeMultiOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;MultiOrderRequest&gt;**](MultiOrderRequest.md)|  |

### Return type

[**MultiOrderResponse**](MultiOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="placeOrder1"></a>
# **placeOrder1**
> PlaceOrderResponse placeOrder1(body)

Place order

This API allows you to place an order to the exchange via Upstox.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

OrderApi apiInstance = new OrderApi();
PlaceOrderRequest body = new PlaceOrderRequest(); // PlaceOrderRequest | 
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlaceOrderRequest**](PlaceOrderRequest.md)|  |
 **apiVersion** | **String**| API Version Header |

### Return type

[**PlaceOrderResponse**](PlaceOrderResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

