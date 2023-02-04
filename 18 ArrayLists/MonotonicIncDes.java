
import java.util.ArrayList;
public class MonotonicIncDes {

    public static boolean isMonotonic(ArrayList<Integer> nums){
        boolean inc = true;
        boolean desc= true;

        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                inc = false;;
            }
            if(nums.get(i) < nums.get(i+1))
                desc = false;
        }
        return inc || desc;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(4);

        System.out.println(isMonotonic(nums));
    }
    
}
