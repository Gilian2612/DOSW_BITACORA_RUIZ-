/** SEMANA 1 - DOSW Manejo de sistemas 
 * William Santiago Ruiz M
 * 1000091727
 * DOSW
 */
package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 4. personas mayores de edad
 * Dado un listado de usuarios
 * filtrar las personas mayores de edad y obtener sus nombres
 */
public class E4S1 {
    static class User {
        int id;
        String name;
        boolean active;
        int age;
        User(int id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Ana",     25, true), new User(2, "Luis",    16, true),
                new User(3, "Beatriz", 17, false), new User(4, "David",   28, false),
                new User(5, "Sofia",   15, true), new User(6, "Miguel",  20, true) );
        List<String> mayores = users.stream()
                .filter(u -> u.age >= 18)
                .map(u -> u.name)
                .collect(Collectors.toList());
        System.out.println(mayores);
    }
}
