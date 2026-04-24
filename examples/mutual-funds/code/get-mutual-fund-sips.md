## Get mutual fund SIPs

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetMutualFundSipsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MutualFundApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        MutualFundApi apiInstance = new MutualFundApi();
        Integer pageNumber = 1;
        Integer records = 10;

        try {
            GetMutualFundSipsResponse result = apiInstance.getMutualFundSips(pageNumber, records);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
