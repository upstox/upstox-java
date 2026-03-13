## Get historical candle data with a 1-minute interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "1minute";
        String toDate = "2023-11-13";
        String fromDate = "2023-11-12";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 30-minute interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "30minute";
        String toDate = "2023-11-13";
        String fromDate = "2023-11-12";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a daily interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "day";
        String toDate = "2023-11-13";
        String fromDate = "2023-11-12";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a weekly interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "week";
        String toDate = "2023-11-13";
        String fromDate = "2023-10-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a monthly interval

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "month";
        String toDate = "2023-11-13";
        String fromDate = "2022-10-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get historical candle data with a 1-minute interval (without from date)

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "1minute";
        String toDate = "2023-11-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 30-minute interval (without from date)

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "30minute";
        String toDate = "2023-11-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a daily interval (without from date)

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "day";
        String toDate = "2023-11-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a weekly interval (without from date)

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "week";
        String toDate = "2023-11-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a monthly interval (without from date)

```java
import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import io.swagger.client.api.HistoryApi;

public class Main {
    public static void main(String[] args) {
        HistoryApi apiInstance = new HistoryApi();
        String apiVersion = "2.0";
        String instrumentKey = "NSE_EQ|INE669E01016";
        String interval = "month";
        String toDate = "2023-11-13";
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```
