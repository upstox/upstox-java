## Logout

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.LoginApi;
import com.upstox.api.LogoutResponse;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        LoginApi apiInstance = new LoginApi(defaultClient);
        String apiVersion = "2.0";

        try {
            LogoutResponse result = apiInstance.logout(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi->logout: " + e.getMessage());
        }
    }
}
```
