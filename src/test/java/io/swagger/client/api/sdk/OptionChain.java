package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetHolidayResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.MarketHolidaysAndTimingsApi;
import io.swagger.client.api.OptionsApi;

import javax.swing.text.html.Option;
import java.text.SimpleDateFormat;

public class OptionChain {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);

        OptionsApi apiInstance = new OptionsApi();

//        try{
//            System.out.println(apiInstance.getPutCallOptionChain("NSE_INDEX|Nifty 50", "2024-03-21"));
//
//        } catch (ApiException e) {
//            System.err.println("Exception when calling MarketInformation");
//            e.printStackTrace();
//        }
        try{
            System.out.println(apiInstance.getOptionContracts("NSE_INDEX|Nifty 50",null));
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketInformation");
            e.printStackTrace();
        }
    }
}
