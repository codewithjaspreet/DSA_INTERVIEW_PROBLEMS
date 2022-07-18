
// tle  - unbounded knapsack extension

public class Solution {
    public static int cutRod(int price[], int n) {
        // Write your code here.

        return helper(n - 1, price, n);
    }

    public static int helper(int i, int[] price, int n) {

        if (i == 0) {

            return n * price[0];
        }

        int notTake = helper(i - 1, price, n);

        int take = Integer.MIN_VALUE;

        int rodLength = i + 1;

        if (rodLength <= n) {

            take = price[i] + helper(i, price, n - rodLength);
        }

        return Math.max(take, notTake);
    }
}