/**
 * SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;
/*
 * 2- Palabras > 4 caracteres
 * Dada lista de palabras: 
 * Filtrar las que tengan > 4 caracteres
 *Convertir a mayuscula
 * Ordenar alfabéticamente
 * Obtener cantidad total de palabras resultantes
 */
public class E2S2 {
    public static void main(String[] args) {
        List<String> palabras =  Arrays.asList("java", "stream", "api", "functional", "code", "git");
        long cantidad = palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .count();
        System.out.println("Cantidad de palabras resultantes: " + cantidad);
    }
} 
