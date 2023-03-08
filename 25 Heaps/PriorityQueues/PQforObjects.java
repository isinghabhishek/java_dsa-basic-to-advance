
import java.util.PriorityQueue;

public class PQforObjects {
     static class Student implements Comparable<Student> { //overrriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
     }

     public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 1));
        pq.add(new Student("B", 3));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 89));
        pq.add(new Student("E", 4050));
        pq.add(new Student("F", 444));
        pq.add(new Student("G", 40));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
     }
}
