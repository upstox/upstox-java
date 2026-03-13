## Modify a delivery order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ModifyOrderRequest;
import com.upstox.api.ModifyOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        ModifyOrderRequest body = new ModifyOrderRequest();
        body.setQuantity(2);
        body.setValidity(ModifyOrderRequest.ValidityEnum.DAY);
        body.setPrice(16.8F);
        body.setOrderId("240108010918222");
        body.setOrderType(ModifyOrderRequest.OrderTypeEnum.LIMIT);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(16.9F);

        try {
            ModifyOrderResponse result = apiInstance.modifyOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#modifyOrder");
            e.printStackTrace();
        }
    }
}
```
