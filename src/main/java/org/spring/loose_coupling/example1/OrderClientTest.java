package org.spring.loose_coupling.example1;

public class OrderClientTest {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor1 = new CodPaymentProcessor();
        Order order1 = new Order(paymentProcessor1);
        order1.order(1000);


        PaymentProcessor paymentProcessor2 = new UPIPaymentProcessor();
        Order order2 = new Order(paymentProcessor2);
        order2.order(1000);

        PaymentProcessor paymentProcessor3 = new CreditCardPaymentProcessor();
        Order order3 = new Order(paymentProcessor3);
        order3.order(1000);

        PaymentProcessor paymentProcessor4 = new DebitCardPaymentProcessor();
        Order order4 = new Order(paymentProcessor4);
        order4.order(1000);

        PaymentProcessor paymentProcessor5 = new XYZPaymentProcessor();
        Order order5 = new Order(paymentProcessor5);
        order5.order(1000);
    }
}
