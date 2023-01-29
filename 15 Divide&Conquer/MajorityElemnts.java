public class MajorityElemnts {

        private static int countInRange(int nums[], int num, int si, int ei){
            int count = 0;
            for(int i=si; i<ei; i++){
                if(nums[i] == num){
                    count++;
                }
            }
            return count;
        }
        
        private static int majorityElementsRec(int nums[], int si, int ei){
            if(si == ei){
                return nums[si];
            }
            
            int mid = si + (ei-si)/2;
            int left = majorityElementsRec(nums, si, mid);
            int right = majorityElementsRec(nums, mid+1, ei);
            if(left == right){
                return left;
            }
            
            int leftCount = countInRange(nums, left, si, ei);
            int rightCount = countInRange(nums, right, si, ei);
            return leftCount > rightCount ? left : right;
        }
        
        public static int majorityElement(int[] nums) {
             return majorityElementsRec(nums, 0, nums.length-1);
            
        }
    public static void main(String[] args) {
        int nums[] = {8, 9, 8, 9, 8};
        System.out.println(majorityElement(nums));
    }
    
}
