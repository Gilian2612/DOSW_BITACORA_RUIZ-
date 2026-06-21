package E09;
public class LocationValidator extends Validator {
    @Override
    void check(String user) {
        System.out.println("  [Chain] Validando ubicacion de " + user + " -> OK");
    }
}
