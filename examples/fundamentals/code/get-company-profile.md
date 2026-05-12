## Get Company Profile

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CompanyProfileResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";

        try {
            CompanyProfileResponse result = apiInstance.getCompanyProfile(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Balance Sheet

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.BalanceSheetResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";
        String type = "consolidated";
        Boolean fs = false;

        try {
            BalanceSheetResponse result = apiInstance.getBalanceSheet(isin, type, fs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Cash Flow

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CashFlowResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";
        String type = "consolidated";
        Boolean fs = false;

        try {
            CashFlowResponse result = apiInstance.getCashFlow(isin, type, fs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Income Statement

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IncomeStatementResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";
        String type = "consolidated";
        String timePeriod = "annual";
        Boolean fs = false;

        try {
            IncomeStatementResponse result = apiInstance.getIncomeStatement(isin, type, timePeriod, fs);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Key Ratios

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.KeyRatiosResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";

        try {
            KeyRatiosResponse result = apiInstance.getKeyRatios(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Share Holdings

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.ShareHoldingsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";

        try {
            ShareHoldingsResponse result = apiInstance.getShareHoldings(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Competitors

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CompetitorsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String instrumentKey = "NSE_EQ|INE848E01016";

        try {
            CompetitorsResponse result = apiInstance.getCompetitors(instrumentKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get Corporate Actions

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.CorporateActionsResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.FundamentalsApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        FundamentalsApi apiInstance = new FundamentalsApi();
        String isin = "INE848E01016";

        try {
            CorporateActionsResponse result = apiInstance.getCorporateActions(isin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling API= " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
