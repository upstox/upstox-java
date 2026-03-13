## Get access token using auth code

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.LoginApi;
import com.upstox.api.TokenResponse;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        LoginApi apiInstance = new LoginApi(defaultClient);

        String apiVersion = "2.0";
        String code = "{your_auth_code}";
        String clientId = "{your_client_id}";
        String clientSecret = "{your_client_secret}";
        String redirectUri = "{your_redirect_uri}";
        String grantType = "authorization_code";

        try {
            TokenResponse result = apiInstance.token(apiVersion, code, clientId, clientSecret, redirectUri, grantType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi->token: " + e.getMessage());
        }
    }
}
```
