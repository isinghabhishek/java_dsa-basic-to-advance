import java.util.*;

// implementing the logic for Inputing the value from user and return sum.

public class calculateSum {

    public static int SumCaculation(int num1, int num2){ //parameters or formal parameter
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = SumCaculation(a, b);  // arguments oe actual parameter
        System.out.println("sum is: " + sum);
    }
}
