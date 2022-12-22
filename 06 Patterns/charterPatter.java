import java.util.*;

public class charterPatter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            // Inner Loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
