# LoginApi

All URIs are relative to *https://api.upstox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](LoginApi.md#authorize) | **GET** /login/authorization/dialog | Authorize API
[**logout**](LoginApi.md#logout) | **DELETE** /logout | Logout
[**token**](LoginApi.md#token) | **POST** /login/authorization/token | Get token API

<a name="authorize"></a>
# **authorize**
> authorize(clientId, redirectUri, apiVersion, state, scope)

Authorize API

This provides details on the login endpoint.

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.LoginApi;


LoginApi apiInstance = new LoginApi();
String clientId = "clientId_example"; // String | 
String redirectUri = "redirectUri_example"; // String | 
String apiVersion = "apiVersion_example"; // String | API Version Header
String state = "state_example"; // String | 
String scope = "scope_example"; // String | 
try {
    apiInstance.authorize(clientId, redirectUri, apiVersion, state, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#authorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**|  |
 **redirectUri** | **String**|  |
 **apiVersion** | **String**| API Version Header |
 **state** | **String**|  | [optional]
 **scope** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

<a name="initTokenRequestForIndieUser"></a>
# **initTokenRequestForIndieUser**
> IndieUserInitTokenResponse initTokenRequestForIndieUser(body, clientId)

Init token API

This API provides the initialize the generate token and it&#x27;s expiry for an indie user

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.LoginApi;


LoginApi apiInstance = new LoginApi();
IndieUserTokenRequest body = new IndieUserTokenRequest(); // IndieUserTokenRequest | 
String clientId = "clientId_example"; // String | 
try {
    IndieUserInitTokenResponse result = apiInstance.initTokenRequestForIndieUser(body, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#initTokenRequestForIndieUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndieUserTokenRequest**](IndieUserTokenRequest.md)|  |
 **clientId** | **String**|  |

### Return type

[**IndieUserInitTokenResponse**](IndieUserInitTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

<a name="logout"></a>
# **logout**
> LogoutResponse logout(apiVersion)

Logout

Logout

### Example
```java
// Import classes:
//import com.upstox.ApiClient;
//import com.upstox.ApiException;
//import com.upstox.Configuration;
//import com.upstox.auth.*;
//import io.swagger.client.api.LoginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAUTH2
OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
OAUTH2.setAccessToken("YOUR ACCESS TOKEN");

LoginApi apiInstance = new LoginApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
try {
    LogoutResponse result = apiInstance.logout(apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

[OAUTH2](../README.md#OAUTH2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="token"></a>
# **token**
> TokenResponse token(apiVersion, code, clientId, clientSecret, redirectUri, grantType)

Get token API

This API provides the functionality to obtain opaque token from authorization_code exchange and also provides the user’s profile in the same response.

### Example
```java
// Import classes:
//import com.upstox.ApiException;
//import io.swagger.client.api.LoginApi;


LoginApi apiInstance = new LoginApi();
String apiVersion = "apiVersion_example"; // String | API Version Header
String code = "code_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
String redirectUri = "redirectUri_example"; // String | 
String grantType = "grantType_example"; // String | 
try {
    TokenResponse result = apiInstance.token(apiVersion, code, clientId, clientSecret, redirectUri, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#token");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiVersion** | **String**| API Version Header |
 **code** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]
 **redirectUri** | **String**|  | [optional]
 **grantType** | **String**|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, */*

