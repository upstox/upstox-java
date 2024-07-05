package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.Configuration;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.auth.OAuth;
import com.upstox.feeder.HoldingUpdate;
import com.upstox.feeder.OrderUpdate;
import com.upstox.feeder.PortfolioDataStreamer;
import com.upstox.feeder.PositionUpdate;
import com.upstox.feeder.listener.*;
import io.swagger.client.api.WebsocketApi;

public class PortfolioStreamerTest {
    public static void main(String[] args) throws ApiException {
        websocketApi();
        connect();
    }
    private static void connect(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken("{your_access_token}");

        final PortfolioDataStreamer portfolioDataStreamer = new PortfolioDataStreamer(defaultClient,false,false,true);

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

        portfolioDataStreamer.setOnOpenListener(new OnOpenListener() {
            @Override
            public void onOpen() {
                System.out.println("opened websocket connection");
            }
        });

        portfolioDataStreamer.setOnErrorListener(new OnErrorListener() {
            @Override
            public void onError(Throwable error) {
                System.out.println("Got error");
                System.err.println("Error  "  + error);
            }
        });
        portfolioDataStreamer.connect();
    }
    private static void websocketApi() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken("{access_token}");

        WebsocketApi websocketApi = new WebsocketApi();
        WebsocketAuthRedirectResponse websocketAuthRedirectResponse = websocketApi.getPortfolioStreamFeedAuthorize("2.0",true,true,true);
        System.out.println(websocketAuthRedirectResponse.getData().getAuthorizedRedirectUri());
    }
}
