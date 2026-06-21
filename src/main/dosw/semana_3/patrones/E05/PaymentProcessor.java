package E05;

public interface PaymentProcessor {
    void pay(double amount);
    boolean verifyFunds(double amount);
}
