## Get IPO details

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoDetailsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        IpoApi apiInstance = new IpoApi();

        String id = "{ipo_slug_id}";

        try {
            IpoDetailsResponse result = apiInstance.getIpoDetails(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoDetails");
            e.printStackTrace();
        }
    }
}
```
