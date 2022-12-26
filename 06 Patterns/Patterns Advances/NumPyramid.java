

public class NumPyramid {
    
    public static void number_pyramid(int n){
    // outer loop
        for(int i=1; i<=n; i++){

            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }       
    }

    public static void main(String[] args) {
        number_pyramid(5);
    }
}
