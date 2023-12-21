package org.spring.tightly_coupling;

public class UPIPaymentProcessor {

    public void processPayment(int amount) {
        System.out.println("Payment Processed by UPI " + amount +" Rs");
    }
}
