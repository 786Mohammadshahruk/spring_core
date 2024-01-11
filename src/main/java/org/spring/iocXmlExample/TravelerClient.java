package org.spring.iocXmlExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelerClient {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cycle cycle = applicationContext.getBean("cycle",Cycle.class);
        cycle.travel();
        System.out.println(cycle.getName());
    }
}
