package semana_3.patrones.E01;

public class ColombiaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        switch (type.toUpperCase()) {
            case "PSE":     return new PseStrategy();
            case "NEQUI":   return new NequiStrategy();
            case "TARJETA": return new TarjetaStrategy();
            default: throw new IllegalArgumentException("Metodo no disponible en Colombia: " + type);
        }
    }
}
