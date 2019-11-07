package com.anthem.member.ngmemberboot.exceptions;

import lombok.Getter;

public class EETException extends RuntimeException {

    @Getter
    private String strMessage;

    public EETException( String message ) {
        super( message );

        this.strMessage = message;
    }

    public EETException( String message, Throwable cause ) {
        super( message, cause );

        this.strMessage = message;
    }
}
