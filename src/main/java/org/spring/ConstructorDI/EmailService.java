package org.spring.ConstructorDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : " + message);
    }
}
