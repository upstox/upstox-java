## Get user profile information using access token

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetProfileResponse;
import com.upstox.api.UserApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();
        String apiVersion = "2.0";

        try {
            GetProfileResponse result = apiInstance.getProfile(apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getProfile");
            e.printStackTrace();
        }
    }
}
```
