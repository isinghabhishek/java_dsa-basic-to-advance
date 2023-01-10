

public class LexicoGraphical {

    public static void main(String[] args) {
        String fruits[] = {"apples", "mango", "banana", "pineapples", "stawberry"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
