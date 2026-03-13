## Place a multi order

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderData;
import com.upstox.api.MultiOrderRequest;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest multiOrderRequest = new MultiOrderRequest();
        MultiOrderData order = new MultiOrderData();
        order.setQuantity(1);
        order.setProduct(MultiOrderData.ProductEnum.D);
        order.setValidity(MultiOrderData.ValidityEnum.DAY);
        order.setPrice(0F);
        order.setInstrumentToken("NSE_EQ|INE848E01016");
        order.setOrderType(MultiOrderData.OrderTypeEnum.MARKET);
        order.setTransactionType(MultiOrderData.TransactionTypeEnum.BUY);
        order.setDisclosedQuantity(0);
        order.setTriggerPrice(0F);
        order.setIsAmo(false);
        multiOrderRequest.setOrders(Arrays.asList(order));

        try {
            MultiOrderResponse result = apiInstance.placeMultiOrder(multiOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->placeMultiOrder: " + e.getMessage());
        }
    }
}
```

## Place Multiple BUY and SELL Orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderData;
import com.upstox.api.MultiOrderRequest;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest multiOrderRequest = new MultiOrderRequest();

        MultiOrderData buyOrder = new MultiOrderData();
        buyOrder.setQuantity(1);
        buyOrder.setProduct(MultiOrderData.ProductEnum.D);
        buyOrder.setValidity(MultiOrderData.ValidityEnum.DAY);
        buyOrder.setPrice(0F);
        buyOrder.setInstrumentToken("NSE_EQ|INE848E01016");
        buyOrder.setOrderType(MultiOrderData.OrderTypeEnum.MARKET);
        buyOrder.setTransactionType(MultiOrderData.TransactionTypeEnum.BUY);
        buyOrder.setDisclosedQuantity(0);
        buyOrder.setTriggerPrice(0F);
        buyOrder.setIsAmo(false);

        MultiOrderData sellOrder = new MultiOrderData();
        sellOrder.setQuantity(1);
        sellOrder.setProduct(MultiOrderData.ProductEnum.D);
        sellOrder.setValidity(MultiOrderData.ValidityEnum.DAY);
        sellOrder.setPrice(0F);
        sellOrder.setInstrumentToken("NSE_EQ|INE669E01016");
        sellOrder.setOrderType(MultiOrderData.OrderTypeEnum.MARKET);
        sellOrder.setTransactionType(MultiOrderData.TransactionTypeEnum.SELL);
        sellOrder.setDisclosedQuantity(0);
        sellOrder.setTriggerPrice(0F);
        sellOrder.setIsAmo(false);

        multiOrderRequest.setOrders(Arrays.asList(buyOrder, sellOrder));

        try {
            MultiOrderResponse result = apiInstance.placeMultiOrder(multiOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->placeMultiOrder: " + e.getMessage());
        }
    }
}
```

## Place Multiple Orders with Auto Slicing enabled

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderData;
import com.upstox.api.MultiOrderRequest;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();
        MultiOrderRequest multiOrderRequest = new MultiOrderRequest();
        MultiOrderData order = new MultiOrderData();
        order.setQuantity(1);
        order.setProduct(MultiOrderData.ProductEnum.D);
        order.setValidity(MultiOrderData.ValidityEnum.DAY);
        order.setPrice(0F);
        order.setInstrumentToken("NSE_EQ|INE848E01016");
        order.setOrderType(MultiOrderData.OrderTypeEnum.MARKET);
        order.setTransactionType(MultiOrderData.TransactionTypeEnum.BUY);
        order.setDisclosedQuantity(0);
        order.setTriggerPrice(0F);
        order.setIsAmo(false);
        order.setSliceOrder(true);
        multiOrderRequest.setOrders(Arrays.asList(order));

        try {
            MultiOrderResponse result = apiInstance.placeMultiOrder(multiOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->placeMultiOrder: " + e.getMessage());
        }
    }
}
```
