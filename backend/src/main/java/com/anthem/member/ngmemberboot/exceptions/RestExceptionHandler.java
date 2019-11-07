package com.anthem.member.ngmemberboot.exceptions;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;
import java.time.Instant;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable( HttpMessageNotReadableException ex,
                                                                   HttpHeaders httpHeaders,
                                                                   HttpStatus httpStatus,
                                                                   WebRequest webRequest ) {
        String strMessage = "Message Not Readable";

        ErrorDetail errorDetail = getErrorErrorDetail( ex.getMessage(), ex.getClass().getName(),
                                                       httpStatus.value(), strMessage );

        return handleExceptionInternal( ex, errorDetail, httpHeaders, httpStatus, webRequest );
    }

    public ResponseEntity<Object> handleEET( EETException ex, HttpHeaders httpHeaders,
                                                HttpStatus httpStatus, WebRequest webRequest ) {
        String strMessage = "EET Exception";

        ErrorDetail errorDetail = getErrorErrorDetail( ex.getMessage(), ex.getClass().getName(),
                                                        httpStatus.value(), strMessage );

        return handleExceptionInternal( ex, errorDetail, httpHeaders, httpStatus, webRequest );
    }

    private ErrorDetail getErrorErrorDetail( String detail, String developerMsg, int status, String message ) {
        Instant now = Instant.now();
        Timestamp currentTimeStamp = Timestamp.from(now);

        ErrorDetail errorDetail = new ErrorDetail();

        errorDetail.setTimeStamp( currentTimeStamp.getTime() );
        errorDetail.setStatus( status );
        errorDetail.setTitle( message );
        errorDetail.setDetail( detail );
        errorDetail.setDeveloperMessage( developerMsg );

        log.info( errorDetail.toString() );

        return errorDetail;
    }
}
