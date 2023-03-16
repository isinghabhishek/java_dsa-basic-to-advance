import java.util.*;
public class LinkedHasSetOp {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Varanasi");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        cities.add("Madurai");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Varanasi");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        lhs.add("Madurai");

        System.out.println(lhs);
    }
}
