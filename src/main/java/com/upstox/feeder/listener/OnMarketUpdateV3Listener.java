package com.upstox.feeder.listener;
import com.upstox.feeder.MarketUpdateV3;

public interface OnMarketUpdateV3Listener {
    void onUpdate(MarketUpdateV3 marketUpdate);
}
