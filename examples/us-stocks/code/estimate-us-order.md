## Estimate US order charges

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsOrderEstimateRequest;
import com.upstox.api.UsOrderEstimateResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksOrderApi;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksOrderApi apiInstance = new UsStocksOrderApi();

        UsOrderEstimateRequest body = new UsOrderEstimateRequest();
        body.setInstrumentKey("US_EQ|AAPL");
        body.setQuantity(new BigDecimal("1"));
        body.setPrice(new BigDecimal("180.25"));
        body.setOrderType(UsOrderEstimateRequest.OrderTypeEnum.LIMIT);
        body.setTransactionType(UsOrderEstimateRequest.TransactionTypeEnum.BUY);

        try {
            UsOrderEstimateResponse result = apiInstance.estimateUsOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#estimateUsOrder");
            e.printStackTrace();
        }
    }
}
```
