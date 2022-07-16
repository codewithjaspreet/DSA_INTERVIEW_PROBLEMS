import java.util.Scanner;

class Solution {
    public static int frogJumpKSteps(int n, int heights[], int k) {

        // Write your code here..

        return help(n - 1, heights, k);

    }

    public static int help(int n, int[] heights, int k) {

        if (n == 0)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= k; i++) {

            if (n - i > 0) {

                int jump = help(n - i, heights, k) + Math.abs(heights[i] - heights[n - i]);
                min = Math.min(jump, min);
            }

        }

        return min;
    }

    public static void main(String args[]) {

        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        System.out.println(frogJumpKSteps(n, height, k));
    }

}