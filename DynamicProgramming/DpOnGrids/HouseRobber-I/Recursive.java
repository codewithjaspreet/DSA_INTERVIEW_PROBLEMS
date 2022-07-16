
// brute force - o(2^N);
// print subsequences with the given constraints;
// no 2 elements can be adjacent so  , i - 2 ;

class Solution {
    public int rob(int[] nums) {

        int pick = Integer.MIN_VALUE;
        int notpick = Integer.MIN_VALUE;

        return helper(nums.length - 1, nums, pick, notpick);
    }

    public static int helper(int i, int[] nums, int pick, int notPick) {

        if (i == 0)
            return nums[i];

        if (i < 0)
            return 0;

        pick = nums[i] + helper(i - 2, nums, pick, notPick);

        notPick = helper(i - 1, nums, pick, notPick);

        return Math.max(pick, notPick);
    }
}