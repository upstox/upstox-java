## Modify Single Leg GTT Order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        List<GttRule> gttRules = new ArrayList<>();

        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7.3D);
        gttRules.add(entryRule);

        GttModifyOrderRequest modifyOrderRequest = new GttModifyOrderRequest();
        modifyOrderRequest.setQuantity(1);
        modifyOrderRequest.setGttOrderId("GTT-C25270200137952");
        modifyOrderRequest.setType(GttModifyOrderRequest.TypeEnum.SINGLE);
        modifyOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.modifyGTTOrder(modifyOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->modifyGTTOrder: " + e.getMessage());
        }
    }
}
```

## Modify Multiple Leg GTT Order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        List<GttRule> gttRules = new ArrayList<>();

        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7.3D);
        gttRules.add(entryRule);

        GttRule targetRule = new GttRule();
        targetRule.setStrategy(GttRule.StrategyEnum.TARGET);
        targetRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        targetRule.setTriggerPrice(7.64D);
        gttRules.add(targetRule);

        GttRule stopLossRule = new GttRule();
        stopLossRule.setStrategy(GttRule.StrategyEnum.STOPLOSS);
        stopLossRule.setTriggerType(GttRule.TriggerTypeEnum.IMMEDIATE);
        stopLossRule.setTriggerPrice(7.1D);
        gttRules.add(stopLossRule);

        GttModifyOrderRequest modifyOrderRequest = new GttModifyOrderRequest();
        modifyOrderRequest.setQuantity(1);
        modifyOrderRequest.setGttOrderId("GTT-C25280200137522");
        modifyOrderRequest.setType(GttModifyOrderRequest.TypeEnum.MULTIPLE);
        modifyOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.modifyGTTOrder(modifyOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->modifyGTTOrder: " + e.getMessage());
        }
    }
}
```
