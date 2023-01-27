

public class RecursionBasic {

    public static void printDecs(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecs(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int NaturalSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = NaturalSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        } 
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurences(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurences(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    public static int optimizePower(int x, int n){
        if(n == 0){
            return 1;
        }
        // int halfPowerSq = optimizePower(x, n/2) * optimizePower(x, n/2);
        // reducing above exprestion to reduces the Time Complexity. 
        int halfPower = optimizePower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        
        int n = 26;
        // printDecs(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(NaturalSum(n));
        // System.out.println(fib(n));
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurences(arr, 5, 0));
        // System.out.println(power(2, 10));
        System.out.println(optimizePower(2, 10));

    }
    
}
