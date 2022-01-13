package com.luv2code.springdemo.rest;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public StudentNotFoundException(String s) {
        super(s);
    }
}
