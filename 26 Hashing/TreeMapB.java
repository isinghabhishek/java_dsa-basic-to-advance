import java.util.*;
public class TreeMapB {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("US", 50);
        tm.put("France", 40);
        tm.put("China", 150);
        tm.put("Nepal", 2);
        tm.put("Indonesia", 30);
        tm.put("Bhutan", 1);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("France", 40);
        hm.put("China", 150);
        hm.put("Nepal", 2);
        hm.put("Indonesia", 30);
        hm.put("Bhutan", 1);

        System.out.println(hm);
        System.out.println(tm);
    }
}
