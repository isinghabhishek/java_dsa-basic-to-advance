
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueInJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        System.out.println("Reverse Order");
        // givening priority to the Higher Number
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(3);
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        while(!pq1.isEmpty()) {
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
