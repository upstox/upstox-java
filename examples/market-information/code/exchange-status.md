## Get market status for a particular exchange

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketStatusResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();

        try {
            GetMarketStatusResponse result = apiInstance.getMarketStatus("NSE");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
