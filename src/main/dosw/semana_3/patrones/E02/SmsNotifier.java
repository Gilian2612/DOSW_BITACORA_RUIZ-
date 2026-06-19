package semana_3.patrones.E02;

public class SmsNotifier implements NotificationObserver {
    private MessageFactory factory = new SmsMessageFactory();

    @Override
    public void notify(Main.OrderEvent event) {
        Main.Message msg = factory.build(event);
        System.out.println("[SMS]   Formato: " + msg.format);
        System.out.println("        Contenido: " + msg.content);
    }
}
