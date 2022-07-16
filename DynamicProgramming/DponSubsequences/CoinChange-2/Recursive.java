class Solution {
    public int change(int amount, int[] coins) {

        int ans = helper(coins.length - 1, amount, coins, dp);

        return ans;
    }

    public static int helper(int i, int amount, int[] coins) {

        if (i == 0) {

            if (amount % coins[0] == 0)
                return 1;

            return 0;

        }

        int take = 0;

        if (coins[i] <= amount) {

            take = helper(i, amount - coins[i], coins);
        }

        int notTake = helper(i - 1, amount, coins);

        return take + notTake;
    }
}