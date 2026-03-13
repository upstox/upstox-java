## Get order details for an order number

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetOrderDetailsResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();

        try {
            GetOrderDetailsResponse result = apiInstance.getOrderStatus("241017010620466");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->getOrderStatus: " + e.getMessage());
        }
    }
}
```
