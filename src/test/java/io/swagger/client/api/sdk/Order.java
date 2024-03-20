package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApi;

public class Order {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        OrderApi apiInstance = new OrderApi();
//        PlaceOrderRequest body = new PlaceOrderRequest();
//        body.setQuantity(1);
//        body.setProduct(PlaceOrderRequest.ProductEnum.D);
//        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
//        body.setPrice(11.9F);
//        body.setTag("string");
//        body.setInstrumentToken("NSE_EQ|INE669E01016");
//        body.orderType(PlaceOrderRequest.OrderTypeEnum.LIMIT);
//        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
//        body.setDisclosedQuantity(0);
//        body.setTriggerPrice(0F);
//        body.setIsAmo(false);
//
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApi#placeOrder ");
//            e.printStackTrace();
//        }

//        ModifyOrderRequest body = new ModifyOrderRequest();
//        body.setQuantity(2);
//        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
//        body.setPrice(0F);
//        body.setDisclosedQuantity(0);
//        body.setTriggerPrice(0F);
//        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.MARKET);
//        body.setOrderId("240320010497680");
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApplaceOrder ");
//            e.printStackTrace();
//        }
//
//        String orderId = "240320010503009";
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            CancelOrderResponse result = apiInstance.cancelOrder(orderId,apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApi#placeOrder ");
//            e.printStackTrace();
//        }
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            GetOrderBookResponse result = apiInstance.getOrderBook(apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApi#placeOrder ");
//            e.printStackTrace();
//        }

//        String apiVersion = "2.0";
//        String orderId = "240320010497680";
//        String tag = "string";
//        try {
//            GetOrderResponse result = apiInstance.getOrderDetails(apiVersion, orderId, tag);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApi#getOrderDetails");
//            e.printStackTrace();
//        }
//        String apiVersion = "2.0"; // String | API Version Header
//        try {
//            GetTradeResponse result = apiInstance.getTradeHistory(apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling OrderApi#getTradeHistory");
//            e.printStackTrace();
//        }
        String apiVersion = "2.0";
        String orderId = "240125010587640";
        try {
            GetTradeResponse result = apiInstance.getTradesByOrder(orderId, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getTradesByOrder");
            e.printStackTrace();
        }
    }
}
