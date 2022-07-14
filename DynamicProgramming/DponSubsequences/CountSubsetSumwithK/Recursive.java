
// alter base cases with subset sum equal target good to go
// tle 2^n

public class Solution {
    public static int findWays(int num[], int tar) {
        // Write your code here..

        return helper(num.length - 1, tar, num);
    }

    public static int helper(int i, int target, int[] nums) {

        if (i == 0) {

            if (target == nums[i])
                return 1;
            else
                return 0;
        }
        
        // if elements 0 are also allowed in array
        
//         if(i==0){
        
//             if(target == 0 && arr[0] == 0  ) return 2;
            
//             if(target == 0 || target == arr[0] ) return 1;
            
//             return 0;
//         }

        if (target == 0)
            return 1;

        int take = 0;

        if (nums[i] <= target) {

            take = helper(i - 1, target - nums[i], nums);

        }

        int nonTake = helper(i - 1, target, nums);

        return take + nonTake;
    }

}
