package org.spring.BeanAnnotation;

public class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student class Method Called");
    }

    public void init() {
        System.out.println("Initialization Method");
    }

    public void destroy() {
        System.out.println("destroy Method");
    }

}
