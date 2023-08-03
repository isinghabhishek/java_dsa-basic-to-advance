public class StringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        //intialization
        for(int i=0; i<n+1; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<m-1; j++) {
            dp[0][j] = 0;
        }
        if(n == 0 || m == 0) return 0;
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int stringConversion(String str1, String str2) {
        int del = str1.length() - lcs(str1, str2);
        int inst = str2.length() - lcs(str1, str2);
        return del+inst;
    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        System.out.println(stringConversion(str1, str2));
    }
}
