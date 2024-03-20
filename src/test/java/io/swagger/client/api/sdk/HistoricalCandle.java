package io.swagger.client.api.sdk;

import com.upstox.ApiException;
import com.upstox.api.GetHistoricalCandleResponse;
import com.upstox.api.GetIntraDayCandleResponse;
import io.swagger.client.api.HistoryApi;

public class HistoricalCandle {
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
        try {
            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData(instrumentKey,interval,toDate,apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData");
            e.printStackTrace();
        }
        try {
            GetIntraDayCandleResponse result = apiInstance.getIntraDayCandleData(instrumentKey, interval, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApi#getIntraDayCandleData");
            e.printStackTrace();
        }
    }
}
