package org.spring.tightly_coupling.example1;

public class CodPaymentProcessor {

    public void processPayment(int amount) {
        System.out.println("Payment Processed by COD " + amount +" Rs");
    }
}
