import java.util.*;
public class ClimbingStaires {
    // Recursive approach to count ways to climb n stairs
    // Time Complexity: O(2^n)
    public static int ContWaysRec(int n) {
        if(n == 0) return 1; // Base case: 1 way to stay at ground
        if(n < 0) return 0; // Base case: no way to climb negative stairs
        return ContWaysRec(n-1) + ContWaysRec(n-2); // Recurrence relation
    }

    // Memoization (Top-Down DP) approach
    // Time Complexity: O(n)
    public static int countWays(int n, int ways[]) {
        if(n == 0) return 1; // Base case: 1 way to stay at ground
        if(n < 0) return 0; // Base case: no way to climb negative stairs
        if(ways[n] != -1) {
            return ways[n]; // Return stored value if already computed
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways); // Store and return
        return ways[n];
    }

    // Tabulation (Bottom-Up DP) approach
    // Time Complexity: O(n)
    public static int countWaysTab(int n) {
        int dp[] = new int[n+1]; // dp[i] will store ways to climb i stairs
        dp[0] = 1; // Base case: 1 way to stay at ground
        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1] + 0; // Only one way to climb 1 stair
            } else {
                dp[i] = dp[i-1] + dp[i-2]; // Recurrence relation
            }
        } 
        return dp[n]; // Return ways to climb n stairs
    }

    public static void main(String[] args) {
        int n = 5; // Example: number of stairs
        int ways[] = new int[n+1]; // Array for memoization
        Arrays.fill(ways, -1); // Initialize with -1
        System.out.println(countWaysTab(n)); // Output: 8
    }
}
