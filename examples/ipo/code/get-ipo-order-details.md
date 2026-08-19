## Get IPO order details

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoOrderDetailResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        IpoApi apiInstance = new IpoApi();

        // order_id as returned by the apply and IPO orders APIs
        String orderId = "{ipo_order_id}";

        try {
            IpoOrderDetailResponse result = apiInstance.getIpoOrderById(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoOrderById");
            e.printStackTrace();
        }
    }
}
```
