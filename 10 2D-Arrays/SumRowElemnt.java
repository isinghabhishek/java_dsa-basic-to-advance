

public class SumRowElemnt {

    public static void sumRow(int nums[][]){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j] == nums[1][j]){
                    sum += nums[1][j];
                    break;
                }
            }
        }
        System.out.println("The Sum of the Second Row is : " + sum);
    }
    public static void main(String[] args) {
        int [][] nums = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};
        sumRow(nums);
    }    
}
