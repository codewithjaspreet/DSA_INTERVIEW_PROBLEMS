import java.util.Arrays;

public class Solution {
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int[][] dp = new int[num.length][tar + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(num.length - 1, tar, num, dp);
    }

    public static int helper(int i, int target, int[] nums, int[][] dp) {

        if (i == 0) {

            if (target == nums[i])
                return 1;
            else
                return 0;
        }

        if (target == 0)
            return 1;

        if (dp[i][target] != -1)
            return dp[i][target];

        int take = 0;

        if (nums[i] <= target) {

            take = helper(i - 1, target - nums[i], nums, dp);

        }

        int nonTake = helper(i - 1, target, nums, dp);

        return dp[i][target] = take + nonTake;
    }

}