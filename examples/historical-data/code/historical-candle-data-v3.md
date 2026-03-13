## Get data with a 1-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "minutes", 1, "2025-01-02", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 3-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "minutes", 3, "2025-01-02", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 15-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "minutes", 15, "2025-01-04", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 1-hour interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "hours", 1, "2025-02-01", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 4-hour interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "hours", 4, "2025-02-01", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a daily interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "days", 1, "2025-03-01", "2025-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a weekly interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "weeks", 1, "2025-01-01", "2024-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```

## Get data with a monthly interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetHistoricalCandleResponse result = historyV3Api.getHistoricalCandleData1("NSE_EQ|INE848E01016", "months", 1, "2025-01-01", "2010-01-01");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getHistoricalCandleData1");
            e.printStackTrace();
        }
    }
}
```
