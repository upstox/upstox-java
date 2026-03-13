## Get ohlc market quotes

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteOHLCResponse;
import com.upstox.api.MarketQuoteApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketQuoteApi apiInstance = new MarketQuoteApi();
        String symbol = "NSE_EQ|INE848E01016";
        String interval = "1d";
        String apiVersion = "2.0";

        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC(symbol, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#getMarketQuoteOHLC");
            e.printStackTrace();
        }
    }
}
```

## Get ohlc market quotes for multiple instrument keys

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteOHLCResponse;
import com.upstox.api.MarketQuoteApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketQuoteApi apiInstance = new MarketQuoteApi();
        String symbol = "NSE_EQ|INE848E01016,NSE_EQ|INE669E01016";
        String interval = "1d";
        String apiVersion = "2.0";

        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC(symbol, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteApi#getMarketQuoteOHLC");
            e.printStackTrace();
        }
    }
}
```
