// stack space removed

class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.

        int[][] dp = new int[n][w + 1];

        for (int i = weight[0]; i <= w; i++) {
            dp[0][i] = ((int) i / weight[0]) * profit[0];
        }

        for (int ind = 1; ind < n; ind++) {
            for (int cap = 0; cap <= w; cap++) {

                int notTaken = 0 + dp[ind - 1][cap];

                int taken = Integer.MIN_VALUE;
                if (weight[ind] <= cap)
                    taken = profit[ind] + dp[ind][cap - weight[ind]];

                dp[ind][cap] = Math.max(notTaken, taken);
            }
        }

        return dp[n - 1][w];

    }
}