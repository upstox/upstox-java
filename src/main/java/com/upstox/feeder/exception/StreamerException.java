package com.upstox.feeder.exception;

public class StreamerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    // Constructor that accepts a message
    public StreamerException(String message) {
        super(message);
    }

    // Constructor that accepts a message and the cause
    public StreamerException(String message, Throwable cause) {
        super(message, cause);
    }
}
