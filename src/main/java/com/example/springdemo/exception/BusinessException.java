package com.example.springdemo.exception;

public class BusinessException extends Exception {

    public BusinessException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
