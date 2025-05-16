public class CountBSTs {
    // This problem uses Catalan Numbers to count the number of unique BSTs possible with n nodes
    // Catalan Number formula: C(n) = Σ(i=0 to n-1) C(i) * C(n-i-1)
    public static int countBST(int n) {
        int dp[] = new int[n+1]; // dp[i] represents number of unique BSTs possible with i nodes
        
        // Base cases
        dp[0] = 1; // Empty tree is considered as one BST
        dp[1] = 1; // Tree with single node has only one BST
        
        // Fill dp array using bottom-up approach
        for(int i=2; i<n+1; i++) { // For each number of nodes from 2 to n
            for(int j=0; j<i; j++) { // For each possible root position
                // For each root position j:
                // - Left subtree will have j nodes (0 to j-1)
                // - Right subtree will have (i-j-1) nodes (j+1 to i-1)
                int left = dp[j]; // Number of BSTs possible with j nodes
                int right = dp[i-j-1]; // Number of BSTs possible with (i-j-1) nodes
                dp[i] += left * right; // Total BSTs = left subtree possibilities * right subtree possibilities
            }
        }
        return dp[n]; // Return number of unique BSTs possible with n nodes
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countBST(n));
    }
}
