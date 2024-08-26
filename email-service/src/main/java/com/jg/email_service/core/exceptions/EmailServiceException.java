package com.jg.email_service.core.exceptions;

import com.amazonaws.AmazonServiceException;

public class EmailServiceException extends RuntimeException {
    public EmailServiceException(AmazonServiceException message){
        super(message);
    }
}
