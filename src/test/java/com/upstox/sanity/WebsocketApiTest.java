package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import io.swagger.client.api.WebsocketApi;

public class WebsocketApiTest {
    public static void main(String[] args) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi();
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);
        System.out.println(websocketApi.getPortfolioStreamFeedAuthorize("2.0",false,false,false,true));
    }
}
