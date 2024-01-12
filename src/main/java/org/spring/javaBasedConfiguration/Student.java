package org.spring.javaBasedConfiguration;

public class Student {
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student Class Method Called");
        address.print();
    }

}
