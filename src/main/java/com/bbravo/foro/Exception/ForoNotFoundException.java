package com.bbravo.foro.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ForoNotFoundException extends RuntimeException {
    
    public ForoNotFoundException(String msg)
    {
        super(msg);
    }
}