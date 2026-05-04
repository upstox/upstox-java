## Get payin history for the user

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.PaymentHistoryResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UserApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();

        try {
            PaymentHistoryResponse result = apiInstance.getPayinHistory();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getPayinHistory");
            e.printStackTrace();
        }
    }
}
```
