package E05;

public class LegacyBankService {

    public void executeTransaction(String accountCode, int amountInCents) {
        System.out.println("    [LEGACY] executeTransaction(cuenta: " + accountCode + ", centavos: " + amountInCents + ")");
    }

    public int verifyBalance(String accountCode) {
        int balanceInCents = 150000;
        System.out.println("    [LEGACY] verifyBalance(cuenta: " + accountCode + ") = " + balanceInCents + " centavos");
        return balanceInCents;
    }

    public void openConnection() { System.out.println("    [LEGACY] Abriendo conexion..."); }
    public void authenticate(String token) { System.out.println("    [LEGACY] Autenticando token..."); }
    public void openSession() { System.out.println("    [LEGACY] Abriendo sesion..."); }
    public void setContext(String ctx) { System.out.println("    [LEGACY] Configurando contexto: " + ctx); }
    public void prepareTransaction() { System.out.println("    [LEGACY] Preparando transaccion..."); }
    public void commitTransaction() { System.out.println("    [LEGACY] Commit de transaccion..."); }
    public void closeSession() { System.out.println("    [LEGACY] Cerrando sesion..."); }
    public void closeConnection() { System.out.println("    [LEGACY] Cerrando conexion..."); }
}
