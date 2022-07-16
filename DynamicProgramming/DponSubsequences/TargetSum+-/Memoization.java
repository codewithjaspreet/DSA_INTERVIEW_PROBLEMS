// this problem is same as
// partion subset with sum d  , s1-s2 = d

// leetcode - >  assign + , -

class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for (int a : nums)
            sum += a;

        if (sum - target < 0)
            return 0;

        if ((sum - target) % 2 != 0)
            return 0;

        int s2 = (sum - target) / 2;

        int dp[][] = new int[nums.length][s2 + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        return countPartitionsUtil(nums.length - 1, s2, nums, dp);
    }

    static int countPartitionsUtil(int ind, int target, int[] arr, int[][] dp) {

        if (ind == 0) {
            if (target == 0 && arr[0] == 0)
                return 2;
            if (target == 0 || target == arr[0])
                return 1;
            return 0;
        }

        if (dp[ind][target] != -1)
            return dp[ind][target];

        int notTaken = countPartitionsUtil(ind - 1, target, arr, dp);

        int taken = 0;
        if (arr[ind] <= target)
            taken = countPartitionsUtil(ind - 1, target - arr[ind], arr, dp);

        return dp[ind][target] = (notTaken + taken);
    }
}