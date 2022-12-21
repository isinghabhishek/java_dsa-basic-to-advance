import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(n + " is prime");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i == 0){  // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println(n +" is prime");
            }else {
                System.out.println(n + "n is a not prime");
            }
        }
    }
}
