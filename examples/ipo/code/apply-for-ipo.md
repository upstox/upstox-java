## Apply for IPO

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoApplyRequest;
import com.upstox.api.IpoApplyResponse;
import com.upstox.api.IpoBidRequest;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        IpoApi apiInstance = new IpoApi();

        IpoApplyRequest body = new IpoApplyRequest();
        body.setId("{ipo_slug_id}");
        body.setUpi("{your_upi_handle}");
        // category: IND (retail individual) or HNI
        body.setCategory("IND");
        // Up to 3 bids are allowed
        body.setBids(Arrays.asList(
                new IpoBidRequest().quantity(1).price(100.0)
        ));

        try {
            IpoApplyResponse result = apiInstance.applyForIpo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#applyForIpo");
            e.printStackTrace();
        }
    }
}
```
