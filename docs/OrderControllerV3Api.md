# OrderApiV3

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrderApiV3.md#cancelOrder) | **DELETE** /v3/order/cancel | 
[**modifyOrder**](OrderApiV3.md#modifyOrder) | **PUT** /v3/order/modify | 
[**placeOrder**](OrderApiV3.md#placeOrder) | **POST** /v3/order/place | 

<a name="cancelOrder"></a>
# **cancelOrder**
> CancelOrderV3Response cancelOrder(orderId, origin)



### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.OrderApiV3ontrollerV3Api apiInstance = new OrderApiV3();
String orderId = "orderId_example"; // String | 
String origin = "origin_example"; // String | 
try {
    CancelOrderV3Response result = apiInstance.cancelOrder(orderId, origin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApiV3#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  |
 **origin** | **String**|  | [optional]

### Return type

[**CancelOrderV3Response**](CancelOrderV3Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="modifyOrder"></a>
# **modifyOrder**
> ModifyOrderV3Response modifyOrder(body, origin)



### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.OrderApiV3ontrollerV3Api apiInstance = new OrderApiV3();
ModifyOrderRequest body = new ModifyOrderRequest(); // ModifyOrderRequest | 
String origin = "origin_example"; // String | 
try {
    ModifyOrderV3Response result = apiInstance.modifyOrder(body, origin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApiV3#modifyOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyOrderRequest**](ModifyOrderRequest.md)|  |
 **origin** | **String**|  | [optional]

### Return type

[**ModifyOrderV3Response**](ModifyOrderV3Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="placeOrder"></a>
# **placeOrder**
> PlaceOrderV3Response placeOrder(body, origin)



### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.OrderApiV3ontrollerV3Api apiInstance = new OrderApiV3();
PlaceOrderV3Request body = new PlaceOrderV3Request(); // PlaceOrderV3Request | 
String origin = "origin_example"; // String | 
try {
    PlaceOrderV3Response result = apiInstance.placeOrder(body, origin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApiV3#placeOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlaceOrderV3Request**](PlaceOrderV3Request.md)|  |
 **origin** | **String**|  | [optional]

### Return type

[**PlaceOrderV3Response**](PlaceOrderV3Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

