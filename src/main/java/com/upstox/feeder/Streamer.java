package com.upstox.feeder;

import com.upstox.ApiClient;
import com.upstox.feeder.listener.OnAutoReconnectStoppedListener;
import com.upstox.feeder.listener.OnCloseListener;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOpenListener;
import com.upstox.feeder.listener.OnReconnectingListener;

public abstract class Streamer {

    protected Feeder feeder;

    protected ApiClient apiClient;

    protected OnOpenListener onOpenListener;
    protected OnErrorListener onErrorListener;
    protected OnCloseListener onCloseListener;
    protected OnReconnectingListener onReconnectingListener;
    protected OnAutoReconnectStoppedListener onAutoReconnectStoppedListener;

    protected boolean disconnectValid = false;
    protected boolean reconnectInProgress = false;
    protected boolean enableAutoReconnect = true;
    protected int interval = 1; // Interval between reconnection attempts, in seconds
    protected int retryCount = 5; // Maximum number of reconnection attempts
    protected int reconnectAttempts = 0; // Current count of reconnection attempts

    public void setOnOpenListener(OnOpenListener onOpenListener) {
        this.onOpenListener = onOpenListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.onCloseListener = onCloseListener;
    }

    public void setOnReconnectingListener(OnReconnectingListener onReconnectingListener) {
        this.onReconnectingListener = onReconnectingListener;
    }

    public void setOnAutoReconnectStoppedListener(OnAutoReconnectStoppedListener onAutoReconnectStoppedListener) {
        this.onAutoReconnectStoppedListener = onAutoReconnectStoppedListener;
    }

    public abstract void connect();

    public abstract void disconnect();

    public void autoReconnect(boolean enable) {
        this.enableAutoReconnect = enable;

        if (!enable && onAutoReconnectStoppedListener != null) {
            onAutoReconnectStoppedListener.onHault("Disabled by client");
        }
    }

    public void autoReconnect(boolean enable, int interval, int retryCount) {
        this.enableAutoReconnect = enable;
        this.interval = interval;
        this.retryCount = retryCount;

        if (!enable && onAutoReconnectStoppedListener != null) {
            onAutoReconnectStoppedListener.onHault("Disabled by client");
        }
    }

    private void launchAutoReconnect() {

        if (enableAutoReconnect) {
            reconnectInProgress = true;
            reconnectAttempts++;

            if (onReconnectingListener != null) {
                onReconnectingListener
                        .onReconnecting(String.format("Auto reconnect attempt %d/%d", reconnectAttempts, retryCount));
            }
            connect();
        }
    }

    protected abstract void handleOpen();

    protected void handleError(Throwable error) {

        if (onErrorListener != null) {
            onErrorListener.onError(error);
        }

        if (enableAutoReconnect && reconnectInProgress && reconnectAttempts < retryCount) {

            try {
                Thread.sleep(interval * 1000l);
            } catch (InterruptedException e) {
                Thread.currentThread()
                        .interrupt();
            }
            reconnectAttempts++;

            if (onReconnectingListener != null) {
                onReconnectingListener
                        .onReconnecting(String.format("Auto reconnect attempt %d/%d", reconnectAttempts, retryCount));
            }
            connect();
        } else if (reconnectAttempts == retryCount && onAutoReconnectStoppedListener != null) {
            onAutoReconnectStoppedListener.onHault(String.format("retryCount of %d exhausted", retryCount));
        }
    }

    protected void handleClose(int closeStatusCode, String closeMsg) {

        if (!reconnectInProgress && onCloseListener != null) {
            onCloseListener.onClose(closeStatusCode, closeMsg);
        }

        if (!reconnectInProgress && !disconnectValid && closeStatusCode != 1000) {
            launchAutoReconnect();
        }
    }
}
