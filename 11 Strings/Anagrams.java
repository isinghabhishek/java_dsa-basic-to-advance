import java.util.Arrays;

// If two Strings contain the same characters but in a different order, 
// they can be said to be Anagrams
//  "race"  and  "care"

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // Convert String to LowerCase. Why? so that we don't
        //  have to check seperately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if(str1.length() == str2.length()){
            // Convert string into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are same or indentical then the
            // strings are anagram.
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
    }
    
}
