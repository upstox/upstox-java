package io.swagger.client.api;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.GetOptionChainResponse;
import com.upstox.api.GetOptionContractResponse;
import com.upstox.auth.OAuth;

public class OptionChainTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken("eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiI3UEJDNkQiLCJqdGkiOiI2NjdjZjY1ZWExNzU5YzZlNmEwMjVlZmMiLCJpc011bHRpQ2xpZW50IjpmYWxzZSwiaWF0IjoxNzE5NDY1NTY2LCJpc3MiOiJ1ZGFwaS1nYXRld2F5LXNlcnZpY2UiLCJleHAiOjE3MTk1MjU2MDB9.6PZC0AAo7E8Pqp3eZkV4jgFbYfIk81yKSgjbgOnjwLE");
//        OAUTH2.setAccessToken("eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiI3UEJDNkQiLCJqdGkiOiI2NjdiYmY3ODMwZmQyNDU0MDE1ZGM4N2UiLCJpc011bHRpQ2xpZW50Ijp0cnVlLCJpYXQiOjE3MTkzODU5NzYsImlzcyI6InVkYXBpLWdhdGV3YXktc2VydmljZSIsImV4cCI6MTcxOTQzOTIwMH0.O2ioiN65N2NeWr8RzW1ukxfpvm4nLYMGTLVpnqDbkwE");
        OptionsApi apiInstance = new OptionsApi();
        try{
            GetOptionChainResponse getOptionChainResponse = apiInstance.getPutCallOptionChain("NSE_INDEX|Nifty 50", "2024-07-04");
            System.out.println(getOptionChainResponse);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
//        try{
//            GetOptionContractResponse response = apiInstance.getOptionContracts("NSE_INDEX|NIFTY 50", "2024-06-27");
//            System.out.println(response);
//        } catch (ApiException e) {
//            throw new RuntimeException(e);
//        }

    }
}
