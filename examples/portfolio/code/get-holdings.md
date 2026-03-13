## Get user holdings

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetHoldingsResponse;
import com.upstox.api.PortfolioApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        PortfolioApi apiInstance = new PortfolioApi();
        String apiVersion = "2.0";

        try {
            GetHoldingsResponse result = apiInstance.getHoldings(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getHoldings");
            e.printStackTrace();
        }
    }
}
```
