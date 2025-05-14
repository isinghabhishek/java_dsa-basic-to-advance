public class CoinChange {
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1]; // dp[i][j] will store the number of ways to make sum j using first i coins

        // Initialize the dp table
        // If sum is 0, then there is 1 way (no coins)
        for(int i=0; i<n+1; i++) {
            dp[i][0] = 1;
        }
        // If no coins are available, then there is 0 way to make any sum > 0
        for(int j=1; j<sum+1; j++) {
            dp[0][j] = 0;
        }

        // Fill the dp table using bottom-up approach
        // O(N * Sum)
        for(int i=1; i<n+1; i++) { // Iterate through each coin
            for(int j=1; j<sum+1; j++) { // Iterate through each sum value
                // If the current coin's value is less than or equal to the current sum
                if(coins[i-1] <= j) { // valid
                    // Two choices:
                    // 1. Include the current coin: dp[i][j-coins[i-1]] (ways to make remaining sum with current coin)
                    // 2. Exclude the current coin: dp[i-1][j] (ways to make sum with previous coins)
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                } else { // If the current coin's value is greater than the current sum, exclude the coin
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum]; // Return the number of ways to make the sum using all coins
    }
    public static void main(String[] args) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        System.out.println(coinChange(coins, sum));
    }
}
