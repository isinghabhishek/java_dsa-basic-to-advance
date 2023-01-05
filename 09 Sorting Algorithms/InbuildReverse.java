
import java.util.Arrays;
import java.util.Collections;
public class InbuildReverse {

    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 2, 3};

        // sorting arrays in reverse order
        // Arrays.sort(arr, Collections.reverseOrder());

        // perticular index to index array sorting
        Arrays.sort(arr, 0,3, Collections.reverseOrder());
        printArr(arr);
    }
    
}
