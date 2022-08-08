
//tle - 2^n

// express in index
// explore all subsequences
// look for increasing
//store the length

class Solution {
    public int lengthOfLIS(int[] nums) {

        return util(0, -1, nums, dp);

    }

    int util(int ind, int prev, int[] nums, int[][] dp) {

        if (ind == nums.length)
            return 0;

        int notTake = 0 + util(ind + 1, prev, nums, dp);

        int take = -1;

        if (prev == -1 || nums[ind] > nums[prev]) {

            take = 1 + util(ind + 1, ind, nums, dp);
        }

        return Math.max(take, notTake);

    }
}
