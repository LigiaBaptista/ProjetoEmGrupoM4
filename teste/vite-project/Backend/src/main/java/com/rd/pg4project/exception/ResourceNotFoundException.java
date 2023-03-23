package com.rd.pg4project.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String mídia, String id, Long id1) {
    }
}
