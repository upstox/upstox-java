## Modify US order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UsModifyOrderRequest;
import com.upstox.api.UsOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsStocksOrderApi;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsStocksOrderApi apiInstance = new UsStocksOrderApi();

        UsModifyOrderRequest body = new UsModifyOrderRequest();
        body.setOrderId("{us_order_id}");
        body.setInstrumentKey("US_EQ|AAPL");
        body.setQuantity(new BigDecimal("2"));
        body.setPrice(new BigDecimal("181.0"));
        body.setOrderType(UsModifyOrderRequest.OrderTypeEnum.LIMIT);
        body.setTransactionType(UsModifyOrderRequest.TransactionTypeEnum.BUY);
        body.setValidity(UsModifyOrderRequest.ValidityEnum.DAY);

        try {
            UsOrderResponse result = apiInstance.modifyUsOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsStocksOrderApi#modifyUsOrder");
            e.printStackTrace();
        }
    }
}
```
