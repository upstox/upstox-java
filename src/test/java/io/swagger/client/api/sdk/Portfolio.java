package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ConvertPositionRequest;
import com.upstox.api.ConvertPositionResponse;
import com.upstox.api.GetHoldingsResponse;
import com.upstox.api.GetPositionResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.PortfolioApi;

public class Portfolio {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        PortfolioApi apiInstance = new PortfolioApi();
//        ConvertPositionRequest body = new ConvertPositionRequest();
//        body.setInstrumentToken("NSE_EQ|INE528G01035");
//        body.setNewProduct(ConvertPositionRequest.NewProductEnum.D);
//        body.setOldProduct(ConvertPositionRequest.OldProductEnum.I);
//        body.setQuantity(1);
//        body.setTransactionType(ConvertPositionRequest.TransactionTypeEnum.BUY);
//        String apiVersion = "2.0";
//        try {
//            ConvertPositionResponse result = apiInstance.convertPositions(body, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling PortfolioApi#convertPositions");
//            e.printStackTrace();
//        }
        String apiVersion = "2.0"; // String | API Version Header
        try {
            GetHoldingsResponse result = apiInstance.getHoldings(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getHoldings");
            e.printStackTrace();
        }
        try {
            GetPositionResponse result = apiInstance.getPositions(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPositions");
            e.printStackTrace();
        }
    }
}
