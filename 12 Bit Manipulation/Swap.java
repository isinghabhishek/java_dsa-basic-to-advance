import java.util.Scanner;



public class Swap {

    // 1.  x^x = 0
    public static int XOR(int x){
        return x^x;
    }
    
    //  Swapping Without Using third Variable [Using XOR]
    public static void SwappingWithXOR(int x, int y){
        if(x != y){
            x = x^y;
            y = x^y;
            x = x^y;
        }
        System.out.println("Swapped value of x is : " + x );
        System.out.println("Swapped value of y is : " + y );
    }

    // Add 1 to an Integer
    //  -(~x) = x+1
        public static int addOneToAnInt(int p){
            return (-(~p));
        }
    public static void main(String[] args) {
        
        // SwappingWithXOR(5, 4);
        // System.out.println(XOR(8));
        System.out.println(addOneToAnInt(9));
    }
    
}
