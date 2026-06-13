package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 2 SEMANA 2 
 */
public class E2S2 {
    public static void main(String[] args) {
        List<String> pokemons = Arrays.asList("Pikachu", "Charmander", "Squirtle", "Bulbasaur");
        List<String> gritones = pokemons.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(gritones);
    }
}