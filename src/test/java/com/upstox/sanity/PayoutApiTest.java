package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.InitiatePayoutRequest;
import com.upstox.api.ModifyPayoutRequest;
import com.upstox.api.PayoutDetailsResponse;
import com.upstox.api.PayoutModesResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UserApi;

public class PayoutApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        UserApi apiInstance = new UserApi();

        try {
            PayoutModesResponse result = apiInstance.getPayoutModes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getPayoutModes");
            System.out.println(e.getResponseBody());
        }

        InitiatePayoutRequest initiateBody = new InitiatePayoutRequest();
        initiateBody.setMode("NEFT");
        initiateBody.setAmount(5000.0);
        try {
            PayoutDetailsResponse result = apiInstance.initiatePayout(initiateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#initiatePayout");
            System.out.println(e.getResponseBody());
        }

        ModifyPayoutRequest modifyBody = new ModifyPayoutRequest();
        modifyBody.setAmount(6000.0);
        try {
            PayoutDetailsResponse result = apiInstance.modifyPayout(modifyBody, "sample-transaction-id");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#modifyPayout");
            System.out.println(e.getResponseBody());
        }

        try {
            PayoutDetailsResponse result = apiInstance.cancelPayout("sample-transaction-id");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#cancelPayout");
            System.out.println(e.getResponseBody());
        }
    }
}
