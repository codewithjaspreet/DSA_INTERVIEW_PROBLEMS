
// brute force , time complexity O(n^3) , space complexity O(1)
// 200 / 209 test cases passed , time limit exceeded on leetcode
class Solution {
    public int maxSubArray(int[] nums) {

        int max_sum = Integer.MIN_VALUE;

        int n = nums.length;

        if (n == 1) {

            return nums[0];
        }

        for (int i = 0; i <= n - 1; i++) {

            for (int j = i; j <= n - 1; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {

                    sum = sum + nums[k];

                    max_sum = Math.max(sum, max_sum);
                }

            }
        }
        return max_sum;
    }

}

// better - time complexity O(n^2) , space complexity O(1)
// 204 / 209 test cases passed , time limit exceeded on leetcode

class Solution {
    public int maxSubArray(int[] nums) {

        int max_sum = Integer.MIN_VALUE;

        int n = nums.length;

        if (n == 1) {

            return nums[0];
        }

        for (int i = 0; i <= n - 1; i++) {

            int sum = 0;

            for (int j = i; j <= n - 1; j++) {

                sum = sum + nums[j];

                max_sum = Math.max(sum, max_sum);

            }
        }
        return max_sum;
    }

}

// optimized - time complexity O(n) , space complexity O(1)
// kadane's algorithm
// algortihm

// if coming is positive , add it to the current sum
// if coming is -ve , start a new sum from the current element
// keep track of the max sum
class Solution {
    public int maxSubArray(int[] nums) {

        int csum = nums[0];
        int osum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (csum >= 0) {

                csum += nums[i];
            }

            else {

                csum = nums[i];
            }

            osum = Math.max(osum, csum);

        }

        return osum;

    }

}
