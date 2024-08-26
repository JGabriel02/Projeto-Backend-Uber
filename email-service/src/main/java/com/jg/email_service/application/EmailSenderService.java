package com.jg.email_service.application;

import com.jg.email_service.adapters.EmailSenderGateway;
import com.jg.email_service.core.EmailSendUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService implements EmailSendUseCase {


    private final EmailSenderGateway emailSenderGateway;


    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);

    }
}
