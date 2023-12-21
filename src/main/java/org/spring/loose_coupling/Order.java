package org.spring.loose_coupling;

public class Order {
    private PaymentProcessor paymentProcessor;
    public Order(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }
    public void order(int amount){
        paymentProcessor.processPayment(amount);
    }
}
