
//  linkendList in Java Collection Framework
import java.util.LinkedList;

public class LLinJCF {
    
    public static void main(String[] args) {
        // create -
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
