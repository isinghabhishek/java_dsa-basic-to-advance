

public class CircularQueueUseArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull() {
            return (rear+1)% size == front;
        }
        // Add
        public static void add(int data) {  // O(1)
            if(isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            // add 1st element
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }
        // Remove
        public static int remove() {  // O(n)
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];

            // last element delete
            if(rear == front) {
                rear = front = -1; 
            } else{
                front = (front + 1)%size;
            }
            return result;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
