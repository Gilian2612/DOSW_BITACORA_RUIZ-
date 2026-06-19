package semana_3.patrones.E02;

public class EmailNotifier implements NotificationObserver {
    private MessageFactory factory = new EmailMessageFactory();

    @Override
    public void notify(Main.OrderEvent event) {
        Main.Message msg = factory.build(event);
        System.out.println("[EMAIL] Formato: " + msg.format);
        System.out.println("        Contenido: " + msg.content);
    }
}
