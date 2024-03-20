package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetProfileResponse;
import com.upstox.api.GetUserFundMarginResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UserApi;

public class User {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        UserApi apiInstance = new UserApi();
        String apiVersion = "2.0";
        try {
            GetProfileResponse result = apiInstance.getProfile(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getProfile");
            e.printStackTrace();
        }


        String segment = "";
        try {
            GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, segment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMargin");
            e.printStackTrace();
        }

    }
}
