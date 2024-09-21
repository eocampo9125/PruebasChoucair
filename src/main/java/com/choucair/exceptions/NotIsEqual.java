package com.choucair.exceptions;

public class NotIsEqual extends AssertionError {

    private static final long serialVersionUID = 1L;

    public NotIsEqual (String message, Throwable cause){
        super(message, cause);
    }
}
