
public class DecToBin {
    // logic to convert the Decimal to Binary

    public static void decToBin(int n){
        int myNum = n;
        int powr=0;
        int binNum=0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)(Math.pow(10, powr)));

            powr++;
            n=n/2;
        }
        System.out.println("Binary Form Of " + myNum + " = "+ binNum);
    }
    public static void main(String[] args) {
        decToBin(11);
    }
}
