## Get US market status

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMarketStatusResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsMarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsMarketHolidaysAndTimingsApi apiInstance = new UsMarketHolidaysAndTimingsApi();

        try {
            GetMarketStatusResponse result = apiInstance.getUsMarketStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsMarketStatus");
            e.printStackTrace();
        }
    }
}
```

## Get US market timings of a date

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUsExchangeTimingResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsMarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsMarketHolidaysAndTimingsApi apiInstance = new UsMarketHolidaysAndTimingsApi();

        String date = "2026-10-29";

        try {
            GetUsExchangeTimingResponse result = apiInstance.getUsExchangeTimings(date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsExchangeTimings");
            e.printStackTrace();
        }
    }
}
```

## Get US market holidays

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUsHolidayResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsMarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsMarketHolidaysAndTimingsApi apiInstance = new UsMarketHolidaysAndTimingsApi();

        try {
            GetUsHolidayResponse result = apiInstance.getUsHolidays();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsHolidays");
            e.printStackTrace();
        }
    }
}
```

## Get US market holiday status of a date

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUsHolidayResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UsMarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UsMarketHolidaysAndTimingsApi apiInstance = new UsMarketHolidaysAndTimingsApi();

        String date = "2026-12-25";

        try {
            GetUsHolidayResponse result = apiInstance.getUsHoliday(date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsMarketHolidaysAndTimingsApi#getUsHoliday");
            e.printStackTrace();
        }
    }
}
```
