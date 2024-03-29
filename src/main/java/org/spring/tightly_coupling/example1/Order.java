package org.spring.tightly_coupling.example1;

public class Order {

    private CodPaymentProcessor codPaymentProcessor;

    public Order(CodPaymentProcessor codPaymentProcessor){
        this.codPaymentProcessor = codPaymentProcessor;
    }
    public void order(int amount){
        codPaymentProcessor.processPayment(amount);
    }
}
