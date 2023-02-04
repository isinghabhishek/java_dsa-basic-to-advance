import java.util.ArrayList;

public class MostFrequent {

    public static int mostFrequenct(ArrayList<Integer> nums, int key){
        int result[] = new int[1000];
        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        System.out.println(mostFrequenct(nums, 1));
    }
}
