package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GttModifyOrderRequest;
import com.upstox.api.GttPlaceOrderRequest;
import com.upstox.api.GttRule;
import com.upstox.api.GttTriggerOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.OrderApiV3;

import java.util.ArrayList;
import java.util.List;

public class GttModifyOrderV3Test {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        OrderApiV3 apiInstance = new OrderApiV3();
        GttModifyOrderRequest modifyOrderRequest = new GttModifyOrderRequest();
        modifyOrderRequest.setQuantity(2);
        modifyOrderRequest.setGttOrderId("GTT-C250300144712");
        modifyOrderRequest.setType(GttModifyOrderRequest.TypeEnum.MULTIPLE);
        List<GttRule> gttRules = new ArrayList<>();
        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7D);
        gttRules.add(entryRule);

        GttRule stopLossRule = new GttRule();
        stopLossRule.setStrategy(GttRule.StrategyEnum.STOPLOSS);
        stopLossRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        stopLossRule.setTriggerPrice(6D);
        gttRules.add(stopLossRule);

        GttRule targetRule = new GttRule();
        targetRule.setStrategy(GttRule.StrategyEnum.TARGET);
        targetRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        targetRule.setTriggerPrice(60D);
        gttRules.add(targetRule);

        modifyOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.modifyGTTOrder(modifyOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder ");
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
}
