
import java.util.*;

// NOTE: writing program for Average Of three number
// BUG: 1. Java is a Oops language
// TODO: 2. 
// FIXME: 3. 
// BUG: 4. Variables 
// HACK: 5. 
// INFO: 6. 
// IDEA: 7. Error Handlling

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
        return (a + b + c) / 3;
    }
}
