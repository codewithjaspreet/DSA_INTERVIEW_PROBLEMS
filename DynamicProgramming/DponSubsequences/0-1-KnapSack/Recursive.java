
// tle recursive , same take and non take concept
public class Solution {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        return helper(weight, value, n - 1, maxWeight);

    }

    public static int helper(int[] weight, int[] value, int i, int W) {

        if (i == 0) {

            if (weight[0] <= W)
                return value[0];
            return 0;
        }

        int take = Integer.MIN_VALUE;

        if (weight[i] <= W) {

            take = value[i] + helper(weight, value, i - 1, W - weight[i]);
        }

        int notTake = helper(weight, value, i - 1, W);

        return Math.max(take, notTake);

    }
}