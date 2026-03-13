## Access token request

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.LoginApi;
import com.upstox.api.IndieUserTokenRequest;
import com.upstox.api.ExtendedTokenResponse;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        LoginApi apiInstance = new LoginApi(defaultClient);

        IndieUserTokenRequest indieUserTokenRequest = new IndieUserTokenRequest();
        indieUserTokenRequest.setCode("{your_auth_code}");
        indieUserTokenRequest.setClientSecret("{your_client_secret}");
        indieUserTokenRequest.setRedirectUri("{your_redirect_uri}");
        indieUserTokenRequest.setGrantType(IndieUserTokenRequest.GrantTypeEnum.AUTHORIZATION_CODE);

        try {
            ExtendedTokenResponse result = apiInstance.initTokenRequestForIndieUser(indieUserTokenRequest, "your_client_id");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi->initTokenRequestForIndieUser: " + e.getMessage());
        }
    }
}
```
