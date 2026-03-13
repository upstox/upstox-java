## Get ltp (last traded price) market quotes

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteLastTradedPriceResponse;
import com.upstox.api.MarketQuoteApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketQuoteApi apiInstance = new MarketQuoteApi();
        String symbol = "NSE_EQ|INE848E01016";
        String apiVersion = "2.0";

        try {
            GetMarketQuoteLastTradedPriceResponse result = apiInstance.ltp(symbol, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#ltp");
            e.printStackTrace();
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
import com.upstox.api.MarketQuoteApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketQuoteApi apiInstance = new MarketQuoteApi();
        String symbol = "NSE_EQ|INE848E01016,NSE_EQ|INE669E01016";
        String apiVersion = "2.0";

        try {
            GetMarketQuoteLastTradedPriceResponse result = apiInstance.ltp(symbol, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#ltp");
            e.printStackTrace();
        }
    }
}
```
