import java.util.Scanner;

public class RepeatedElement {

    public static boolean repeatedElement(int nums[]){

        for(int i=0; i<nums.length; i++){

            for(int j=0; j<nums.length; j++){
                if(i != j){
                
            if(nums[i] == nums[j]){
                return true;
                }
            }
            }
    }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1, 2, 3, 4};
        System.out.println(repeatedElement(nums));
    }
}
