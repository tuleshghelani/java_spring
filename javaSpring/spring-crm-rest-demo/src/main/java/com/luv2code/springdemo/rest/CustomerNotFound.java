package com.luv2code.springdemo.rest;

public class CustomerNotFound extends RuntimeException {
    public CustomerNotFound() {
    }

    public CustomerNotFound(String message) {
        super(message);
    }

    public CustomerNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerNotFound(Throwable cause) {
        super(cause);
    }

    public CustomerNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
