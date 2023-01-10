
// Assingment Que.04
// String Compression Using StringBuilder
// i/p- "aaabbccccdd",  o/p- "a3b2c4d2"

public class StrCompress {

    public static String compStrBuilder(String str){

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
        
            sb.append(str.charAt(i));
            sb.append(count);
            }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccdd";
        System.out.println(compStrBuilder(str));

    }
}
