class Solution {
    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {

            Arrays.fill(row, -1);
        }

        int ans = helper(coins.length - 1, amount, coins, dp);

        return ans;
    }

    public static int helper(int i, int amount, int[] coins, int[][] dp) {

        if (i == 0) {

            if (amount % coins[0] == 0)
                return 1;

            return 0;

        }

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int take = 0;

        if (coins[i] <= amount) {

            take = helper(i, amount - coins[i], coins, dp);
        }

        int notTake = helper(i - 1, amount, coins, dp);

        return dp[i][amount] = take + notTake;
    }
}