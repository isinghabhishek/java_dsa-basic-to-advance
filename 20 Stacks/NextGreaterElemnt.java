
import java.util.*;
public class NextGreaterElemnt {
    // next Greater Right
    // next Greater Left
    // next Smaller Right
    // next Smaller Left
    public static void main(String args[]) {  // O(n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

    // next Greater Right

         for(int i=arr.length-1; i>=0; i--) {
             //1 while loop
             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                 s.pop();
             }

             //2 if-else
             if(s.isEmpty()) {
                 nxtGreater[i] = -1;
             } else {
                 nxtGreater[i] = arr[s.peek()];
             }

             //3 push in s
             s.push(i);
         }

         for(int i=0; i<nxtGreater.length; i++){
             System.out.print(nxtGreater[i]+" ");
         }
         System.out.println();  

    // next Greater Left
            for(int i=0; i<arr.length; i++) {
                while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                    s.pop();
                    }
                    if(s.isEmpty()) {
                        nxtGreater[i] = -1;
                    } else {
                        nxtGreater[i] = arr[s.peek()];
                    }
                    s.push(i);
                }
                for(int i=0; i<nxtGreater.length; i++) {
                     System.out.print(nxtGreater[i]+" ");
                }
                System.out.println();

    // next Smaller Right
        int nxtSmaller[] = new int[arr.length];
            for(int i=arr.length-1; i>=0; i--) {
                while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();
                }
                if(s.isEmpty()) {
                    nxtSmaller[i] = -1;
                } else {
                    nxtSmaller[i] = arr[s.peek()];
                }
                s.push(i);
            }
            for(int i=0; i<nxtSmaller.length; i++){
                System.out.print(nxtSmaller[i]+" ");
            }
            System.out.println();

    // next Smaller Left
            for(int i=0; i<arr.length; i++){
                while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();
                }
                if(s.isEmpty()) {
                    nxtSmaller[i] = -1;
                } else {
                    nxtSmaller[i] = arr[s.peek()];
                }
                s.push(i);
            }
            for(int i=0; i<nxtSmaller.length; i++){
                System.out.print(nxtSmaller[i]+" ");
            }
            System.out.println();
    }
}
