
public class subArray{

    public static void printSubArrays(int numbers[]){
        int totalSubArr=0;
        int subArrSum=0;

        for(int i=0; i<numbers.length; i++){
            int start=i;

            for(int j=i; j<numbers.length; j++){
                int end = j;

                for(int k=start; k<=end; k++){   // print
                    System.out.print(numbers[k]+" ");//subArrays

                }
                    totalSubArr++;
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = " +totalSubArr);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}