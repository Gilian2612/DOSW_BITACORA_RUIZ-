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
 * EJERCICIO 14 SEMANA 2 
 */
public class E14S2 {
    public static void main(String[] args) {
        List<POKEMON> pokemons = Arrays.asList( new POKEMON(25L,  "Pikachu",    "Eléctrico", 45, 320, "Kanto",  false), new POKEMON(152L, "Chikorita",  "Planta",    25, 230, "Johto",  false),
            new POKEMON(255L, "Torchic",    "Fuego",     25, 240, "Hoenn",  false), new POKEMON(393L, "Piplup",     "Agua",      25, 210, "Sinnoh", false),
            new POKEMON(4L,   "Charmander", "Fuego",     25, 240, "Kanto",  false), new POKEMON(158L, "Totodile",   "Agua",      25, 210, "Johto",  false) );

        Map<String, List<String>> porRegion = pokemons.stream()
                .collect(Collectors.groupingBy(
                        POKEMON::getRegion,
                        Collectors.mapping(POKEMON::getNombre, Collectors.toList()) ) );
        porRegion.forEach((region, nombres) -> System.out.println(region + ": " + nombres));
    }
}