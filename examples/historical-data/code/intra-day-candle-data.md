## Get intraday candle data with a 1-minute interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetIntraDayCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "1minute";
        try {
            GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```

## Get intraday candle data with a 30-minute interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetIntraDayCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "30minute";
        try {
            GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```
