// tle
public class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.

        return helper(n - 1, w, profit, weight);
    }

    public static int helper(int i, int w, int[] profit, int[] weight) {

        if (i == 0) {

            return (int) w / weight[0] * profit[0];
        }

        int take = Integer.MIN_VALUE;

        if (weight[i] <= w) {

            take = profit[i] + helper(i, w - weight[i], profit, weight);
        }

        int notTake = helper(i - 1, w, profit, weight);

        return Math.max(take, notTake);
    }
}
