package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import com.upstox.auth.*;
import io.swagger.client.api.OrderApiV3;

public class PlaceOrderV3Test {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApiV3 apiInstance = new OrderApiV3();
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1);
        body.setProduct(PlaceOrderV3Request.ProductEnum.MTF);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(9F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderV3Request.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);

        String apiVersion = "2.0"; // String | API Version Header
        try {
            PlaceOrderV3Response result = apiInstance.placeOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
        }
    }
}
