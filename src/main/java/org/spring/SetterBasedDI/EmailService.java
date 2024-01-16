package org.spring.SetterBasedDI;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : " + message);
    }
}
