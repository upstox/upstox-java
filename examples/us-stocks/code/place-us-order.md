## Place US order by quantity

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsOrderResponse;
import com.upstox.api.UsPlaceOrderRequest;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksOrderApi;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksOrderApi apiInstance = new UsStocksOrderApi();

        UsPlaceOrderRequest body = new UsPlaceOrderRequest();
        body.setInstrumentKey("US_EQ|AAPL");
        // Up to 9 decimals; fractions only on fractionable stocks
        body.setQuantity(new BigDecimal("1.5"));
        body.setPrice(new BigDecimal("180.25"));
        body.setOrderType(UsPlaceOrderRequest.OrderTypeEnum.LIMIT);
        body.setTransactionType(UsPlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setValidity(UsPlaceOrderRequest.ValidityEnum.DAY);

        try {
            UsOrderResponse result = apiInstance.placeUsOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#placeUsOrder");
            e.printStackTrace();
        }
    }
}
```

## Place US order by amount

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsOrderResponse;
import com.upstox.api.UsPlaceOrderRequest;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksOrderApi;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksOrderApi apiInstance = new UsStocksOrderApi();

        UsPlaceOrderRequest body = new UsPlaceOrderRequest();
        body.setInstrumentKey("US_EQ|AAPL");
        // USD to invest, up to 2 decimals
        body.setAmount(new BigDecimal("25.00"));
        body.setOrderType(UsPlaceOrderRequest.OrderTypeEnum.MARKET);
        body.setTransactionType(UsPlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setValidity(UsPlaceOrderRequest.ValidityEnum.DAY);

        try {
            UsOrderResponse result = apiInstance.placeUsOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#placeUsOrder");
            e.printStackTrace();
        }
    }
}
```
