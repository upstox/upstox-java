## Get Expiries for given instrument

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
            GetExpiriesResponse getExpiriesResponse = expiredInstrumentApi.getExpiries("NSE_INDEX|Nifty 50");
            System.out.println(getExpiriesResponse);
        } catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredInstruments");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
}
```
