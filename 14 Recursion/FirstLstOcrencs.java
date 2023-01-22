public class FirstLstOcrencs {

    public static int first = -1;
    public static int last = -1;
    
    public static void findOccurances(String str, int idx, char elemnt){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == elemnt){
            if(first == -1){
                first = idx;
            } else{
                last = idx;
            }
        }
        findOccurances(str, idx+1, elemnt);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurances(str, 0, 'a');
    }
}
