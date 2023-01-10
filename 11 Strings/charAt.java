import java.util.*;

public class charAt {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {

        // char arr[] = {'a', 'b', 'c', 'd'};

        // String str = "abcd";
        // String str2 = "xyz@123";
        
        // // String are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();  // single word
        // name = sc.nextLine();

        // Cocatination
        String firstName = "Abhishek";
        String lastName = "Singh";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.charAt(2));
        printLetters(fullName);
    }
    
}
