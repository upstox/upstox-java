## Modify a delivery order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.OrderApiV3;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderV3Response;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        ModifyOrderRequest modifyOrderRequest1 = new ModifyOrderRequest();
        modifyOrderRequest1.setQuantity(2);
        modifyOrderRequest1.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        modifyOrderRequest1.setPrice(9F);
        modifyOrderRequest1.setDisclosedQuantity(0);
        modifyOrderRequest1.setTriggerPrice(0F);
        modifyOrderRequest1.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        modifyOrderRequest1.setOrderId("250128010532402");

        try {
            ModifyOrderV3Response result = apiInstance.modifyOrder(modifyOrderRequest1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApiV3->modifyOrder: " + e.getMessage());
        }
    }
}
```
