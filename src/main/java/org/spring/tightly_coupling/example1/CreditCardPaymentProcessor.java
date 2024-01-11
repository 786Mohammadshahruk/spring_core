package org.spring.tightly_coupling.example1;

public class CreditCardPaymentProcessor {
    public void processPayment(int amount) {
        System.out.println("Payment Processed by Credit Card " + amount + " Rs");
    }
}

