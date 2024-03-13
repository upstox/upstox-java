package com.upstox.feeder.listener;

import com.upstox.feeder.OrderUpdate;

public interface OnOrderUpdateListener {
    void onUpdate(OrderUpdate orderUpdate);
}
