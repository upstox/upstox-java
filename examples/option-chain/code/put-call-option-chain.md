## Get put/call option chain

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetPutCallOptionChainResponse;
import com.upstox.api.OptionsApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        OptionsApi apiInstance = new OptionsApi();

        try {
            GetPutCallOptionChainResponse result = apiInstance.getPutCallOptionChain("NSE_INDEX|Nifty 50", "2024-10-31");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionsApi#getPutCallOptionChain");
            e.printStackTrace();
        }
    }
}
```
