## Get market timings of a date

```java
import com.upstox.ApiException;
import com.upstox.api.GetExchangeTimingResponse;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;

public class Main {
    public static void main(String[] args) {
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();

        try {
            GetExchangeTimingResponse result = apiInstance.getExchangeTimings("2024-01-22");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
