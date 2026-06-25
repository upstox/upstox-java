## Get smartlist options

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();

        try {
            AnalyticsResponse result = apiInstance.getSmartlistOptions("EQUITY", "active", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketApi#getSmartlistOptions");
            e.printStackTrace();
        }
    }
}
```
