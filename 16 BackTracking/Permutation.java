

public class Permutation {
    
    public static void findPermuation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recursion  TC- O(n * n!)
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermuation(newStr, ans+curr);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        findPermuation(str, "");
    }
}
