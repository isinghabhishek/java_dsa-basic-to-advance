
import java.util.HashSet;
// print all the unique SubSequences of a String
public class UniqeSubSequns {

    public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        uniqueSubSequences(str, idx+1, newString+currChar, set);
        // not to be
        uniqueSubSequences(str, idx+1, newString, set);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequences(str, 0, "", set);

    }
}
