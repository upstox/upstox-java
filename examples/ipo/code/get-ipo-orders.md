## Get IPO orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        IpoApi apiInstance = new IpoApi();

        // pageNumber starts at 1; both params are optional (pass null to use defaults)
        try {
            IpoOrderResponse result = apiInstance.getIpoOrders(1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoOrders");
            e.printStackTrace();
        }
    }
}
```
