package com.upstox.feeder.listener;

import com.upstox.feeder.MarketUpdate;

public interface OnMarketUpdateListener {
    void onUpdate(MarketUpdate marketUpdate);
}
