package org.spring.tightly_coupling.example2;

public class TravelerClient {

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Traveler traveler = new Traveler(cycle);
        traveler.start();

        Bike bike = new Bike();
        Traveler traveler1 = new Traveler(bike);
        traveler1.start();
    }
}
