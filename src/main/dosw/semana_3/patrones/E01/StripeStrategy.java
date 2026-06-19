package semana_3.patrones.E01;

public class StripeStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Pago con Stripe por $" + amount);
    }
}
