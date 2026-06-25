## Initiate a payout

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.InitiatePayoutRequest;
import com.upstox.api.PayoutDetailsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.UserApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();

        InitiatePayoutRequest body = new InitiatePayoutRequest();
        body.setMode("NEFT");
        body.setAmount(5000.0);

        try {
            PayoutDetailsResponse result = apiInstance.initiatePayout(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#initiatePayout");
            e.printStackTrace();
        }
    }
}
```
