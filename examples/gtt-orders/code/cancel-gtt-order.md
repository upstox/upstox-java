## Cancel GTT Order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GttCancelOrderRequest;
import com.upstox.api.GttTriggerOrderResponse;
import com.upstox.api.OrderApiV3;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        GttCancelOrderRequest gttCancelOrderRequest = new GttCancelOrderRequest();
        gttCancelOrderRequest.setGttOrderId("GTT-C25040144712");

        try {
            GttTriggerOrderResponse result = apiInstance.cancelGTTOrder(gttCancelOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->cancelGTTOrder: " + e.getMessage());
        }
    }
}
```
