package org.spring.iocXmlExample;


public class Cycle implements Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void travel() {
        System.out.println("Traveling by Cycle");
    }
}
