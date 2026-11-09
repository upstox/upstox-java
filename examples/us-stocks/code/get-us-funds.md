## Get US funds

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsFundsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksFundsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksFundsApi apiInstance = new UsStocksFundsApi();

        try {
            UsFundsResponse result = apiInstance.getUsFunds();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksFundsApi#getUsFunds");
            e.printStackTrace();
        }
    }
}
```
