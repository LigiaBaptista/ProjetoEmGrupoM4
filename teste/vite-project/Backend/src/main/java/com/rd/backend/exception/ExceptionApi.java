package com.rd.backend.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public class ExceptionApi extends RuntimeException{

    private final HttpStatus errorType;
    public ExceptionApi(String message, HttpStatus errorType) {
        super(message);
        this.errorType = errorType;
    }

}


