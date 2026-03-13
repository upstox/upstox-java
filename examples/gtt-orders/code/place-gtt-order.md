## Place Single Leg GTT Order

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
        GttPlaceOrderRequest gttPlaceOrderRequest = new GttPlaceOrderRequest();
        gttPlaceOrderRequest.setQuantity(1);
        gttPlaceOrderRequest.setProduct(GttPlaceOrderRequest.ProductEnum.D);
        gttPlaceOrderRequest.setInstrumentToken("NSE_EQ|INE669E01016");
        gttPlaceOrderRequest.setType(GttPlaceOrderRequest.TypeEnum.SINGLE);
        gttPlaceOrderRequest.setTransactionType(GttPlaceOrderRequest.TransactionTypeEnum.BUY);

        List<GttRule> gttRules = new ArrayList<>();

        GttRule entryRule = new GttRule();
        entryRule.setStrategy(GttRule.StrategyEnum.ENTRY);
        entryRule.setTriggerType(GttRule.TriggerTypeEnum.ABOVE);
        entryRule.setTriggerPrice(7D);
        gttRules.add(entryRule);

        gttPlaceOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.placeGTTOrder(gttPlaceOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->placeGTTOrder: " + e.getMessage());
        }
    }
}
```

## Place Multiple Leg GTT Order

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
        GttPlaceOrderRequest gttPlaceOrderRequest = new GttPlaceOrderRequest();
        gttPlaceOrderRequest.setQuantity(1);
        gttPlaceOrderRequest.setProduct(GttPlaceOrderRequest.ProductEnum.D);
        gttPlaceOrderRequest.setInstrumentToken("NSE_EQ|INE669E01016");
        gttPlaceOrderRequest.setType(GttPlaceOrderRequest.TypeEnum.MULTIPLE);
        gttPlaceOrderRequest.setTransactionType(GttPlaceOrderRequest.TransactionTypeEnum.BUY);

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

        gttPlaceOrderRequest.setRules(gttRules);

        try {
            GttTriggerOrderResponse result = apiInstance.placeGTTOrder(gttPlaceOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->placeGTTOrder: " + e.getMessage());
        }
    }
}
```
