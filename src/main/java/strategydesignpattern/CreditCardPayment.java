package strategydesignpattern;

public class CreditCardPayment implements PaymentStrategy{


    @Override
    public void pay(double amount) {
        System.out.println("Making the Payment of "+amount+ " using credit card");
    }
}
