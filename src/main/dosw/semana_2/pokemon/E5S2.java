package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 5 SEMANA 2 
 */
public class E5S2 {
    /**
     * Clase auxiliar pokemon, como a partir del ejercicio 9 piden atributos 
     * diferentes para la misma, no se toma como clase aparte concreta
     */
    static class Pokemon {
        String nombre;
        int nivel;
        Pokemon(String nombre, int nivel) {
            this.nombre = nombre;
            this.nivel = nivel;
        }
}
public static void main(String[] args) {
        List<Pokemon> pokemons = Arrays.asList( new Pokemon("Pikachu", 45), new Pokemon("Mewtwo", 88),  new Pokemon("Dragonite", 82),
            new Pokemon("Squirtle", 38), new Pokemon("Mew", 85), new Pokemon("Charmander", 62)  );
        int cantidad = (int) pokemons.stream()
                .filter(p -> p.nivel > 80)
                .count();
        System.out.println("Pokémon con nivel > 80: " + cantidad);
    }
}
