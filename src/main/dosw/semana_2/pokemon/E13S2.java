package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;

/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 13 SEMANA 2 
 */
public class E13S2 {
    public static void main(String[] args) {
        List<POKEMON> pokemons = Arrays.asList( new POKEMON(7L,   "Squirtle",   "Agua",   25, 210, "Kanto", false),
            new POKEMON(54L,  "Psyduck",    "Agua",   30, 250, "Kanto", false), new POKEMON(4L,   "Charmander", "Fuego",  25, 240, "Kanto", false),
            new POKEMON(37L,  "Vulpix",     "Fuego",  30, 260, "Kanto", false), new POKEMON(1L,   "Bulbasaur",  "Planta", 25, 230, "Kanto", false));
        Map<String, List<String>> porTipo = pokemons.stream()
                .collect(Collectors.groupingBy(
                        POKEMON::getTipo, Collectors.mapping(POKEMON::getNombre, Collectors.toList()) ) );
        porTipo.forEach((tipo, nombres) -> System.out.println(tipo + ": " + nombres));
    }
}