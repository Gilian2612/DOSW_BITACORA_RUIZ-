package semana_3.patrones.E02;

public class SmsMessageFactory implements MessageFactory {
    @Override
    public Main.Message build(Main.OrderEvent event) {
        String text = "Pedido " + event.orderId + ": " + event.previousState + " -> " + event.newState;
        if (text.length() > 160) text = text.substring(0, 160);
        return new Main.Message(text, "TEXTO PLANO (max 160 chars)");
    }
}
