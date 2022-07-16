class Solution {
    public int coinChange(int[] coins, int amount) {

        int ans = helper(coins.length - 1, amount, coins);
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;

    }

    public static int helper(int i, int amount, int[] coins) {

        if (i == 0) {

            if (amount % coins[i] == 0)
                return amount / coins[i];

            else
                return (int) Math.pow(10, 9);
        }

        int take = Integer.MAX_VALUE;

        if (coins[i] <= amount) {

            take = 1 + helper(i, amount - coins[i], coins);
        }

        int nonTake = helper(i - 1, amount, coins);

        return Math.min(take, nonTake);
    }
}