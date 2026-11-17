## Get US holdings

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsHoldingsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksPortfolioApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksPortfolioApi apiInstance = new UsStocksPortfolioApi();

        try {
            UsHoldingsResponse result = apiInstance.getUsHoldings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksPortfolioApi#getUsHoldings");
            e.printStackTrace();
        }
    }
}
```
