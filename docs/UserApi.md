# UserApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfile**](UserApi.md#getProfile) | **GET** /user/profile | Get profile
[**getUserFundMargin**](UserApi.md#getUserFundMargin) | **GET** /user/get-funds-and-margin | Get User Fund And Margin

<a name="getProfile"></a>
# **getProfile**
> GetProfileResponse getProfile(apiVersion)

Get profile

This API allows to fetch the complete information of the user who is logged in including the products, order types and exchanges enabled for the user

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    GetProfileResponse result = apiInstance.getProfile(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**GetProfileResponse**](GetProfileResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="getUserFundMargin"></a>
# **getUserFundMargin**
> GetUserFundMarginResponse getUserFundMargin(apiVersion, segment)

Get User Fund And Margin

Shows the balance of the user in equity and commodity market.

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
String segment = "segment_example"; // String | 
try {
    GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, segment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserFundMargin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |
 **segment** | **String**|  | [optional] [enum: SEC, COM]

### Return type

[**GetUserFundMarginResponse**](GetUserFundMarginResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

