package com.upstox.feeder;

import org.java_websocket.client.WebSocketClient;

import com.upstox.ApiClient;
import com.upstox.feeder.listener.OnCloseListener;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMessageListener;
import com.upstox.feeder.listener.OnOpenListener;

public abstract class Feeder {

    protected ApiClient apiClient;

    protected WebSocketClient webSocket;

    protected OnOpenListener onOpenListener;
    protected OnMessageListener onMessageListener;
    protected OnErrorListener onErrorListener;
    protected OnCloseListener onCloseListener;

    protected Feeder(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    protected abstract void connect();

    protected void disconnect() {
        this.webSocket.close(1000);
    }
}
