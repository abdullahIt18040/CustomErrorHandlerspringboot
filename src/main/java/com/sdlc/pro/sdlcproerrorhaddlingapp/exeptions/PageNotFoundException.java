package com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PageNotFoundException extends RuntimeException{
    public PageNotFoundException(String message) {
        super(message);
    }
}
