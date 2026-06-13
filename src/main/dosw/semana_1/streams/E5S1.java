/** SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
package main.dosw.semana_1.streams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class E5S1 {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList( new Transaction("T001", 150.00, true), new Transaction("T002", 320.50, false),
                new Transaction("T003", 89.99,  true), new Transaction("T004", 500.00, true) );
        boolean notAproved = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.approved);
        System.out.println("\nLote válido: " + !notAproved);
    }
}