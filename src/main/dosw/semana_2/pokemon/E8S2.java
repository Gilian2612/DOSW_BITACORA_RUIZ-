package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 8 SEMANA 2 
 */
public class E8S2 {
    /**
     * Clase auxiliar pokemon, como a partir del ejercicio 9 piden atributos 
     * diferentes para la misma, no se toma como clase aparte concreta
     */
    static class Pokemon {
        String nombre;
        boolean tieneEvo;
        Pokemon(String nombre, boolean tieneEvo) {
            this.nombre = nombre;
            this.tieneEvo = tieneEvo;
        }
    }
    public static void main(String[] args) {
        List<Pokemon> pokemons = Arrays.asList(new Pokemon("Raichu", false), new Pokemon("Pikachu", true), 
            new Pokemon("Charmander", true), new Pokemon("Squirtle", true), new Pokemon("Blastoise", false), new Pokemon("Charizard", false));
        List<String> listos = pokemons.stream()
                .filter(p -> p.tieneEvo)
                .map(p -> p.nombre)
                .collect(Collectors.toList());

        System.out.println("Listos para evolucionar: " + listos);
    }
}