// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class SortArrLst {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        // Comparator - fnx logic
        System.out.println(list);
    }
}
