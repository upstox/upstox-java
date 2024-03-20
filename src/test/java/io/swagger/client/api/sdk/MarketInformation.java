package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetBrokerageResponse;
import com.upstox.api.GetExchangeTimingResponse;
import com.upstox.api.GetHolidayResponse;
import com.upstox.api.GetMarketStatusResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.ChargeApi;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;

import java.text.SimpleDateFormat;

public class MarketInformation {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

//        ChargeApi apiInstance = new ChargeApi();
//        String instrumentToken = "NSE_EQ|INE669E01016";
//        int quantity = 56;
//        String product = "I";
//        String transactionType = "BUY";
//        float price = 31.4F;
//        String apiVersion = "2.0";
        MarketHolidaysAndTimingsApi apiInstance = new MarketHolidaysAndTimingsApi();

//        try {
//            GetMarketStatusResponse result = apiInstance.getMarketStatus("NSE");
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketInformation");
//            e.printStackTrace();
//        }
        try{
            GetHolidayResponse result = apiInstance.getHolidays();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketInformation");
            e.printStackTrace();
        }
//        try{
//            GetHolidayResponse result = apiInstance.getHoliday("2024-01-22");
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketInformation");
//            e.printStackTrace();
//        }
//        try{
//            GetExchangeTimingResponse result = apiInstance.getExchangeTimings("2024-01-22");
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketInformation");
//            e.printStackTrace();
//        }
    }
}
