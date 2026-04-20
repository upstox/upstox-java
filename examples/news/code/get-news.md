## Get news for instrument keys

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetNewsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.NewsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        NewsApi apiInstance = new NewsApi();
        String category = "instrument_keys";
        String instrumentKeys = "NSE_EQ|INE848E01016";
        Integer pageNumber = 1;
        Integer pageSize = 10;

        try {
            GetNewsResponse result = apiInstance.getNews(category, instrumentKeys, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get news for user positions

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetNewsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.NewsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        NewsApi apiInstance = new NewsApi();
        String category = "positions";

        try {
            GetNewsResponse result = apiInstance.getNews(category, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get news for user holdings

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetNewsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.NewsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        NewsApi apiInstance = new NewsApi();
        String category = "holdings";

        try {
            GetNewsResponse result = apiInstance.getNews(category, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
