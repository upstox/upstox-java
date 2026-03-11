package com.upstox.sanity;

import com.upstox.ApiException;
import com.upstox.api.TokenResponse;
import io.swagger.client.api.LoginApi;

public class TokenTest {
    public static void main(String[] args) {
        LoginApi apiInstance = new LoginApi();
        String apiVersion = "2.0";
        String code = "{authCode}";
        String clientId = "{client_id}";
        String clientSecret = "{client_secret}";
        String redirectUri = "{redirect_url}";
        String grantType = "authorization_code";
        try {
            TokenResponse result = apiInstance.token(apiVersion, code, clientId, clientSecret, redirectUri, grantType,true);
            System.out.println(result);
        } catch (ApiException e) {
            if(!e.getResponseBody().contains("UDAPI100069")){
                System.err.println("Exception when calling LoginApi#token");
                e.printStackTrace();
            }

        }
    }
}
