import java.util.Scanner;
// writing program for converting Digital Sum.

public class DigitSum {
    
    public static int sumDigit(int n){
        int sumOfDigits = 0;
        while(n > 0){
            int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(("Input an Integer: "));
        int digit = sc.nextInt();
        System.out.println("The sum is " + sumDigit(digit));
    }
}
