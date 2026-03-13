## Get ltp (last traded price) market quotes

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteLastTradedPriceResponse;
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteLastTradedPriceResponse result = apiInstance.getLtp("NSE_EQ|INE848E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getLtp: " + e.getMessage());
        }
    }
}
```

## Get ltp (last traded price) market quotes for multiple instruments keys

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteLastTradedPriceResponse;
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteLastTradedPriceResponse result = apiInstance.getLtp("NSE_EQ|INE848E01016,NSE_EQ|INE669E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getLtp: " + e.getMessage());
        }
    }
}
```
