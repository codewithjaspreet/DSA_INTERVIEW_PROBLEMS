
// tle - O(2^N)
class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int a : nums) {
            sum += a;
        }

        if (sum % 2 != 0)
            return false;

        int n = nums.length;

        return helper(n - 1, sum / 2, nums);
    }

    public static boolean helper(int i, int target, int[] nums) {

        if (target == 0)
            return true;

        if (i == 0)
            return nums[0] == target;

        boolean take = false;

        if (nums[i] <= target) {

            take = helper(i - 1, target - nums[i], nums);
        }

        boolean notTake = helper(i - 1, target, nums);

        return take || notTake;
    }
}