

public class HollowRect {
    
    public static void hollow_Rectangle(int tolRow, int tolColm){
        // outer loop
        for(int i=1; i<=tolRow; i++){
            // inner columns
            for(int j=1; j<=tolColm; j++){
                // cell- (i, j)
                if(i == 1 || i == tolRow || j == 1 || j == tolColm){
                    // boundary cells we have to print star only on the boundary
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }

    }
    public static void main(String[] args) {
        hollow_Rectangle(4, 5);
    }
}
