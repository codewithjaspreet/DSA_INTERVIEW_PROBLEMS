
public class Solution {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        int[] prev = new int[maxWeight + 1];

        for (int W = weight[0]; W <= maxWeight; W++) {

            prev[W] = value[0];
        }

        for (int ind = 1; ind < n; ind++) {

            for (int W = maxWeight; W >= 0; W--) {

                int nonTake = prev[W];
                int take = Integer.MIN_VALUE;

                if (weight[ind] <= W) {
                    take = value[ind] + prev[W - weight[ind]];
                }
                prev[W] = Math.max(take, nonTake);

            }
        }

        return prev[maxWeight];

    }
}