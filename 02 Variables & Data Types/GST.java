import java.util.*;

public class GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencile = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float price = pencile + pen + eraser;
        System.out.println("Bill is :" + price);

        float bill = (price + (0.18f*price));

        System.out.println("Bill with 18% tax :" + bill);
    }
}


