package org.spring.loose_coupling;

public class XYZPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment Processed by XYZ " + amount + " Rs");
    }
}
