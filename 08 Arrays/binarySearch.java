/**
 * This class implements the Binary Search algorithm.
 * Binary Search is an efficient algorithm for finding an element in a sorted array.
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class binarySearch {

    /**
     * Performs binary search on a sorted array to find the index of a key.
     * @param numbers The sorted array to search in
     * @param key The element to find
     * @return The index of the key if found, -1 if not found
     */
    public static int Binary_Search(int numbers[], int key){
        // Initialize the search boundaries
        int start = 0; 
        int end = numbers.length - 1;

        // Continue searching while the search space is valid
        while(start <= end){
          // Calculate the middle index
          int mid = (start + end)/2;

          // If element is found at mid, return its index
          if(numbers[mid] == key ){
            return mid;
          }

          // If key is greater than mid element, search in right half
          if(numbers[mid] < key){  //Right
            start = mid + 1;
          } else{  // If key is smaller than mid element, search in left half
            end = mid - 1;
          }
        }
        // Return -1 if element is not found
        return -1;  //invalid index
    }
    
    public static void main(String[] args) {
        // Test array must be sorted for binary search to work
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10; 

        // Print the result of the search
        System.out.println("Index for key is : "+ Binary_Search(numbers, key));
    }
}
