## Get data with a 1-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "minutes", 1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
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
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "minutes", 3);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 5-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "minutes", 5);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
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
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "minutes", 15);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 30-minute interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "minutes", 30);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
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
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "hours", 1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```

## Get data with a 2-hour interval

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "hours", 2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```

## Get current day data

```java
public class Main {
    public static void main(String[] args) {
        HistoryV3Api historyV3Api = new HistoryV3Api();
        try {
            GetIntraDayCandleResponse result = historyV3Api.getIntraDayCandleData("NSE_EQ|INE848E01016", "days", 1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryV3Api->getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
```
