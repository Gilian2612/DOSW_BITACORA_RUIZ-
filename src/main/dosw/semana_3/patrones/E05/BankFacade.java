package E05;

public class BankFacade {

    private LegacyBankService legacy;
    private LegacyBankAdapter adapter;

    public BankFacade() {
        this.legacy = new LegacyBankService();
        this.adapter = new LegacyBankAdapter(legacy);
    }

    public void procesarPago(double monto) {
        System.out.println("  [FACADE] Iniciando pago de $" + monto);
        legacy.openConnection();
        legacy.authenticate("TOKEN-SEGURO");
        legacy.openSession();
        legacy.setContext("PAGO");
        legacy.prepareTransaction();
        adapter.pay(monto);
        legacy.commitTransaction();
        legacy.closeSession();
        legacy.closeConnection();
        System.out.println("  [FACADE] Pago completado.\n");
    }

    public boolean verificarFondos(double monto) {
        System.out.println("  [FACADE] Verificando fondos para $" + monto);
        legacy.openConnection();
        legacy.authenticate("TOKEN-SEGURO");
        boolean result = adapter.verifyFunds(monto);
        legacy.closeConnection();
        System.out.println("  [FACADE] Fondos suficientes: " + result + "\n");
        return result;
    }
}
