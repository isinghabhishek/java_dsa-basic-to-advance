import java.util.*;

public class LinkedHashMapB {
    
    public static void main(String[] args) {
// LinkedHashMap give the inputed data in the inserted Order
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("US", 50);
        lhm.put("France", 40);
        lhm.put("China", 150);
        lhm.put("Nepal", 2);
        lhm.put("Indonesia", 30);
        lhm.put("Bhutan", 1);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("France", 40);
        hm.put("China", 150);
        hm.put("Nepal", 2);
        hm.put("Indonesia", 30);
        hm.put("Bhutan", 1);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
