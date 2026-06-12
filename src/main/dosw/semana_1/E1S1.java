/**
 * SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
package main.dosw.semana_1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*; 
/*
 * 1. Números Pares mayores a diez
 * Dada una lista de números enteros obtener una nueva solo con los pares mayores a 10
 */
public class E1S1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 8, 10, 12, 15, 18, 20);
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
