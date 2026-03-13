## Get Option Greek fields

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteOptionGreekResponse;
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteOptionGreekResponse result = apiInstance.getMarketQuoteOptionGreek("NSE_FO|43885");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getMarketQuoteOptionGreek: " + e.getMessage());
        }
    }
}
```

## Get Option Greek fields for multiple instruments keys

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteOptionGreekResponse;
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteOptionGreekResponse result = apiInstance.getMarketQuoteOptionGreek("NSE_FO|38604,NSE_FO|49210");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getMarketQuoteOptionGreek: " + e.getMessage());
        }
    }
}
```
