
public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        //  Time Complexity- O(n^2)
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if( i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // optimized Code- O(n)
        for(int i=0; i<matrix.length; i++){
            // Primary Diagonal
            sum += matrix[i][i];
            // Secondary Diagonal
            if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-i-1];
            }
        }

        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }    
}
