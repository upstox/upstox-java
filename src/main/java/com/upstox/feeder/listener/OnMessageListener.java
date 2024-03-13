package com.upstox.feeder.listener;

import java.nio.ByteBuffer;

public interface OnMessageListener {
    void onMessageAsBytes(ByteBuffer bytes);
    void onMessageAsString(String message);
}
