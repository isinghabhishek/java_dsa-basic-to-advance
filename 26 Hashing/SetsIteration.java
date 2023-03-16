import java.util.*;
public class SetsIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Varanasi");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        cities.add("Madurai");

        // a). using iterator
        
        // Iterator itr = cities.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // b). using Enchanced for loop

        for (String city : cities) {
            System.out.println(city);
        }
        
        
    }
}
