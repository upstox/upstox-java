package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.OrderUpdate;
import com.upstox.feeder.PortfolioDataStreamer;
import com.upstox.feeder.listener.OnOrderUpdateListener;

public class PortfolioStreamerTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient);

        portfolioDataStreamer.setOnOrderUpdateListener(new OnOrderUpdateListener() {

            @Override
            public void onUpdate(OrderUpdate orderUpdate) {
                System.out.println(orderUpdate);

            }
        });

        portfolioDataStreamer.connect();
    }
}