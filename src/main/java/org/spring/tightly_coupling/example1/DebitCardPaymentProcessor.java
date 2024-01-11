package org.spring.tightly_coupling.example1;

public class DebitCardPaymentProcessor {

    public void processPayment(int amount) {
        System.out.println("Payment Processed by Debit Card " + amount + " Rs");
    }
}
