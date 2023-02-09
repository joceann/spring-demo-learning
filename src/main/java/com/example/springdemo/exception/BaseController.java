package com.example.springdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class BaseController {

    @ExceptionHandler(BusinessException.class)
    public Object handleBusinessException(Exception e) {
        return "BusinessException occur: " + e.getMessage();
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public Object handleIndexOutOfBoundsException(Exception e) {
        return "IndexOutOfBoundsException occur: " + e.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        return "Exception occur: " + e.getMessage();
    }
}
