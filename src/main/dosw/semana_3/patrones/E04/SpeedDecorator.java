package E04;

public class SpeedDecorator implements Character {

    private final Character wrapped;

    public SpeedDecorator(Character wrapped) { this.wrapped = wrapped; }

    @Override
    public String attack() { return wrapped.attack() + " + [Velocidad Extra]"; }

    @Override
    public int getPower() { return wrapped.getPower() + 15; }
}
