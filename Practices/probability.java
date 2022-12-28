import java.util.*;
public class probability {
    public static float probablity(int arr[], int N, int X){
        ArrayList<Integer> list = new ArrayList<>();

        // int k = 0;
        for(int i=0; i<N; i++){
            if(arr[i] > X){
                list.add(arr[i]);
            }
            if(list.size() == 0){
                list.add(-1);
            }
        }
        float prob = list.size();
        return prob/N;
    }
    public static void main(String[] args) {
        int arr[] = {10, 8, 3, 1};
        System.out.println(probablity(arr, 4, 8));
    }
}
