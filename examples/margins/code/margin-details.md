## Get margin details for equity delivery orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;
import io.swagger.client.api.ChargeApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument = new Instrument();
        instrument.setInstrumentKey("NSE_EQ|INE669E01016");
        instrument.setQuantity(1);
        instrument.setProduct("D");
        instrument.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument);
        try {
            PostMarginResponse response = api.postMargin(marginRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling Margin API " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get margin details for future delivery orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;
import io.swagger.client.api.ChargeApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument = new Instrument();
        instrument.setInstrumentKey("NSE_FO|35000");
        instrument.setQuantity(1);
        instrument.setProduct("D");
        instrument.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument);
        try {
            PostMarginResponse response = api.postMargin(marginRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling Margin API " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get margin details for option delivery orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;
import io.swagger.client.api.ChargeApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument = new Instrument();
        instrument.setInstrumentKey("NSE_FO|54524");
        instrument.setQuantity(1);
        instrument.setProduct("D");
        instrument.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument);
        try {
            PostMarginResponse response = api.postMargin(marginRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling Margin API " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get margin details for MCX delivery orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;
import io.swagger.client.api.ChargeApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument = new Instrument();
        instrument.setInstrumentKey("MCX_FO|435356");
        instrument.setQuantity(1);
        instrument.setProduct("D");
        instrument.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument);
        try {
            PostMarginResponse response = api.postMargin(marginRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling Margin API " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

## Get margin details for currency delivery orders

```java
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.*;
import com.upstox.auth.*;
import io.swagger.client.api.ChargeApi;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("{your_access_token}");

        ChargeApi api = new ChargeApi();
        MarginRequest marginRequest = new MarginRequest();
        Instrument instrument = new Instrument();
        instrument.setInstrumentKey("NCD_FO|15758");
        instrument.setQuantity(1);
        instrument.setProduct("D");
        instrument.setTransactionType("BUY");
        marginRequest.addInstrumentsItem(instrument);
        try {
            PostMarginResponse response = api.postMargin(marginRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling Margin API " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
