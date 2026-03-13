## Get user MTF positions

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setAccessToken("{your_access_token}");

        PortfolioApi portfolioApi = new PortfolioApi();
        try {
            GetPositionResponse result = portfolioApi.getMtfPositions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi->getMtfPositions: " + e.getMessage());
        }
    }
}
```
