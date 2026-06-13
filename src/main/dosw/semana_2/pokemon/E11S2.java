package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 11 SEMANA 2 
 * Promedio de poder de combate de los pokemones del equipo 
 */

public class E11S2 {
    public static void main(String[] args) {
        /**
         * /**
           * ID de los pokemones son los numeros en la pokedex
        * @param args
        */
        List<POKEMON> pokemons = Arrays.asList( new POKEMON(25L,  "Pikachu",   "Eléctrico", 45, 320, "Kanto", false),new POKEMON(150L, "Mewtwo","Psíquico",70, 680, "Kanto", true),
            new POKEMON(149L, "Dragonite", "Dragón",    60, 530, "Kanto", false),new POKEMON(7L,   "Squirtle",  "Agua",      25, 210, "Kanto", false),
            new POKEMON(94L,  "Gengar",    "Fantasma",  55, 495, "Kanto", false), new POKEMON(6L,   "Charizard", "Fuego",     65, 610, "Kanto", false));
        double promedio = pokemons.stream()
                .mapToDouble(POKEMON::getPoderCombate)
                .average()
                .getAsDouble();
        System.out.printf("Poder de combate promedio: %.2f%n", promedio);
    }
}