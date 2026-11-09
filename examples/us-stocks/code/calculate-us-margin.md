## Calculate US margin

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsMarginRequest;
import com.upstox.api.UsMarginResponse;
import com.upstox.api.UsOrderEstimateRequest;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksChargesApi;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksChargesApi apiInstance = new UsStocksChargesApi();

        UsOrderEstimateRequest order = new UsOrderEstimateRequest();
        order.setInstrumentKey("US_EQ|AAPL");
        order.setQuantity(new BigDecimal("1"));
        order.setPrice(new BigDecimal("180.25"));
        order.setOrderType(UsOrderEstimateRequest.OrderTypeEnum.LIMIT);
        order.setTransactionType(UsOrderEstimateRequest.TransactionTypeEnum.BUY);

        // Up to 20 orders per request
        UsMarginRequest body = new UsMarginRequest();
        body.addInstrumentsItem(order);

        try {
            UsMarginResponse result = apiInstance.calculateUsMargin(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksChargesApi#calculateUsMargin");
            e.printStackTrace();
        }
    }
}
```
