import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Body Temp : ");
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("You Have Fever.");
        }
        else{
            System.out.println("You Don't Have Fever.");
        }
    }
}
