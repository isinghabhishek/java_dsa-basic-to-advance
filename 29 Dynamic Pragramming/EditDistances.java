
public class EditDistances {
    public static int editDistances(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        // intialization
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                if(j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        // bottom-up
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) { // same
                    dp[i][j] = dp[i-1][j-1];
                } else { // if characters are diffrent then perform the operation
                    int delete = dp[i-1][j] + 1; // delete operation
                    int add = dp[i][j-1] + 1; // add operation
                    int replace = dp[i-1][j-1] + 1; // replace operation
                    dp[i][j] = Math.min(add, Math.min(delete, replace)); // assining the min of three
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";
        System.out.println(editDistances(str1, str2));
    }
}
