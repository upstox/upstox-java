package io.swagger.client.api.sdk;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetProfitAndLossChargesResponse;
import com.upstox.api.GetTradeWiseProfitAndLossDataResponse;
import com.upstox.api.GetTradeWiseProfitAndLossMetaDataResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.TradeProfitAndLossApi;

public class TradeProfitLoss {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(Constant.accessToken);
        TradeProfitAndLossApi apiInstance = new TradeProfitAndLossApi();
//        String segment = "EQ";
//        String financialYear = "2324";
//        String apiVersion = "2.0";
//        String fromDate = "02-04-2023";
//        String toDate = "20-03-2024";
//        try {
//            GetTradeWiseProfitAndLossMetaDataResponse result = apiInstance.getTradeWiseProfitAndLossMetaData(segment, financialYear, apiVersion, fromDate, toDate);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossMetaData");
//            e.printStackTrace();
//        }
//        String segment = "EQ";
//        String financialYear = "2324";
//        String apiVersion = "2.0";
//        String fromDate = "02-04-2023";
//        String toDate = "20-03-2024";
//        Integer pageNumber = 1;
//        Integer pageSize = 5;
//        try {
//            GetTradeWiseProfitAndLossDataResponse result = apiInstance.getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling TradeProfitAndLossApi#getTradeWiseProfitAndLossData");
//            e.printStackTrace();
//        }

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
