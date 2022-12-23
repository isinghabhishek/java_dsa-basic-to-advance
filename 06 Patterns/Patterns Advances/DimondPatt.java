

public class DimondPatt {
    
    public static void diamond_Pattern(int n) {
        // first half
        for(int i=1; i<=n; i++) {
            //  SPACES
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=((2*i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for(int i=n; i>=1; i--) {
            //  SPACES
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=((2*i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        diamond_Pattern(5);
    }
}
