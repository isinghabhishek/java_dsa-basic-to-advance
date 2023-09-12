

public class RemoveDuplicate {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // for idx --> [currChar - 'a']
        if(map[currChar-'a'] == true){
            // Duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
                removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "abhiisxk";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
