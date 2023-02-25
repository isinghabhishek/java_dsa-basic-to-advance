
import java.util.*;
public class ActivityCodeForUnsorted {
    
    public static void main(String[] args) {  //O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //Sorting
        int activiteies[][] = new int [start.length][3];
        for(int i=1; i<start.length; i++){
            activiteies[i][0] = i;
            activiteies[i][1] = start[i];
            activiteies[i][2] = end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activiteies, Comparator.comparingDouble(o -> o[2]));

        // end time basis Sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activiteies[0][0]);
        int lastEnd = end[activiteies[0][2]];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                // activity select
                maxAct++;
                ans.add(activiteies[i][0]);
                lastEnd = activiteies[i][2];
            }
        }
        System.out.println(("Max Activities = " + maxAct));
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}
