package org.spring.loose_coupling;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    public void processPayment(int amount) {
        System.out.println("Payment Processed by Credit Card " + amount + " Rs");
    }
}

