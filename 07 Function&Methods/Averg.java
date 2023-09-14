
import java.util.*;
// writing program for Average Of three number
public class Averg {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the Second Number: ");
        double b = sc.nextDouble();

        System.out.println("Enter the Third Number: ");
        double c = sc.nextDouble();
        
        System.out.println("The Average value is " + average(a, b, c) + "\n");
    
    }
    
    private static double average(double a, double b, double c) {
        return (a + b + c)/3;
    }
}

