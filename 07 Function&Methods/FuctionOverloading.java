import java.util.*;

public class FuctionOverloading {
    // function to calculated sum of 2 nums
    public static int sum(int a, int b){
        return a+b;
    }    

    // function to calculate sum of 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(sum(5, 7));
        System.out.println(sum(9, 5, 2));
    }
}
