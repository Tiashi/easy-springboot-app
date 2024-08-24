package com.springboot.springbootapp.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends GenericException {

    public NotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }
    public NotFoundException (String error) {
        super(HttpStatus.NOT_FOUND, error);
    }
}
