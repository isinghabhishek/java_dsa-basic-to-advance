// Catalan's Number computation using Recursion, Memoization, and Tabulation
public class CatalansNumber {
    // Recursive approach to calculate the nth Catalan number
    public static int catalanRec(int n) {
        // Base Case: C0 = 1, C1 = 1
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0; // To store the result for Cn
        // Recurrence relation: Cn = sum(Ci * Cn-i-1) for i = 0 to n-1
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRec(i) * catalanRec(n - i - 1);
        }
        return ans;
    }

    // Memoization (Top-Down DP) approach
    public static int catalanMem(int n, int dp[]) {
        // Base Case: C0 = 1, C1 = 1
        if (n == 0 || n == 1)
            return 1;
        // If already computed, return the stored value
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        // Recurrence relation with memoization
        for (int i = 0; i < n; i++) {
            ans += catalanMem(i, dp) * catalanMem(n - i - 1, dp);
        }
        // Store the result in dp array
        return dp[n] = ans;
    }

    // Tabulation (Bottom-Up DP) approach - O(n^2)
    public static int catalanTab(int n) {
        int dp[] = new int[n + 1]; // dp[i] will store the ith Catalan number
        dp[0] = 1; // C0
        dp[1] = 1; // C1
        // Fill dp[] in bottom-up manner
        for (int i = 2; i < n + 1; i++) { // Compute Ci
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1]; // Ci = sum(Cj * Ci-j-1)
            }
        }
        return dp[n]; // Return the nth Catalan number
    }

    public static void main(String args[]) {
        // Example usage:
        // int n = 4;
        // System.out.println(catalanRec(n)); // Recursive

        // Memoization
        // int dp[] = new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(catalanMem(4, dp));

        // Tabulation
        System.out.println(catalanTab(4)); // Output: 14
    }
}
