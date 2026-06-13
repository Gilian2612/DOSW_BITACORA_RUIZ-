/** SEMANA 2 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 *  CLASE ADICIONAL POKEMON
 */
package main.dosw.semana_2.pokemon;
/**
 * CLASE ADICIONAL POKEMON (ES PARA EL NIVEL 3 EN ADELANTE, desde ej 9)
 */
public class POKEMON {
    private Long id;
    private boolean legendario;
    private String nombre;
     private double poderCombate;
    private String region;
    private String tipo;
    private int nivel;
  /**
   * constructor POKEMON
   * @param id
   * @param nombre
   * @param tipo
   * @param nivel
   * @param poderCombate
   * @param region
   * @param legendario
   */
    public POKEMON(Long id, String nombre, String tipo, int nivel, double poderCombate, String region, boolean legendario) {
        this.id = id;
        this.legendario = legendario;
        this.nombre = nombre;
        this.poderCombate = poderCombate;
        this.region = region;
        this.tipo = tipo;
        this.nivel = nivel;
    /**
     * getters 
     */
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNivel() { return nivel; }
    public double getPoderCombate() { return poderCombate; }
    public String getRegion() { return region; }
    public boolean isLegendario() { return legendario; }
}