package org.spring.loose_coupling;

public class UPIPaymentProcessor implements PaymentProcessor{

    public void processPayment(int amount) {
        System.out.println("Payment Processed by UPI " + amount +" Rs");
    }
}
