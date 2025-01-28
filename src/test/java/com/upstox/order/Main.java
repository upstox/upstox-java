package com.upstox.order;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;
public class Main{
    public static void main(String[] args) throws ApiException {
        boolean sandbox = true;
        ApiClient sandboxClient = new ApiClient(sandbox);
        OAuth OAUTH2 = (OAuth) sandboxClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("YOUR_ACCESS_TOKEN");
        Configuration.setDefaultApiClient(sandboxClient);
        OrderApiV3 orderApiV3 = new OrderApiV3();
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(10);
        body.setProduct(PlaceOrderV3Request.ProductEnum.D);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(9F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderV3Request.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);
        body.setSlice(true);
        try {
            PlaceOrderV3Response result = orderApiV3.placeOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
        }
    }
}
