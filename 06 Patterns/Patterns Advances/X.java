import java.util.Scanner;
import java.util.*;

// o/p =>
//          1       1
//           2     2 
//            3   3  
//             4 4   
//              5    
//             4 4   
//            3   3  
//           2     2
//          1       1

public class X {
    public static void printCross(int n) {
        int m = n*2 - 1;
        int k = 1;
        int flag = 1;
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=m; j++) {
                if((i == j) || (j == (n*2) - i)) {
                    System.out.print(k);
                }else{
                    System.out.print(" ");
                }
            }
            if(flag == 1 && k < n) {
                k++;
            }else {
                flag = 0;
                k--;
            }
            System.out.println();   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printCross(n);
    }
}