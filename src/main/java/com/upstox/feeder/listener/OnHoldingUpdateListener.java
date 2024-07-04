package com.upstox.feeder.listener;

import com.upstox.feeder.HoldingUpdate;

public interface OnHoldingUpdateListener {
    void onUpdate(HoldingUpdate holdingUpdate);
}
