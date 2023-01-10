

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Abhishek";
        String s2 = "Abhishek";
        String s3 = new String("Abhishek");

        if(s1 == s2){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings Are Not Equals");
        }

        if(s1 == s3){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings Are Not Equals");
        }

        // .equals() Function
        if(s1.equals(s3)){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings Are Not Equals");
        }
    }
    
}
