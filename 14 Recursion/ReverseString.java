public class ReverseString {
    
    public static void printRevresStr(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRevresStr(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRevresStr(str, str.length()-1);
    }
}
