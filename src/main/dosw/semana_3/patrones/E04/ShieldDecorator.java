package E04;
public class ShieldDecorator implements Character {

    private final Character wrapped;

    public ShieldDecorator(Character wrapped) { this.wrapped = wrapped; }
    @Override
    public String attack() { return wrapped.attack() + " + [Escudo de Hielo]"; }
    @Override
    public int getPower() { return wrapped.getPower() + 20; }
}
