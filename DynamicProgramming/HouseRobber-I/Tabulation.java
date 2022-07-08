class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];

        return helper(nums.length, nums, dp);
    }

    public static int helper(int n, int[] nums, int[] dp) {

        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1)
                pick += dp[i - 2];
            int nonPick = 0 + dp[i - 1];

            dp[i] = Math.max(pick, nonPick);

        }

        return dp[nums.length - 1];
    }
}