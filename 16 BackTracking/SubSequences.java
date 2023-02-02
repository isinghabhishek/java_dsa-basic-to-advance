

public class SubSequences {

    public static void findSubSequences(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else{
            System.out.println(ans);
            }
            return;
        }
        // yes Choices
        findSubSequences(str, ans+str.charAt(i), i+1);
        // no choice
        findSubSequences(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSequences(str, "", 0);
    }
}
