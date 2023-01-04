

public class pairsArr {

    public static void printPairs(int numbers[]){
        int totalPairs=0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];    // 2, 4, 6, 8, 10

            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
    
}
