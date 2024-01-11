package org.spring.loose_coupling.example2;

public class BUS implements Vehicle{
    @Override
    public void travel() {
        System.out.println("Traveling by BUS");
    }
}
