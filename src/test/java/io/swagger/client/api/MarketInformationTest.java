package io.swagger.client.api;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetExchangeTimingResponse;
import com.upstox.api.GetHistoricalCandleResponse;
import com.upstox.api.GetHolidayResponse;
import com.upstox.api.GetMarketStatusResponse;
import com.upstox.auth.OAuth;

public class MarketInformationTest {
    public static void main(String[] args) {
//        HistoryApi apiInstance = new HistoryApi();
//        String apiVersion = "2.0";
//        String instrumentKey = "NSE_EQ|INE669E01016";
//        String interval = "1minute";
//        String toDate = "2023-11-13";
//        String fromDate = "2023-11-12";
//        try {
//            GetHistoricalCandleResponse result = apiInstance.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling HistoryApi#getHistoricalCandleData1");
//            e.printStackTrace();
//        }
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiI3UEJDNkQiLCJqdGkiOiI2NjdhNjEwODdjNmJiMTM2ZWFhZTJkM2YiLCJpc011bHRpQ2xpZW50IjpmYWxzZSwiaWF0IjoxNzE5Mjk2MjY0LCJpc3MiOiJ1ZGFwaS1nYXRld2F5LXNlcnZpY2UiLCJleHAiOjE3MTkzNTI4MDB9.1Gojc8I_8FRhAQhXRDB6NuqNVv0ySM5atm-QkzcalX4");
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();
        try{
            GetMarketStatusResponse result = apiInstance.getMarketStatus("NSE");
            System.out.println(result);
        }
        catch (ApiException e){
            System.err.println("exception in market status: " + e.getResponseBody());
            e.printStackTrace();
        }
        try{
            GetHolidayResponse response = apiInstance.getHolidays();
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("exception in getHolidays: " + e.getResponseBody());
            e.printStackTrace();
        }
        try{
            GetHolidayResponse response = apiInstance.getHoliday("2024-01-22");
            System.out.println(response);

        } catch (ApiException e) {
            System.err.println("exception in getHoliday: " + e.getResponseBody());
            e.printStackTrace();
        }
        try{
            GetExchangeTimingResponse response = apiInstance.getExchangeTimings("2024-01-23");
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("exception in getHoliday: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
