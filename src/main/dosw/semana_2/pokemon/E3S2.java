package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 3 SEMANA 2 
 */

public class E3S2 {
/**
 * Daa una lista de niveles de Pokémon, calcular la suma total de niveles del equipo. 
 */
    public static void main(String[] args) {
        List<Integer> niveles = Arrays.asList(45, 62, 38, 71, 55, 29);
        int total = niveles.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma total de niveles: " + total);
    }
}