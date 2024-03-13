package com.upstox.feeder.listener;

public interface OnCloseListener {
    void onClose(int statusCode, String reason);
}
