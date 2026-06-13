package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 12 SEMANA 2 
 */
public class E12S2 {
    public static void main(String[] args) {
        List<POKEMON> pokemons = Arrays.asList( new POKEMON(25L,  "Pikachu",   "Eléctrico", 45, 320, "Kanto", false), new POKEMON(150L, "Mewtwo",    "Psíquico",  70, 680, "Kanto", true),
            new POKEMON(149L, "Dragonite", "Dragón",    60, 530, "Kanto", false),new POKEMON(6L,   "Charizard", "Fuego",     65, 610, "Kanto", false));
        POKEMON campeon = pokemons.stream()
                .max(Comparator.comparingDouble(POKEMON::getPoderCombate))
                .get();
        System.out.println("Campeón: " + campeon.getNombre() + " con PC: " + campeon.getPoderCombate());
    }
}