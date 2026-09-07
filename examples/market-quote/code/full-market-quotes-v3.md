## Get full market quote

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetFullMarketQuoteResponseV3;
import io.swagger.client.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetFullMarketQuoteResponseV3 result = apiInstance.getFullMarketQuoteV3("NSE_EQ|INE848E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getFullMarketQuoteV3: " + e.getMessage());
        }
    }
}
```

## Get full market quote for multiple instrument keys

Up to 500 instrument keys can be requested in a single call.

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetFullMarketQuoteResponseV3;
import io.swagger.client.api.MarketQuoteV3Api;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetFullMarketQuoteResponseV3 result =
                    apiInstance.getFullMarketQuoteV3("NSE_EQ|INE848E01016,NSE_EQ|INE669E01016");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getFullMarketQuoteV3: " + e.getMessage());
        }
    }
}
```

## Read individual fields from the full market quote

The response `data` map is keyed by trading symbol and each value is a
`MarketQuoteSymbolV3` with typed accessors — including the call-auction
fields (`indicativeEquilibriumPrice`, `indicativeEquilibriumQuantity`,
`indicativeImbalanceQuantityTotal`, `indicativeImbalanceQuantityMarket`,
`referencePrice`, `casEligible`) carried on the v3 feed.

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetFullMarketQuoteResponseV3;
import com.upstox.api.MarketQuoteSymbolV3;
import io.swagger.client.api.MarketQuoteV3Api;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        MarketQuoteV3Api apiInstance = new MarketQuoteV3Api();

        try {
            GetFullMarketQuoteResponseV3 result = apiInstance.getFullMarketQuoteV3("NSE_EQ|INE848E01016");
            System.out.println("status: " + result.getStatus());

            for (Map.Entry<String, MarketQuoteSymbolV3> entry : result.getData().entrySet()) {
                MarketQuoteSymbolV3 quote = entry.getValue();
                System.out.println("symbol           : " + quote.getSymbol());
                System.out.println("instrument token : " + quote.getInstrumentToken());
                System.out.println("last price       : " + quote.getLastPrice());
                System.out.println("volume           : " + quote.getVolume());
                System.out.println("net change       : " + quote.getNetChange());
                System.out.println("prev close       : " + quote.getPrevClosePrice());
                System.out.println("year high / low  : " + quote.getYearHigh() + " / " + quote.getYearLow());
                System.out.println("oi / previous oi : " + quote.getOi() + " / " + quote.getPreviousOi());
                System.out.println("cas eligible     : " + quote.getCasEligible());
                System.out.println("ind. eq. price   : " + quote.getIndicativeEquilibriumPrice());
                System.out.println("ind. eq. qty     : " + quote.getIndicativeEquilibriumQuantity());
                System.out.println("reference price  : " + quote.getReferencePrice());
                System.out.println("ohlc             : " + quote.getOhlc());
                System.out.println("depth            : " + quote.getDepth());
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketQuoteV3Api->getFullMarketQuoteV3: " + e.getMessage());
        }
    }
}
```
