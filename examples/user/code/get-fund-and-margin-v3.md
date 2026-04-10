## Get equity and commodity funds (v3)

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUserFundMarginV3Response;
import com.upstox.api.UserApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();

        try {
            GetUserFundMarginV3Response result = apiInstance.getUserFundMarginV3();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMarginV3");
            e.printStackTrace();
        }
    }
}
```
