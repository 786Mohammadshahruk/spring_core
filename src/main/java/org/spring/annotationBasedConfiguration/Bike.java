package org.spring.annotationBasedConfiguration;

import org.springframework.stereotype.Component;

@Component("bike_bean")
public class Bike {
    public void travel() {
        System.out.println("Traveling by Bike");
    }
}
