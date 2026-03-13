## Cancel all the open orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();

        try {
            MultiOrderResponse result = apiInstance.cancelMultiOrder(null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->cancelMultiOrder: " + e.getMessage());
        }
    }
}
```

## Cancel all the open orders for a given segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();

        try {
            MultiOrderResponse result = apiInstance.cancelMultiOrder(null, "NSE_FO");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->cancelMultiOrder: " + e.getMessage());
        }
    }
}
```

## Cancel all the open orders for a given tag

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.MultiOrderResponse;
import com.upstox.api.OrderApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OrderApi apiInstance = new OrderApi();

        try {
            MultiOrderResponse result = apiInstance.cancelMultiOrder("xyz", null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi->cancelMultiOrder: " + e.getMessage());
        }
    }
}
```
