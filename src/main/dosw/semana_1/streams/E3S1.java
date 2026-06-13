/** SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 * 3. 
 */
package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/* Obtener nombres de los Usuarios
 * Dada una lista de usuarios con atributos: id, name, age, active
 * Filtrar únicamente los usuarios activos, obtener sus nombres
 * en mayúscula y ordenados alfabéticamente*/
public class E3S1 {
    static class User {
        int id;
        String name;
        int age;
        boolean active;
        User(int id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User(1, "Ana",    25, true), new User(2, "Carlos", 30, false),
                    new User(3, "Beatriz",22, true), new User(4, "David",  28, false), new User(5, "Elena",  35, true) );
        List<String> sortedUsers = users.stream()
                .filter(u -> u.active)
                .map(u -> u.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedUsers);
    }
}
