package org.spring.loose_coupling.example1;

public class CodPaymentProcessor implements PaymentProcessor{

    public void processPayment(int amount) {
        System.out.println("Payment Processed by COD " + amount +" Rs");
    }
}
