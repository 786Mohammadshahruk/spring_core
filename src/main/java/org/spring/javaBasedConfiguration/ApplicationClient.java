package org.spring.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationClient {


    public static void main(String[] args) {
        ApplicationContext applicationClient = new AnnotationConfigApplicationContext(ConfigApp.class);
        String[] names = applicationClient.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }



        Student student = applicationClient.getBean("student", Student.class);
        student.print();
    }
}
