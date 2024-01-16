package org.spring.SetterBasedDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage("Hi Good Evening");
    }
}
