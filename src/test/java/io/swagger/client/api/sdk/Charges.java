package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetBrokerageResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.ChargeApi;

public class Charges {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        ChargeApi apiInstance = new ChargeApi();
        String instrumentToken = "NSE_EQ|INE669E01016";
        int quantity = 56;
        String product = "I";
        String transactionType = "BUY";
        float price = 31.4F;
        String apiVersion = "2.0";
        try {
            GetBrokerageResponse result = apiInstance.getBrokerage(instrumentToken, quantity, product, transactionType, price, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChargeApi#getBrokerage");
            e.printStackTrace();
        }
    }
}
