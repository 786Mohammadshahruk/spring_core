package org.spring.fieldBasedDi;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : "+message);
    }
}
