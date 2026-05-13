## Get OI Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2025-06-26";
        String date = "2025-06-12";

        try {
            AnalyticsResponse result = apiInstance.getOiData(instrumentKey, expiry, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Change in OI Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2025-06-26";
        String date = "2025-06-12";
        Integer interval = 1;

        try {
            AnalyticsResponse result = apiInstance.getChangeOiData(instrumentKey, expiry, date, interval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Max Pain Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2025-06-26";
        String date = "2025-06-12";
        Integer bucketInterval = 30;

        try {
            AnalyticsResponse result = apiInstance.getMaxPainData(instrumentKey, expiry, date, bucketInterval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get PCR Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String instrumentKey = "NSE_INDEX|Nifty 50";
        String expiry = "2025-06-26";
        String date = "2025-06-12";
        Integer bucketInterval = 30;

        try {
            AnalyticsResponse result = apiInstance.getPcrData(instrumentKey, expiry, date, bucketInterval);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get FII Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String dataType = "NSE_EQ|CASH";
        String interval = "1D";

        try {
            AnalyticsResponse result = apiInstance.getFiiData(dataType, interval, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get DII Data

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.AnalyticsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MarketApi apiInstance = new MarketApi();
        String dataType = "NSE_EQ|CASH";
        String interval = "1D";

        try {
            AnalyticsResponse result = apiInstance.getDiiData(dataType, interval, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
