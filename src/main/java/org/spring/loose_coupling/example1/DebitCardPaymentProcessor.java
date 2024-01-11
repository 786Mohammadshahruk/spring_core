package org.spring.loose_coupling.example1;

public class DebitCardPaymentProcessor implements PaymentProcessor{

    public void processPayment(int amount) {
        System.out.println("Payment Processed by Debit Card " + amount + " Rs");
    }
}
