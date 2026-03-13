## Place a delivery market order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.OrderApi;
import com.upstox.api.PlaceOrderRequest;
import com.upstox.api.PlaceOrderResponse;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setOrderType(PlaceOrderRequest.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);

        try {
            PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder");
            e.printStackTrace();
        }
    }
}
```

## Place a delivery limit order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.OrderApi;
import com.upstox.api.PlaceOrderRequest;
import com.upstox.api.PlaceOrderResponse;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        String apiVersion = "2.0";
        PlaceOrderRequest body = new PlaceOrderRequest();
        body.setQuantity(1);
        body.setProduct(PlaceOrderRequest.ProductEnum.D);
        body.setValidity(PlaceOrderRequest.ValidityEnum.DAY);
        body.setPrice(16.8F);
        body.setTag("string");
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setOrderType(PlaceOrderRequest.OrderTypeEnum.LIMIT);
        body.setTransactionType(PlaceOrderRequest.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);

        try {
            PlaceOrderResponse result = apiInstance.placeOrder(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#placeOrder");
            e.printStackTrace();
        }
    }
}
```
