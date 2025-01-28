package com.upstox.sanity;

import com.upstox.ApiException;
import com.upstox.api.IndieUserInitTokenResponse;
import com.upstox.api.IndieUserTokenRequest;
import io.swagger.client.api.LoginApi;

public class IndieTokenRequestTest {
    public static void main(String[] args) {
        LoginApi loginApi = new LoginApi();
        IndieUserTokenRequest indieUserTokenRequest = new IndieUserTokenRequest();
        indieUserTokenRequest.setClientSecret("");
        try {
            IndieUserInitTokenResponse indieUserInitTokenResponse = loginApi.initTokenRequestForIndieUser(indieUserTokenRequest, "");
            System.out.println(indieUserInitTokenResponse);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            throw new RuntimeException(e);
        }
    }
}
