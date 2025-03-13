package com.upstox.sanity;


import com.upstox.ApiClient;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.OrderUpdate;
import com.upstox.feeder.PortfolioDataStreamer;
import com.upstox.feeder.listener.OnOrderUpdateListener;

public class PortfolioStreamerTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient,true,true,true, true);

        portfolioDataStreamer.setOnOrderUpdateListener(orderUpdate -> System.out.println("orderUpdate= " + orderUpdate));

        portfolioDataStreamer.setOnOpenListener(() -> System.out.println("connection opened"));

        portfolioDataStreamer.setOnHoldingUpdateListener((holdingUpdate) -> System.out.println("holdingUpdate= " + holdingUpdate));
        portfolioDataStreamer.setOnPositionUpdateListener(positionUpdate -> System.out.println("positionUpdate= " + positionUpdate));
        portfolioDataStreamer.setOnGttUpdateListener(gttUpdate -> System.out.println("gttUpdate= " + gttUpdate));

        portfolioDataStreamer.connect();
    }
}
