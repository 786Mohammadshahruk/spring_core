package org.spring.annotationBasedConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cycle_bean")
@Primary
public class Cycle implements Vehicle {

    public void travel() {
        System.out.println("Traveling by Cycle");
    }
}
