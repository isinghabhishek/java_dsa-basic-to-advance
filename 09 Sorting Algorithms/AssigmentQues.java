
// Use the following sorting algorithms to sort an array in DESCENDING order :
// a.Bubble Sort
// b.Selection Sort
// c.Insertion Sort
// d.Counting Sort
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

public class AssigmentQues {

    // Bubble Sort
    public static void bubbleSort(int arr[]){
        // i = turns
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=0; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;

            }
        }
    }

    // Insertion Sorting 
    public static void insertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    // Counting  Sort Array
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    // printing Array Code
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArr(arr);

    }
}
