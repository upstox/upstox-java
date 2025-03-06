package com.upstox.feeder.listener;

import com.upstox.feeder.GttUpdate;

public interface OnGttUpdateListener {
    void onUpdate(GttUpdate gttUpdate);
}
