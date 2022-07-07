import java.util.Scanner;

class Solution {
    public static int frogJumpKSteps(int n, int heights[], int k) {

        // Write your code here..

        return help(n - 1, heights, k);

    }

    public static int help(int n, int[] heights, int k) {

        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    mmSteps = Math.min(jump, mmSteps);
                }
            }
            dp[i] = mmSteps;
        }
        return dp[n - 1];
    }

    public static void main(String args[]) {

        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        System.out.println(frogJumpKSteps(n, height, k));
    }

}