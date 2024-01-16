package org.spring.BeanAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
        Student student = applicationContext.getBean(Student.class);
        student.print();
        applicationContext.close();
    }
}
