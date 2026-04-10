## Get kill switch status

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.KillSwitchResponse;
import com.upstox.api.UserApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();

        try {
            KillSwitchResponse result = apiInstance.getKillSwitch();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getKillSwitch");
            e.printStackTrace();
        }
    }
}
```

## Update kill switch

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.KillSwitchResponse;
import com.upstox.api.KillSwitchSegmentUpdateRequest;
import com.upstox.api.UserApi;
import com.upstox.auth.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        UserApi apiInstance = new UserApi();
        List<KillSwitchSegmentUpdateRequest> body = Arrays.asList(
            new KillSwitchSegmentUpdateRequest().segment("NSE_EQ").action("DISABLE"),
            new KillSwitchSegmentUpdateRequest().segment("NSE_FO").action("DISABLE")
        );

        try {
            KillSwitchResponse result = apiInstance.updateKillSwitch(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateKillSwitch");
            e.printStackTrace();
        }
    }
}
```
