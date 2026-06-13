package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 7 SEMANA 2 
 */
public class E7S2 {
    public static void main(String[] args) {
        List<String> pokemons = Arrays.asList( "Squirtle", "Pikachu", "Mewtwo", "Bulbasaur", "Charmander", "Abra");
        List<String> ordenados = pokemons.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ordenados);
    }
}