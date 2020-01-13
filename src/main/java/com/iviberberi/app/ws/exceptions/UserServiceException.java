package com.iviberberi.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 8622058817970839317L;

    public UserServiceException(String message) {
        super(message);
    }
}
