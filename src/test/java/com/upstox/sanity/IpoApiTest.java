package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.IpoApplyRequest;
import com.upstox.api.IpoBidRequest;
import com.upstox.api.IpoDetailsResponse;
import com.upstox.api.IpoListingResponse;
import com.upstox.api.IpoOrderDetailResponse;
import com.upstox.api.IpoOrderResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.IpoApi;

import java.util.Arrays;

public class IpoApiTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth OAUTH2 = (OAuth) defaultClient.getAuthentication("OAUTH2");
        OAUTH2.setAccessToken(DataToken.accessToken);

        IpoApi apiInstance = new IpoApi();

        try {
            IpoListingResponse result = apiInstance.getIpoListing("open", "regular", 1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoListing");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoListingResponse result = apiInstance.getIpoListing(null, null, null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoListing (no params)");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoDetailsResponse result = apiInstance.getIpoDetails("sample-ipo-slug");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoDetails");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoOrderResponse result = apiInstance.getIpoOrders(1, 20);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoOrders");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoOrderResponse result = apiInstance.getIpoOrders(null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoOrders (no params)");
            System.out.println(e.getResponseBody());
        }

        try {
            IpoOrderDetailResponse result = apiInstance.getIpoOrderById("sample-ipo-order-id");
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpoApi#getIpoOrderById");
            System.out.println(e.getResponseBody());
        }

        // NOTE: applyForIpo and cancelIpoOrder are state-changing on a live account —
        // applyForIpo blocks funds via a UPI mandate and cancelIpoOrder withdraws a real
        // application. The sanity suite has no dry-run/guard mechanism for write paths, so
        // these two calls are left commented out. Uncomment them only when running against
        // an account where a live IPO application (and its cancellation) is acceptable, and
        // replace the placeholder id / UPI handle / order id with real values.
        IpoApplyRequest applyBody = new IpoApplyRequest();
        applyBody.setId("sample-ipo-slug");
        applyBody.setUpi("sampleuser@upi");
        applyBody.setCategory("IND");
        applyBody.setBids(Arrays.asList(
                new IpoBidRequest().quantity(1).price(100.0)
        ));
        System.out.println("Prepared (not sent) IPO apply request: " + applyBody);
        // try {
        //     IpoApplyResponse result = apiInstance.applyForIpo(applyBody);
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     System.err.println("Exception when calling IpoApi#applyForIpo");
        //     System.out.println(e.getResponseBody());
        // }

        // try {
        //     IpoCancelResponse result = apiInstance.cancelIpoOrder("sample-ipo-order-id");
        //     System.out.println(result);
        // } catch (ApiException e) {
        //     System.err.println("Exception when calling IpoApi#cancelIpoOrder");
        //     System.out.println(e.getResponseBody());
        // }
    }
}
