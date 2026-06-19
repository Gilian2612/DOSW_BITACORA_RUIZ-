package semana_3.patrones.E02;

public class PushNotifier implements NotificationObserver {
    private MessageFactory factory = new MessageFactory() {
        @Override
        public Main.Message build(Main.OrderEvent event) {
            String json = "{\"orderId\":\"" + event.orderId + "\","
                        + "\"from\":\"" + event.previousState + "\","
                        + "\"to\":\"" + event.newState + "\"}";
            return new Main.Message(json, "JSON");
        }
    };

    @Override
    public void notify(Main.OrderEvent event) {
        Main.Message msg = factory.build(event);
        System.out.println("[PUSH]  Formato: " + msg.format);
        System.out.println("        Contenido: " + msg.content);
    }
}
