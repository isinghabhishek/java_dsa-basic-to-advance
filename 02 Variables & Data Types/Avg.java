import java.util.*;

public class Avg {
    public static void main(String[] args) {
        // taking input 
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // calculating average
        int average = (A + B + C)/3;
        // printing average
        System.out.println("Average of the Given Numbers:" + average);
    }
}


