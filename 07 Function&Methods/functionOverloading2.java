
public class functionOverloading2 {
    //  function overloading using Data Type

    //  function to calculate sum of 2 int value
    public static int sum(int a, int b){
        return a+b;
    }

    //  function to calculate the sum of 2 float values
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 4));
        System.out.println(sum(3.5f, 4.5f));
    }
}
