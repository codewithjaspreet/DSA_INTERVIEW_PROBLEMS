class Solution {
    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {

            Arrays.fill(row, -1);
        }

        int ans = helper(coins.length - 1, amount, coins, dp);
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;

    }

    public static int helper(int i, int amount, int[] coins, int[][] dp) {

        if (i == 0) {

            if (amount % coins[i] == 0)
                return amount / coins[i];

            else
                return (int) Math.pow(10, 9);
        }

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int take = Integer.MAX_VALUE;

        if (coins[i] <= amount) {

            take = 1 + helper(i, amount - coins[i], coins, dp);
        }

        int nonTake = helper(i - 1, amount, coins, dp);

        return dp[i][amount] = Math.min(take, nonTake);
    }
}