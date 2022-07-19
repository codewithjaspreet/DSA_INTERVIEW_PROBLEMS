
// tc = O(n * n+1)

import java.util.Arrays;

public class Solution {
    public static int cutRod(int price[], int n) {
        // Write your code here.

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(n - 1, price, n, dp);
    }

    public static int helper(int i, int[] price, int n, int[][] dp) {

        if (i == 0) {

            return n * price[0];
        }

        if (dp[i][n] != -1)
            return dp[i][n];

        int notTake = helper(i - 1, price, n, dp);

        int take = Integer.MIN_VALUE;

        int rodLength = i + 1;

        if (rodLength <= n) {

            take = price[i] + helper(i, price, n - rodLength, dp);
        }

        return dp[i][n] = Math.max(take, notTake);
    }
}