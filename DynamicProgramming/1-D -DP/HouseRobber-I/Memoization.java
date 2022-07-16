class Solution {
    public int rob(int[] nums) {

        int pick = Integer.MIN_VALUE;
        int notpick = Integer.MIN_VALUE;
        int[] dp = new int[nums.length]; // memoized - step - 1
        Arrays.fill(dp, -1);

        return helper(nums.length - 1, nums, pick, notpick, dp);
    }

    public static int helper(int i, int[] nums, int pick, int notPick, int[] dp) {

        if (i == 0)
            return nums[i];

        if (i < 0)
            return 0;

        if (dp[i] != -1)
            return dp[i]; // memoized -step2

        pick = nums[i] + helper(i - 2, nums, pick, notPick, dp);

        notPick = helper(i - 1, nums, pick, notPick, dp);

        return dp[i] = Math.max(pick, notPick); // memoized - 3
    }
}