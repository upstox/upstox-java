## Get trade history for equity segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetTradeWiseMetaDataResponse;
import com.upstox.api.PostTradeApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        PostTradeApi apiInstance = new PostTradeApi();
        String segment = "EQ";
        String startDate = "02-04-2023";
        String endDate = "20-03-2024";
        String apiVersion = "2.0";

        try {
            GetTradeWiseMetaDataResponse result = apiInstance.getTradesByDateRange(segment, startDate, endDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostTradeApi#getTradesByDateRange");
            e.printStackTrace();
        }
    }
}
```

## Get trade history for futures and options segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetTradeWiseMetaDataResponse;
import com.upstox.api.PostTradeApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        PostTradeApi apiInstance = new PostTradeApi();
        String segment = "FO";
        String startDate = "02-04-2023";
        String endDate = "20-03-2024";
        String apiVersion = "2.0";

        try {
            GetTradeWiseMetaDataResponse result = apiInstance.getTradesByDateRange(segment, startDate, endDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostTradeApi#getTradesByDateRange");
            e.printStackTrace();
        }
    }
}
```
