package strategydesignpattern;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Making the Payment of " + amount + " using paypal id");
    }
}
