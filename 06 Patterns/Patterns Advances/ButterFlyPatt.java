

public class ButterFlyPatt {
    
    public static void  butter_Fly_pattern(int n){

    // 1st half
        for(int i=1; i<=n; i++){
         // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        // spaces
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }

         // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
            }


        // 2nd Half
            for(int i=n; i>=1; i--){
             //  stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            // spaces 
                for(int j=1; j<=(2*(n-i)); j++){
                    System.out.print(" ");
                }
            // stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
                }
        }
    
    public static void main(String[] args) {
        butter_Fly_pattern(8);
    }
}
