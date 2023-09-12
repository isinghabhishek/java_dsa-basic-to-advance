import java.util.*;

// logic for Writing the Multiplication Table 
public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int N = sc.nextInt();
        int mul = 0;
        for(int i=0; i<=10; i++){
           System.out.println(N + "*" + i + " = " + N*i);
        }
        
    }
}
