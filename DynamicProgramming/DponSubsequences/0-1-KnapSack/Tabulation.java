
public class Solution {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        int[][] dp = new int[n][maxWeight + 1];

        for (int W = weight[0]; W <= maxWeight; W++) {

            dp[0][W] = value[0];
        }

        for (int ind = 1; ind < n; ind++) {

            for (int W = 0; W <= maxWeight; W++) {

                int nonTake = dp[ind - 1][W];
                int take = Integer.MIN_VALUE;

                if (weight[ind] <= W) {
                    take = value[ind] + dp[ind - 1][W - weight[ind]];
                }
                dp[ind][W] = Math.max(take, nonTake);
            }
        }

        return dp[n - 1][maxWeight];

    }
}