package com.upstox.sanity;


import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.MarketDataStreamer;
import com.upstox.feeder.MarketUpdate;
import com.upstox.feeder.constants.Mode;
import com.upstox.feeder.listener.OnMarketUpdateListener;
import com.upstox.feeder.listener.OnOpenListener;
import com.upstox.sanity.DataToken;

import java.util.HashSet;
import java.util.Set;

public class MarketStreamerTest {
    public static void main(String[] args) throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);

        final MarketDataStreamer marketDataStreamer = new MarketDataStreamer(defaultClient);

        marketDataStreamer.setOnOpenListener(new OnOpenListener() {

            @Override
            public void onOpen() {
                System.out.println("Connection Established");

                Set<String> instrumentKeys = new HashSet<>();
                instrumentKeys.add("NSE_INDEX|Nifty 50");
                instrumentKeys.add("NSE_INDEX|Nifty Bank");

                marketDataStreamer.subscribe(instrumentKeys, Mode.FULL);

            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateListener() {

            @Override
            public void onUpdate(MarketUpdate marketUpdate) {
                System.out.println(marketUpdate);
            }
        });

        marketDataStreamer.connect();
    }
}