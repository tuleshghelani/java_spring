package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public CustomerErrorResponse() {
    }

    public CustomerErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public CustomerErrorResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CustomerErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public CustomerErrorResponse setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
}
