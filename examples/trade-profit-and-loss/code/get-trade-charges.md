## Get trade charges for equity segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetProfitAndLossChargesResponse;
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
        try {
            GetProfitAndLossChargesResponse result = apiInstance.getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getProfitAndLossCharges");
            e.printStackTrace();
        }
    }
}
```

## Get trade charges for futures and options segment

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetProfitAndLossChargesResponse;
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
        try {
            GetProfitAndLossChargesResponse result = apiInstance.getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradeProfitAndLossApi#getProfitAndLossCharges");
            e.printStackTrace();
        }
    }
}
```
