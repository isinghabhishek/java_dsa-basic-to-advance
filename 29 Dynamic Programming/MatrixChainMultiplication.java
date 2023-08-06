import java.util.Arrays;
// Matrix Chain Multiplication
public class MatrixChainMultiplication {

    public static int mcmRec(int arr[], int i, int j) {
        // single matrix case
        if(i == j) {
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcmRec(arr, i, k); // Ai...Ak => arr[i-1]*arr[k]
            int cost2 = mcmRec(arr, k+1, j); // Ak+1...Aj => arr[k]*arr[j] 
            int cost3 = arr[i-1] * arr[j] * arr[k];
            int finalCost = cost1+cost2+cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }
    // Memoization
    public static int mcmMem(int arr[], int i, int j, int dp[][]) {
        // single matrix case
        if(i == j) return 0;
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        for(int k=i; k<=j-1; k++) {
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[j] * arr[k];
            ans = Math.min(ans, (cost1+cost2+cost3));
        }
        return dp[i][j] = ans;
    }
    // Tabulation
    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        // intialization
        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }
        for(int len=2; len<=n-1; len++) {
            for(int i=1; i<=n-len; i++) {
               int j = i+len-1; // col
               dp[i][j] = Integer.MAX_VALUE;
               for(int k=i; k<=j-1; k++) {
                int cost1 = dp[i][k];
                int cost2 = dp[k+1][j];
                int cost3 = arr[i-1]*arr[j]*arr[k];
                dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
               }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    // printing the dp[][] Matrix
    public static void print(int dp[][]) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        // Memorization
        // int n = arr.length;
        // int dp[][] = new int[n][n];
        // for(int i=0; i<n; i++) {
        //     Arrays.fill(dp[i], -1);
        // }
        // System.out.println(mcmMem(arr, 1, n-1, dp));

        // Tabulation
        System.out.println(mcmTab(arr));
    }
}
