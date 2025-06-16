package strategydesignpattern;

public class BankTransferPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Making the Payment of " + amount + " using Bank Transfer");
    }
}
