package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;
import io.swagger.client.api.OrderApiV3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SandboxSanityTest {
    private static final String apiVersion = "2.0";
    private static OrderApi orderApi;
    private static OrderApiV3 orderApiV3;
    @Before
    public void setUp() {
        boolean sandbox = true;
        ApiClient sandboxClient = new ApiClient(sandbox);
        OAuth OAUTH2 = (OAuth) sandboxClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.sandboxToken);
        Configuration.setDefaultApiClient(sandboxClient);
        orderApi = new OrderApi();
        orderApiV3 = new OrderApiV3();
    }
    @Test
    public void testPlaceOrder() {
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE669E01016");
        body.orderType(PlaceOrderRequest.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(true);
        try {
            PlaceOrderResponse response = orderApi.placeOrder(body, apiVersion);
            System.out.println(response.getData().getOrderId());
        } catch (Exception e) {
            e.printStackTrace();
            org.junit.Assert.fail("Placing order threw an exception: " + e.getMessage());
        }
//        try {
//            orderApi.exitPositions("","");
//        } catch (ApiException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Test
    public void testModifyOrder(){
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.MARKET);
        body.setOrderId("250123154054899");
        String apiVersion = "2.0"; // String | API Version Header
        try {
            ModifyOrderResponse result = orderApi.modifyOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            Assert.assertTrue(e.getResponseBody().contains("UDAPI100010"));
        }
    }

    @Test
    public void testCancelOrder(){
        String orderId = "250123154329565842";
        String apiVersion = "2.0"; // String | API Version Header
        try {
            CancelOrderResponse response =  orderApi.cancelOrder(orderId, apiVersion);
            System.out.println(response);
        } catch (ApiException e) {
            Assert.assertTrue(e.getResponseBody().contains("UDAPI100010"));
        }
    }

    @Test
    public void testMultiOrder(){
        MultiOrderRequest request1 = new MultiOrderRequest();
        request1.setQuantity(1);
        request1.setProduct(MultiOrderRequest.ProductEnum.D);
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

        try {
            ArrayList<MultiOrderRequest> list = new ArrayList<>();
            list.add(request1);
            list.add(request2);
            MultiOrderResponse result = orderApi.placeMultiOrder(list);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            org.junit.Assert.fail("Placing multi order threw an exception: " + e.getMessage());
        }
    }

    @Test
    public void testPlaceOrderV3(){
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1000000);
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

    @Test
    public void testModifyOrderV3(){
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.MARKET);
        body.setOrderId("250123154054899");
        try {
            ModifyOrderV3Response result = orderApiV3.modifyOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            Assert.assertTrue(e.getResponseBody().contains("UDAPI100010"));
        }
    }

    @Test
    public void testCancelOrderV3() {
        String orderId = "250123154329565842";
        try {
            CancelOrderV3Response response = orderApiV3.cancelOrder(orderId);
            System.out.println(response);
        } catch (ApiException e) {
            Assert.assertTrue(e.getResponseBody().contains("UDAPI100010"));
        }
    }
}
