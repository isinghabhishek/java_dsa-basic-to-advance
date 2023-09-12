import java.util.*;

// writing Program to Apply the Break Condition
public class breakL {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop.");
    }
}
