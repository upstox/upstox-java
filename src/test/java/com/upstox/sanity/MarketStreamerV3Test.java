package com.upstox.sanity;


import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.MarketDataStreamerV3;
import com.upstox.feeder.MarketUpdateV3;
import com.upstox.feeder.constants.Mode;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMarketUpdateV3Listener;
import com.upstox.feeder.listener.OnOpenListener;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MarketStreamerV3Test {
    public static void main(String[] args) throws ApiException, InterruptedException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);

        final MarketDataStreamerV3 marketDataStreamer = new MarketDataStreamerV3(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys = new HashSet<>();
                instrumentKeys.add("NSE_INDEX|Nifty 50");
                instrumentKeys.add("MCX_FO|439037");

                marketDataStreamer.subscribe(instrumentKeys, Mode.FULL);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateV3Listener() {

            @Override
            public void onUpdate(MarketUpdateV3 marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.setOnErrorListener(new OnErrorListener() {
            @Override
            public void onError(Throwable error) {
                System.out.println("On error message: " + error.getMessage());
            }
        });

        marketDataStreamer.connect();
        Thread.sleep(5000);
        marketDataStreamer.changeMode(new HashSet<>(Collections.singletonList("NSE_INDEX|Nifty 50")), Mode.OPTION_GREEKS);
        Thread.sleep(10000);
        marketDataStreamer.disconnect();
    }
}