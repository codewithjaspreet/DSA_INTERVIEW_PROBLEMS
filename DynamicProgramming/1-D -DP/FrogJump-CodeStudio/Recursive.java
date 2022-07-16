
// time limt exceeded

class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..

        return helper(n - 1, heights);

    }

    public static int helper(int n, int[] heights) {

        if (n == 0)
            return 0;

        int left = helper(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);

        int right = Integer.MAX_VALUE;

        if (n > 1)
            right = helper(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);

        return Math.min(left, right);

    }

}