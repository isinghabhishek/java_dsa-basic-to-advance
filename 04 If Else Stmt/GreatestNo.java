// find the greatest of three
import java.util.*;
// writing the programm of finding the gretest of three Number
public class GreatestNo{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
            
                if((x>=y) && (x>=z)){
                    System.out.println("The Greatest Number Is: " + x);
                }
                else if(y>=z){
                    System.out.println("The Greatest Number is: " + y);
                }
                else{
                    System.out.println("The Greatest Number is: " + z);
                }
            }
        }
    }