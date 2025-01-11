package com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class AccessDenied extends RuntimeException{
    public AccessDenied(String message) {
        super(message);
    }
}
