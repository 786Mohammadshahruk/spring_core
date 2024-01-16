package org.spring.fieldBasedDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {
    @Autowired
    private Email email;
    @Autowired
    private SMS sms;
    @Autowired
    @Qualifier("email")
    private MessageService messageService;


    public void sendMessage(String message) {
        email.sendMessage(message);
        sms.sendMessage(message);
        messageService.sendMessage(message);
    }
}
