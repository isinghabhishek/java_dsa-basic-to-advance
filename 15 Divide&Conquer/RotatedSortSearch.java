

public class RotatedSortSearch {
    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        //Case FOUND
        if(arr[mid] == tar){
            return mid;
        }
        // mid on L1
        if(arr[si] <= arr[mid]){
            // Case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else{
                // Case b : right
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else{
            // case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else{
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 1;
        int idx = search(arr, target, 0, arr.length-1);
        System.out.println(idx);
    }
    
}
