package org.spring.SetterBasedDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sms")

public class SMsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS : " + message);
    }
}
