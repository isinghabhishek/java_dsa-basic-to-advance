import java.util.*;

public class RTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,b;

        for(a=0; a<n; a++){
            for(b=0; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
