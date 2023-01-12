

public class EvenOdd {

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd NUmber");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(15);
        oddOrEven(20);
    
    }
    
}
