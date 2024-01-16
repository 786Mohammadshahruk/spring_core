package org.spring.ConstructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {
    /*private MessageService messageService;

    @Autowired // 4.5
    public MessageSender(@Qualifier("smsService") MessageService messageService) {
        System.out.println("Constructor called");
        this.messageService = messageService;
    }
*/

    private SmsService smsService;
    private EmailService emailService;

    @Autowired // 4.5
    public MessageSender(@Qualifier("smsService") SmsService smsService, EmailService emailService) {
        System.out.println("Constructor called");
        this.smsService = smsService;
        this.emailService = emailService;
    }


    public void sendMessage(String message) {
        emailService.sendMessage(message);
        smsService.sendMessage(message);
    }


}
