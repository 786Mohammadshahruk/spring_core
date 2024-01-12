package org.spring.annotationBasedConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car_bean")
public class Car implements Vehicle {

    public void travel() {
        System.out.println("Traveling by Car");
    }
}
