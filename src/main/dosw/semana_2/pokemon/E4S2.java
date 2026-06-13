package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 4 SEMANA 2 
 */
public class E4S2 {
    static class Pokemon {
    /**
     * Clase auxiliar pokemon, como a partir del ejercicio 9 piden atributos 
     * diferentes para la misma, no se toma como clase aparte concreta
     */
        String nombre;
        int nivel;
        Pokemon(String nombre, int nivel) {
            this.nombre = nombre;
            this.nivel = nivel;
        }
    }
    public static void main(String[] args) {
        List<Pokemon> pokemons = Arrays.asList( new Pokemon("Pikachu", 45), new Pokemon("Charmander", 62),
            new Pokemon("Squirtle", 38), new Pokemon("Snorlax", 90), new Pokemon("Mewtwo", 88));
        Pokemon alfa = pokemons.stream()
                .max(Comparator.comparingInt(p -> p.nivel))
                .get();
        System.out.println("Pokémon Alfa: " + alfa.nombre + " (nivel " + alfa.nivel + ")");
    }
}