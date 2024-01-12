package org.spring.annotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler_bean")
public class Traveler {

    private Vehicle vehicle;
    private Bike bike;

    @Autowired
    public Traveler(@Qualifier("car_bean") Vehicle vehicle, Bike bike) {
        System.out.println("Constructor called");
        this.vehicle = vehicle;
        this.bike = bike;
    }

    public void start() {
        vehicle.travel();
        bike.travel();
    }
}
