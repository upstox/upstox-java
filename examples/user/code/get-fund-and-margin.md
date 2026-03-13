## Get equity and commodity funds

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUserFundMarginResponse;
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
            GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMargin");
            e.printStackTrace();
        }
    }
}
```

## Get equity funds

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUserFundMarginResponse;
import com.upstox.api.UserApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();
        String apiVersion = "2.0";
        String segment = "SEC";

        try {
            GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, segment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMargin");
            e.printStackTrace();
        }
    }
}
```

## Get commodity funds

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetUserFundMarginResponse;
import com.upstox.api.UserApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();
        String apiVersion = "2.0";
        String segment = "COM";

        try {
            GetUserFundMarginResponse result = apiInstance.getUserFundMargin(apiVersion, segment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getUserFundMargin");
            e.printStackTrace();
        }
    }
}
```
