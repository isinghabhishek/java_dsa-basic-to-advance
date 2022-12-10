import java.util.*;
// java program for the swapping two number
public class swapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int temp = m;
            m = n;
            n = temp;
            System.out.println("Value of m is: " + m +"\nValue of n is: " + n);

    }    
}
