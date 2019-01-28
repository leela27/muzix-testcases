package com.stackroute.muzix.exceptions;

public class TrackIdAlreadyExistsException extends Exception {
    private String message;

    public TrackIdAlreadyExistsException() {}

    public TrackIdAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
