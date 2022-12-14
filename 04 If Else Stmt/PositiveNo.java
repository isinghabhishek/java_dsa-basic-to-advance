import java.util.*;

public class PositiveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The Entered Number is Positive");
        }
        else{
            System.out.println("The Entered Number is Negative Number");
        }
    }
}
