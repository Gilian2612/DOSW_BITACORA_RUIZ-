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
 * EJERCICIO 15 SEMANA 2 
 */
/**
 * CLASE AUXILIAR : ENTRENADOR 
 */
public class Entrenador {
    private Long id;
    private String nombre;
    private int medallas;
    private List<POKEMON> equipo;

    public Entrenador(Long id, String nombre, int medallas, List<POKEMON> equipo) {
        this.id = id;
        this.nombre = nombre;
        this.medallas = medallas;
        this.equipo = equipo;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public int getMedallas() { return medallas; }
    public List<POKEMON> getEquipo() { return equipo; }
}
