package org.spring.SetterBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msgSender")
public class MessageSender {

    public SMsService sendMessage;
    public EmailService emailService;

    @Autowired
    public void setMessageService(SMsService messageService) {
        System.out.println("Inside setMessageService");
        this.sendMessage = messageService;
    }

    @Autowired
    public void setEmailService(EmailService emailService) {
        System.out.println("Inside setEmailService");
        this.emailService = emailService;
    }

    public void sendMessage(String message) {
        System.out.println("Inside Send Message");
        emailService.sendMessage(message);
    }
}
