import java.util.*;

// Switch Statements for Weeks
public class Weeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Week Number :");
        int Week = sc.nextInt();

        switch(Week){
            case 1 : System.out.println("Monday");
                    break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("Wednesday");
                    break;
            case 4 : System.out.println("Thursday");
                    break;       
            case 5 : System.out.println("Friday");
                    break;
            case 6 : System.out.println("Satuday");
                    break;
            case 7 : System.out.println("Sunday");
                    break;
            default : System.out.println("Invalid Number");
                    break;

        
        
        
                }

    }
}
