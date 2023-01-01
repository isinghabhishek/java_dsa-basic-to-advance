import java.util.Scanner;

public class  even {
    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Enter an integer: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number Is Odd");
        }
        System.out.println(isEven(9));
    }
}
