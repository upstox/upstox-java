## Convert a position from intraday to delivery

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ConvertPositionRequest;
import com.upstox.api.ConvertPositionResponse;
import com.upstox.api.PortfolioApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        PortfolioApi apiInstance = new PortfolioApi();
        String apiVersion = "2.0";
        ConvertPositionRequest body = new ConvertPositionRequest();
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setNewProduct(ConvertPositionRequest.NewProductEnum.D);
        body.setOldProduct(ConvertPositionRequest.OldProductEnum.I);
        body.setTransactionType(ConvertPositionRequest.TransactionTypeEnum.BUY);
        body.setQuantity(1);

        try {
            ConvertPositionResponse result = apiInstance.convertPositions(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#convertPositions");
            e.printStackTrace();
        }
    }
}
```

## Convert a position from delivery to intraday

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ConvertPositionRequest;
import com.upstox.api.ConvertPositionResponse;
import com.upstox.api.PortfolioApi;
import com.upstox.auth.*;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        PortfolioApi apiInstance = new PortfolioApi();
        String apiVersion = "2.0";
        ConvertPositionRequest body = new ConvertPositionRequest();
        body.setInstrumentToken("NSE_EQ|INE848E01016");
        body.setNewProduct(ConvertPositionRequest.NewProductEnum.I);
        body.setOldProduct(ConvertPositionRequest.OldProductEnum.D);
        body.setTransactionType(ConvertPositionRequest.TransactionTypeEnum.BUY);
        body.setQuantity(1);

        try {
            ConvertPositionResponse result = apiInstance.convertPositions(body, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#convertPositions");
            e.printStackTrace();
        }
    }
}
```
