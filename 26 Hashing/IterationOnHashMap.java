import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("France", 40);
        hm.put("China", 150);
        hm.put("Nepal", 2);
        hm.put("Indonesia", 30);
        hm.put("Bhutan", 1);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= "+k+ ", value= "+hm.get(k));
        }
    }
}
