
//  Searching element in thr matrix and, 
//  finding the largest and Smallest Element 
//  in the Given matrix.

import java.util.Scanner;

public class Search2DElemnt {

    // Searching the Element in Matrix.
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("Found at cell ("+ i + "," + j + ") ");
                    return true;
                }
            }
        }
        return false;
    }

    // Finding the largest Element in the matrix
    public static int findMax(int matrix[][]){
        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    // Finding the Smallest Element in the Given Matrix
    public static int findMin(int matrix[][]){
        int minElement = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < minElement){
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length,  m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // search(matrix, 5);
        System.out.println("The Largest Element in the Matrix is : " + findMax(matrix));;
        System.out.println("The Smallest Element in the Matrix is : " +findMin(matrix));
    }
    
}
