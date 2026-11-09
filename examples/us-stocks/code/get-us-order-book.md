## Get US order book

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsOrderBookResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksOrderApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksOrderApi apiInstance = new UsStocksOrderApi();

        try {
            UsOrderBookResponse result = apiInstance.getUsOrderBook();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#getUsOrderBook");
            e.printStackTrace();
        }
    }
}
```
