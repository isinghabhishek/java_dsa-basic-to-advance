import java.util.*;

// logic for continue Stmt
public class ContinueL {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
