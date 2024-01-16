package org.spring.fieldBasedDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageService = applicationContext.getBean(MessageSender.class);
        messageService.sendMessage("Hello");


    }
}
