
// Sc - stack space(str1.length()  + str2.length()) + O(str1.length() * str2.length())  stage storage in dp table
// tc -  O(str1.length() * str2.length())  

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int[] row : dp) {

            Arrays.fill(row, -1);
        }

        return helper(text1.length() - 1, text2.length() - 1, text1, text2, dp);
    }

    public static int helper(int i1, int i2, String text1, String text2, int[][] dp) {

        if (i1 < 0 || i2 < 0)
            return 0;

        if (text1.charAt(i1) == text2.charAt(i2)) {

            return 1 + helper(i1 - 1, i2 - 1, text1, text2, dp);
        }

        if (dp[i1][i2] != -1)
            return dp[i1][i2];

        return dp[i1][i2] = Math.max(helper(i1 - 1, i2, text1, text2, dp), helper(i1, i2 - 1, text1, text2, dp));
    }
}