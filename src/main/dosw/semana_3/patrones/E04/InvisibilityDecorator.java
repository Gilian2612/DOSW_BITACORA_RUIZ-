package E04;

public class InvisibilityDecorator implements Character {

    private final Character wrapped;

    public InvisibilityDecorator(Character wrapped) { this.wrapped = wrapped; }

    @Override
    public String attack() { return wrapped.attack() + " + [Invisibilidad]"; }

    @Override
    public int getPower() { return wrapped.getPower() + 30; }
}
