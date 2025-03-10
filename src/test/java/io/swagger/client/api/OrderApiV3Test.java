/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import com.upstox.api.CancelOrderV3Response;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderV3Response;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for OrderApiV3
 */
@Ignore
public class OrderApiV3Test {

    private final OrderApiV3 api = new OrderApiV3();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws Exception {
        String orderId = null;
        String origin = null;
        CancelOrderV3Response response = api.cancelOrder(orderId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void modifyOrderTest() throws Exception {
        ModifyOrderRequest body = null;
        String origin = null;
        ModifyOrderV3Response response = api.modifyOrder(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws Exception {
        PlaceOrderV3Request body = null;
        String origin = null;
        PlaceOrderV3Response response = api.placeOrder(body);

        // TODO: test validations
    }
}
