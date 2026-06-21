package E09;
public class PermissionValidator extends Validator {
    @Override
    void check(String user) {
        System.out.println("  [Chain] Validando permisos de " + user + " -> OK");
    }
}
