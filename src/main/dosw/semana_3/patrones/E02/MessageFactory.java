package semana_3.patrones.E02;
public interface MessageFactory {
    Main.Message build(Main.OrderEvent event);
}
