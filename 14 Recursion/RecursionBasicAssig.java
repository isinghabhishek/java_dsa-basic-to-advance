public class RecursionBasicAssig {

    // print Occured indices of key
    public static void allOccurrences(int arr[], int key, int i){
        //Base case
        if(i == arr.length){
            return;
        }
        // kaam
        if(arr[i] == key){
           System.out.print(i+" ");
        }
        allOccurrences(arr, key, i+1);
    }
// printing the digits by converting it into String of English 
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
// printing the length of String using Recursion
    public static int lengthStr(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthStr(str.substring(1)) + 1;
    }
// count the contiguons subString starting and ending with the same Character
    public static int contiguonsSubString(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int res = contiguonsSubString(str, i+1, j, n-1) +
                    contiguonsSubString(str, i, j-1, n-1) -
                    contiguonsSubString(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    //Tower Of Hanoi
    public static void towerOfHanoi(int n, String Src, String Hlpr, String Dest){
        if(n == 1){
            System.out.println("transefr disk "+ n +" from "+ Src +" to "+ Dest);
            return;
        }
        towerOfHanoi(n-1, Src, Dest, Hlpr);
        System.out.println("transefr disk "+ n +" from "+ Src +" to "+ Dest);
        towerOfHanoi(n-1, Hlpr, Src, Dest);
    }
    
    public static void main(String[] args) {

        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // allOccurrences(arr, key, 0);
        // System.out.println();

        // printDigits(2001);
        // System.out.println();

        // String str = "Abhishek Singh";
        // System.out.println(lengthStr(str));;

        // String str = "abcab";
        // int n = str.length();
        // System.out.println(contiguonsSubString(str, 0, n-1, n));

        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
