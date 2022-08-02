
/// logic - n+ m - len(lcs)
class Solution {
    static int[][] dp = new int[1001][1001];

    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X, String Y, int m, int n) {
        // Your code here

        String res = "";

        return (X.length() + Y.length()) - lcs(X, Y);

    }

    public static int lcs(String s1, String s2) {

        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}