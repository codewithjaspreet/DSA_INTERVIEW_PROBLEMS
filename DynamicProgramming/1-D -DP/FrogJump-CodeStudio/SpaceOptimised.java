
// O(N) time , O(1) space 

public class Solution {
    public static int frogJump(int n, int heights[]) {

        int prev = 0;
        int prev2 = 0;
        for (int ind = 1; ind < n; ind++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = prev + Math.abs(heights[ind] - heights[ind - 1]);
            if (ind > 1)
                jumpTwo = prev2 + Math.abs(heights[ind] - heights[ind - 2]);

            int curI = Math.min(jumpOne, jumpTwo);

            prev2 = prev;
            prev = curI;
        }

        return prev;

    }
}