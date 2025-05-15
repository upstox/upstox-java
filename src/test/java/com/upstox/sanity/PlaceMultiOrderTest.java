package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderRequest;
import com.upstox.api.MultiOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

import java.util.ArrayList;

public class PlaceMultiOrderTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest request1 = new MultiOrderRequest();
        request1.setQuantity(1);
        request1.setProduct(MultiOrderRequest.ProductEnum.MTF);
        request1.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request1.setPrice(0F);
        request1.setTag("java_sdk_tester1");
        request1.setInstrumentToken("NSE_EQ|INE669E01016");
        request1.orderType(MultiOrderRequest.OrderTypeEnum.MARKET);
        request1.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request1.setDisclosedQuantity(0);
        request1.setTriggerPrice(0F);
        request1.setIsAmo(true);
        request1.setCorrelationId("cid1");
        request1.setSlice(true);


        MultiOrderRequest request2 = new MultiOrderRequest();
        request2.setQuantity(1);
        request2.setProduct(MultiOrderRequest.ProductEnum.D);
        request2.setValidity(MultiOrderRequest.ValidityEnum.DAY);
        request2.setPrice(8.7F);
        request2.setTag("java_sdk_tester2");
        request2.setInstrumentToken("NSE_EQ|INE669E01016");
        request2.orderType(MultiOrderRequest.OrderTypeEnum.LIMIT);
        request2.setTransactionType(MultiOrderRequest.TransactionTypeEnum.BUY);
        request2.setDisclosedQuantity(0);
        request2.setTriggerPrice(0F);
        request2.setIsAmo(true);
        request2.setCorrelationId("cid2");
        request2.setSlice(true);

        String apiVersion = "2.0"; // String | API Version Header
        try {
            ArrayList<MultiOrderRequest> list = new ArrayList<>();
            list.add(request1);
            list.add(request2);
            MultiOrderResponse result = apiInstance.placeMultiOrder(list);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
}
