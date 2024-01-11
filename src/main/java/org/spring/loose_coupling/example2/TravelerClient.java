package org.spring.loose_coupling.example2;

public class TravelerClient {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Bike();
        Traveler traveler1 = new Traveler(vehicle1);
        traveler1.start();

        Vehicle vehicle2 = new Car();
        Traveler traveler2 = new Traveler(vehicle2);
        traveler2.start();

        Vehicle vehicle3 = new Cycle();
        Traveler traveler3 = new Traveler(vehicle3);
        traveler3.start();

        Vehicle vehicle4 = new BUS();
        Traveler traveler4 = new Traveler(vehicle4);
        traveler4.start();

    }
}
