## Get profit loss report for equity segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetTradeWiseProfitAndLossDataResponse;
import com.upstox.api.GetTradeWiseProfitAndLossMetaDataResponse;
import com.upstox.auth.*;
import io.swagger.client.api.TradeProfitAndLossApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");
        TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
        String segment = "EQ";
        String financialYear = "2324";
        String apiVersion = "2.0";
        String fromDate = "02-04-2023";
        String toDate = "20-03-2024";
        Integer pageNumber = 1;
        Integer pageSize = 5;
        try {
            GetTradeWiseProfitAndLossDataResponse result = apiInstance.getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossData");
            e.printStackTrace();
        }
    }
}
```

## Get profit loss report for futures and options segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetTradeWiseProfitAndLossDataResponse;
import com.upstox.api.GetTradeWiseProfitAndLossMetaDataResponse;
import com.upstox.auth.*;
import io.swagger.client.api.TradeProfitAndLossApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");
        TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
        String segment = "FO";
        String financialYear = "2324";
        String apiVersion = "2.0";
        String fromDate = "02-04-2023";
        String toDate = "20-03-2024";
        Integer pageNumber = 1;
        Integer pageSize = 5;
        try {
            GetTradeWiseProfitAndLossDataResponse result = apiInstance.getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossData");
            e.printStackTrace();
        }
    }
}
```
