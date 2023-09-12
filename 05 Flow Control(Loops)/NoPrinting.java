import java.util.*;

// Programm for the Number Printing
// Programs are the 
public class NoPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();

        while(counter <= n){
            System.out.print(counter+" ");
            counter++;

        }
    }
}
