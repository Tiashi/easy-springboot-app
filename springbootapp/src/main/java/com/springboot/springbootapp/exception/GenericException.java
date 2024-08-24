package com.springboot.springbootapp.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
public class GenericException extends RuntimeException {

    private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    private String message = "An error occurred.";

    public GenericException(String message) {
        super();
        this.message = message;
    }
    public GenericException(HttpStatus status) {
        super();
        this.status = status;
    }
}