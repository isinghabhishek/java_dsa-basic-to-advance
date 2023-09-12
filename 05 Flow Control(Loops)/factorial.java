import java.util.*;

// find factorial Of given Number Accordingly
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int fact=1;

        System.out.println("Enter any positive integer: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is: " + fact);
    }
}
