package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PlaceOrderRequest;
import com.upstox.api.PlaceOrderResponse;
import com.upstox.auth.*;
import io.swagger.client.api.OrderApi;

public class PlaceOrderTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApi apiInstance = new OrderApi();
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.MTF);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderRequest.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);

        String apiVersion = "2.0"; // String | API Version Header
        try {
            PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
        }
    }
}
