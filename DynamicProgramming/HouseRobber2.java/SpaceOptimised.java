
// slight modification with house robber - 1

// first and last cant be together so , we consider 2 case

//  Max( [0 ,n-2]  , [1 , n-1] );  // base case for 1 element  - return nums[0];

// rest all 3 solutions same as this logic just need to write those steps  of memoized,tabulation & recurrence

class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int[] temp1 = new int[nums.length];

        for (int i = 0; i < temp1.length; i++) {

            if (i != 0)
                temp1[i] = nums[i];
        }

        int[] temp2 = new int[nums.length];

        for (int i = 0; i < temp2.length; i++) {

            if (i != nums.length - 1)
                temp2[i] = nums[i];
        }

        return Math.max(helper(temp1), helper(temp2));

    }

    public int helper(int[] nums) {

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < nums.length; i++) {

            int take = nums[i];

            if (i > 1)
                take += prev2;

            int nonTake = 0 + prev;

            int curi = Math.max(take, nonTake);

            prev2 = prev;
            prev = curi;
        }

        return prev;
    }
}