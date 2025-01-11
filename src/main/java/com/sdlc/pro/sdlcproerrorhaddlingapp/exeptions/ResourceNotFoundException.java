package com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
