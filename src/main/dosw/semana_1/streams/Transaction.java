/** SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
package main.dosw.semana_1.streams;
/**
 * Clase auxiliar para E5S1*/
public class Transaction {
    String id;
    double amount;
    boolean approved;

    public Transaction(String id, double amount, boolean approved) {
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + ", approved=" + approved + "}";
    }
}
