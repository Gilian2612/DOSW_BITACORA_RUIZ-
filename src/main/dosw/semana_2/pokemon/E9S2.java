package main.dosw.semana_2.pokemon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * EJERCICIO 9 SEMANA 2 
 */

public class E9S2 {
    public static void main(String[] args) {
        /**
         * Se tomó el ID como número de la POKEKEX de cada uno de los pokemones, como es type Long se agrega el caracter L en su ID correspondiente 
         */
        List<POKEMON> pokemons = Arrays.asList( new POKEMON(25L,  "Pikachu",   "Eléctrico", 45, 320, "Kanto", false), new POKEMON(150L, "Mewtwo",    "Psíquico",  70, 680, "Kanto", true),
                                new POKEMON(149L, "Dragonite", "Dragón",    60, 530, "Kanto", false),new POKEMON(7L, "Squirtle",  "Agua",25, 210, "Kanto", false),
                                new POKEMON(94L,  "Gengar",    "Fantasma",  55, 495, "Kanto", false), new POKEMON(6L, "Charizard", "Fuego",65, 610, "Kanto", false));
        List<POKEMON> elite = pokemons.stream()
                .filter(p -> p.getPoderCombate() > 500)
                .collect(Collectors.toList());
        System.out.println("Equipo Élite (PC > 500):");
        elite.forEach(p -> System.out.println(p.getNombre() + " (" + p.getPoderCombate() + ")"));
    }
}


    