package org.spring.fieldBasedDi;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMS implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS : "+message);
    }
}
