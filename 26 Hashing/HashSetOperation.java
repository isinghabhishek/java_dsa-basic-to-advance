import java.util.*;

public class HashSetOperation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(4);
            set.add(6);
            set.add(2);
            set.add(1);
            set.add(8);

            System.out.println(set);
            System.out.println(set.size());

            if(set.contains(2)) {
                System.out.println("set contains 2");
            }
            if(set.contains(5)) {
                System.out.println("set contains 5");
            }

            set.clear();
            System.out.println(set.size());

            System.out.println(set.isEmpty());
    }    
}
