package strategydesignpattern;

public class PaymentTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment()); //using TopCasting
        paymentContext.pay(120.90);

        paymentContext.setPaymentStrategy(new PaypalPayment());
        paymentContext.pay(1000);

        paymentContext.setPaymentStrategy(new BankTransferPayment());
        paymentContext.pay(1200);

    }
}
