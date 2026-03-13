## Place an order with slicing enabled

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.OrderApiV3;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1);
        body.setProduct(PlaceOrderV3Request.ProductEnum.D);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);
        body.setSliceOrder(true);

        try {
            PlaceOrderV3Response result = apiInstance.placeOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApiV3->placeOrder: " + e.getMessage());
        }
    }
}
```

## Place an order with slicing disabled

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.OrderApiV3;
import com.upstox.api.PlaceOrderV3Request;
import com.upstox.api.PlaceOrderV3Response;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        OrderApiV3 apiInstance = new OrderApiV3();
        PlaceOrderV3Request body = new PlaceOrderV3Request();
        body.setQuantity(1);
        body.setProduct(PlaceOrderV3Request.ProductEnum.D);
        body.setValidity(PlaceOrderV3Request.ValidityEnum.DAY);
        body.setPrice(0F);
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setOrderType(PlaceOrderV3Request.OrderTypeEnum.MARKET);
        body.setTransactionType(PlaceOrderV3Request.TransactionTypeEnum.BUY);
        body.setDisclosedQuantity(0);
        body.setTriggerPrice(0F);
        body.setIsAmo(false);
        body.setSliceOrder(false);

        try {
            PlaceOrderV3Response result = apiInstance.placeOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApiV3->placeOrder: " + e.getMessage());
        }
    }
}
```
