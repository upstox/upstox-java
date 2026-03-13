## Get order history for an order number

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetOrderResponse;
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
        String tag = null;

        try {
            GetOrderResponse result = apiInstance.getOrderDetails(apiVersion, orderId, tag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getOrderDetails");
            e.printStackTrace();
        }
    }
}
```
