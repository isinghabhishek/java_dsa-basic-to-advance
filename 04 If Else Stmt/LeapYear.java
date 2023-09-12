import java.util.*;

// writing the Program to find the Leap year
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year : ");    
        int year = sc.nextInt();

        if(year%4 == 0){

            if(year%100 == 0){

                if(year%400 == 0)
                    System.out.println(year + " is Leap Year.");
                else
                 System.out.println(year + " is Not a Leap Year.");
            } 
            else
            System.out.println(year + " is a Leap Year.");
        }
        else 
        System.out.println(year + " is Not a Leap Year.");
    }
}


