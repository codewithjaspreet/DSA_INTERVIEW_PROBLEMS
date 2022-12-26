package PalindromePartioning;

import java.util.Arrays;


// memoized code for the soln still gives tle
class Solution {
    public int minCut(String s) {

        int[][] dp = new int[s.length() + 1][s.length() + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(s, 0, s.length() - 1, dp);
    }

    static int helper(String s, int i, int j, int[][] dp) {

        if (i >= j || i == j)
            return 0;

        if (isPalindrome(s, i, j))
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {

            int temp = 1 + helper(s, i, k, dp) + helper(s, k + 1, j, dp);

            ans = Math.min(temp, ans);
        }

        return dp[i][j] = ans;
    }

    static boolean isPalindrome(String s, int i, int j) {

        int left = i;
        int right = j;

        char[] ch = s.toCharArray();

        while (left < right) {

            if (ch[left] != ch[right])
                return false;
            else
                left++;
            right--;
        }

        return true;
    }
}