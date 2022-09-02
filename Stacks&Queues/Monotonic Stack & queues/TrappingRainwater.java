
// time & space complexity: O(n^2) - brute force

class Solution {

    public int trap(int[] height) {

        int n = height.length;

        if (n <= 2)
            return 0;

        int sum = 0;

        for (int i = 0; i < n; i++) {

            int j = i;
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;

            while (j >= 0) {
                left = Math.max(left, height[j]);
                j--;
            }

            j = i;

            while (j < n) {
                right = Math.max(right, height[j]);
                j++;

            }

            sum += Math.min(left, right) - height[i];

        }

        return sum;

    }
}

// better - o(n) time and space
// approach 2: prefix sum method

class Solution {
    public int trap(int[] height) {

        int n = height.length;

        if (n <= 2)
            return 0;

        int sum = 0;

        // prefix sum array stores the maximum height of the bar from left to right

        int[] pre = new int[n];

        pre[0] = height[0];

        for (int i = 1; i < pre.length; i++) {

            pre[i] = Math.max(pre[i - 1], height[i]);
        }

        // suffix sum array stores the maximum height of the bar from right to left

        int[] suff = new int[n];

        suff[n - 1] = height[n - 1];

        for (int i = suff.length - 2; i >= 0; i--) {

            suff[i] = Math.max(suff[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {

            sum += Math.min(pre[i], suff[i]) - height[i];
        }

        return sum;

    }

}
