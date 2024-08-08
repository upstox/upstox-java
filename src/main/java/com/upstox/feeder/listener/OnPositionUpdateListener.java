package com.upstox.feeder.listener;

import com.upstox.feeder.PositionUpdate;

public interface OnPositionUpdateListener {
    void onUpdate(PositionUpdate positionUpdate);
}
