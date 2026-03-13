## Get ohlc market quotes

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketQuoteOHLCResponse;
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC("1d", "NSE_EQ|INE669E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getMarketQuoteOHLC: " + e.getMessage());
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
import com.upstox.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetMarketQuoteOHLCResponse result = apiInstance.getMarketQuoteOHLC("1d", "NSE_EQ|INE669E01016,NSE_EQ|INE848E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getMarketQuoteOHLC: " + e.getMessage());
        }
    }
}
```
