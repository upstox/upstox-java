## Cancel an open order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CancelOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        String orderId = "240108010918222";

        try {
            CancelOrderResponse result = apiInstance.cancelOrder(orderId, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#cancelOrder");
            e.printStackTrace();
        }
    }
}
```
