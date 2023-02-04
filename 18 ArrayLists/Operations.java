
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        // opertaions on ArrayList

        // Adding elements in ArrayList
        list.add(1); //O(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9); //O(n)

        System.out.println(list);

        //Size
        System.out.println(list.size());

        // iterating ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Get operation
        // int element = list.get(2);
        // System.out.println(element);

        //Delete
        // list.remove(2);
        // System.out.println(list);

        //Set
        // list.set(2, 10);
        // System.out.println(list);

        // Contains
    //    System.out.println(list.contains(1));
    //    System.out.println(list.contains(12));
    }
}
