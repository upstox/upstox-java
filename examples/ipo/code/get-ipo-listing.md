## Get IPO listing

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoListingResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        IpoApi apiInstance = new IpoApi();

        // status: open, closed, listed, upcoming | issueType: regular, sme
        try {
            IpoListingResponse result = apiInstance.getIpoListing("open", "regular", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoListing");
            e.printStackTrace();
        }
    }
}
```
