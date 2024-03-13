package com.upstox.feeder.constants;

public enum Method {
    SUBSCRIBE("sub"), CHANGE_METHOD("change_mode"), UNSUBSCRIBE("unsub");

    private final String value;

    Method(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
