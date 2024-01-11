package org.spring.tightly_coupling.example1;

public class OrderClientTest {

    public static void main(String[] args) {
        CodPaymentProcessor codPaymentProcessor = new CodPaymentProcessor();
        Order order = new Order(codPaymentProcessor);
        order.order(1000);
    }
}
