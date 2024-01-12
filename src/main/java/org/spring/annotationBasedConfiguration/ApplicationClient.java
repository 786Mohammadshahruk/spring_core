package org.spring.annotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        /*Bike bike = applicationContext.getBean("bike_bean", Bike.class);
        bike.travel();

        Car car = applicationContext.getBean("car_bean", Car.class);
        car.travel();

        Cycle cycle = applicationContext.getBean("cycle_bean", Cycle.class);
        cycle.travel();*/

        Traveler traveler = applicationContext.getBean("traveler_bean", Traveler.class);
        traveler.start();
    }
}
