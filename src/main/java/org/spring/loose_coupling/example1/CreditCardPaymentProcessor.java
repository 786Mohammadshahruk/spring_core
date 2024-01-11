package org.spring.loose_coupling.example1;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    public void processPayment(int amount) {
        System.out.println("Payment Processed by Credit Card " + amount + " Rs");
    }
}

