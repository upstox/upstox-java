## Get user IPs

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UserApi;
import com.upstox.api.UserIpResponse;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();

        try {
            UserIpResponse result = apiInstance.getUserIps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserIps");
            e.printStackTrace();
        }
    }
}
```

## Update user IP

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.UpdateUserIpRequest;
import com.upstox.api.UserApi;
import com.upstox.api.UserIpResponse;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();
        UpdateUserIpRequest body = new UpdateUserIpRequest().primaryIp("1.2.3.4");

        try {
            UserIpResponse result = apiInstance.updateUserIp(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateUserIp");
            e.printStackTrace();
        }
    }
}
```
