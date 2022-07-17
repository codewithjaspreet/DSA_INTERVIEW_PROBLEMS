import java.util.Arrays;

public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.

        int[][] dp = new int[n][w + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(n - 1, w, profit, weight, dp);
    }

    public static int helper(int i, int w, int[] profit, int[] weight, int[][] dp) {

        if (i == 0) {

            return (int) w / weight[0] * profit[0];
        }

        if (dp[i][w] != -1)
            return dp[i][w];

        int take = Integer.MIN_VALUE;

        if (weight[i] <= w) {

            take = profit[i] + helper(i, w - weight[i], profit, weight, dp);
        }

        int notTake = helper(i - 1, w, profit, weight, dp);

        return dp[i][w] = Math.max(take, notTake);
    }
}
