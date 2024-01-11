package org.spring.loose_coupling.example2;

public class Traveler {

    private Vehicle vehicle;

    public Traveler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        vehicle.travel();
    }


}
