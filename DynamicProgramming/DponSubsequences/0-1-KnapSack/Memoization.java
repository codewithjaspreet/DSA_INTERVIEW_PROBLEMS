import java.util.Arrays;

// time complexity - O(n * w)

public class Solution {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        int[][] dp = new int[n + 1][maxWeight + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(weight, value, n - 1, maxWeight, dp);

    }

    public static int helper(int[] weight, int[] value, int i, int W, int[][] dp) {

        if (i == 0) {

            if (weight[0] <= W)
                return value[0];
            return 0;
        }

        if (dp[i][W] != -1)
            return dp[i][W];

        int take = Integer.MIN_VALUE;

        if (weight[i] <= W) {

            take = value[i] + helper(weight, value, i - 1, W - weight[i], dp);
        }

        int notTake = helper(weight, value, i - 1, W, dp);

        return dp[i][W] = Math.max(take, notTake);

    }
}