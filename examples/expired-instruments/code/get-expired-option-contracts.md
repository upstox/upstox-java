## Get Expired Option Contracts for given instrument with expiry date

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
            GetOptionContractResponse result = expiredInstrumentApi.getExpiredOptionContracts("NSE_INDEX|Nifty 50", "2025-04-24");
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println("Exception when calling ExpiredInstrumentApi#getExpiredOptionContracts");
            System.out.println("Status code: " + e.getCode());
            System.out.println("Error message: " + e.getResponseBody());
        }
    }
}
```
