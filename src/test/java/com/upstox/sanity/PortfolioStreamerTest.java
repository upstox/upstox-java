package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.HoldingUpdate;
import com.upstox.feeder.OrderUpdate;
import com.upstox.feeder.PortfolioDataStreamer;
import com.upstox.feeder.PositionUpdate;
import com.upstox.feeder.listener.OnHoldingUpdateListener;
import com.upstox.feeder.listener.OnOrderUpdateListener;
import com.upstox.feeder.listener.OnPositionUpdateListener;

public class PortfolioStreamerTest {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken("eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiI3UEJDNkQiLCJqdGkiOiI2Njg2NDEyMTEyYzE3ZTUwMTU1MGFjYzIiLCJpc011bHRpQ2xpZW50IjpmYWxzZSwiaWF0IjoxNzIwMDc0NTI5LCJpc3MiOiJ1ZGFwaS1nYXRld2F5LXNlcnZpY2UiLCJleHAiOjE3MjAxMzA0MDB9.ZaMl4rZNm1z2kWL6zVdIar1Lk7fMyCDwuHG-PCokQnA");

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient);

        portfolioDataStreamer.setOnOrderUpdateListener(new OnOrderUpdateListener() {

            @Override
            public void onUpdate(OrderUpdate orderUpdate) {
                System.out.println(orderUpdate);

            }
        });

        portfolioDataStreamer.setOnHoldingUpdateListener(new OnHoldingUpdateListener() {
            @Override
            public void onUpdate(HoldingUpdate holdingUpdate) {
                System.out.println("holding update= " + holdingUpdate);
            }
        });

        portfolioDataStreamer.setOPositionUpdateListener(new OnPositionUpdateListener() {
            @Override
            public void onUpdate(PositionUpdate positionUpdate) {
                System.out.println("position update= " + positionUpdate);
            }
        });
        portfolioDataStreamer.connect();
    }
}
