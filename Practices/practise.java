public class practise {

    public static void genHollowSqr(int rows, int cols) {
        for(int i=1; i<=cols; i++) {
            for(int j=1; j<=cols; j++) {
                if(i == 1 || i == cols || j == 1 || j == cols) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        genHollowSqr(4, 5);
    }
}
