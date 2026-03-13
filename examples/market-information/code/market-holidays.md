## Get market holidays for current year

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetHolidayResponse;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();

        try {
            GetHolidayResponse result = apiInstance.getHolidays();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get market holiday status of a date

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetHolidayResponse;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();

        try {
            GetHolidayResponse result = apiInstance.getHoliday("2024-01-22");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
