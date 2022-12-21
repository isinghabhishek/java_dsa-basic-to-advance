import java.util.*;

public class WhileL {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();

        while(counter < n){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("printed " + n + " times");
    }
}
