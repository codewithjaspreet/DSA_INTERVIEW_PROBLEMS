public class Solution {
    public static int frogJump(int n, int heights[]) {

        int[] dp = new int[n + 1]; // step 1 - declare dp

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return helper(n - 1, heights, dp); // step 2 - pass in paramneters

    }

    public static int helper(int n, int[] heights, int[] dp) {

        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n]; // step 3 - return if exist

        int left = helper(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);

        int right = Integer.MAX_VALUE;

        if (n > 1)
            right = helper(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);

        return dp[n] = Math.min(left, right); // step 4 - store for future answers

    }

}