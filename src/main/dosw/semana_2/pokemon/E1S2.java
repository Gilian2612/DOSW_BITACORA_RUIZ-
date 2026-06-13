package main.dosw.semana_2.pokemon;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
public class E1S2 {
    static class Pokemon {
        String nombre;
        String tipo;
        Pokemon(String nombre, String tipo) {
            this.nombre = nombre;
            this.tipo = tipo;
        }
    }
    public static void main(String[] args) {
        List<Pokemon> pokemons = Arrays.asList(new Pokemon("Pikachu", "Eléctrico"), new Pokemon("Charmander", "Fuego"),
            new Pokemon("Squirtle", "Agua"), new Pokemon("Vulpix", "Fuego"), new Pokemon("Bulbasaur", "Planta"), new Pokemon("Flareon", "Fuego") );
        List<String> tipoFuego = pokemons.stream()
                .filter(p -> p.tipo.equals("Fuego"))
                .map(p -> p.nombre)
                .collect(Collectors.toList());
        System.out.println(tipoFuego);
    }
}