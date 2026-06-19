package semana_3.patrones.E01;

public class UsaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toUpperCase()) {
            case "PAYPAL":  return new PaypalStrategy();
            case "STRIPE":  return new StripeStrategy();
            case "TARJETA": return new TarjetaStrategy();
            default: throw new IllegalArgumentException("Metodo no disponible en USA: " + type);
        }
    }
}
