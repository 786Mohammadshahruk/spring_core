package org.spring.tightly_coupling.example2;

public class Traveler {
    private Cycle cycle;
    private Bike bike;

    Traveler(Cycle cycle) {
        this.cycle = cycle;
    }

    Traveler(Bike bike) {
        this.bike = bike;
    }

    public void start() {
        bike.travel();
    }
}
