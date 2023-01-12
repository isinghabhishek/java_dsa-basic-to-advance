

public class UpperCaseToLower {
    public static void main(String[] args) {
        
        // convert uppercase character to lowerCase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
            // print abcdefghijklmnopqrstuvwxyz
        }
    }   
}
