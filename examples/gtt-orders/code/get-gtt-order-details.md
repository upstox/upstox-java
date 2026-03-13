## Get GTT Order Details

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetGttOrderResponse;
import com.upstox.api.OrderApiV3;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();

        try {
            GetGttOrderResponse result = apiInstance.getGttOrderDetails("GTT-C25040144712");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->getGttOrderDetails: " + e.getMessage());
        }
    }
}
```
