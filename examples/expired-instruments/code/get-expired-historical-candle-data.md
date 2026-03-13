## Get Historical Candle Data for Expired Instruments

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ExpiredInstrumentApi expiredInstrumentApi = new ExpiredInstrumentApi();
        try {
            GetHistoricalCandleResponse result = expiredInstrumentApi.getExpiredHistoricalCandleData("NSE_FO|54452|24-04-2025", "30minute", "2025-06-04", "2002-06-04");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredHistoricalCandleData");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
}
```
