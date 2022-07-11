
// subset sum tabulation concept , last row will give ans

public class Solution {
    public static int minSubsetSumDifference(int[] arr, int n) {
        // Write your code here.

        int totalSum = 0;
        for (int i = 0; i < n; i++)
            totalSum += arr[i];
        int k = totalSum;
        boolean[][] dp = new boolean[n][k + 1];

        for (int i = 0; i < n; i++)
            dp[i][0] = true;
        if (arr[0] <= k)
            dp[0][arr[0]] = true;

        for (int ind = 1; ind < n; ind++) {

            for (int target = 1; target <= k; target++) {

                boolean notTake = dp[ind - 1][target];
                boolean take = false;
                if (arr[ind] <= target)
                    take = dp[ind - 1][target - arr[ind]];
                dp[ind][target] = take | notTake;
            }
        }

        // dp[n-1][col -> 0 to .. totalSum] // will give the answer;

        int min = Integer.MAX_VALUE;

        for (int s1 = 0; s1 <= totalSum / 2; s1++) { // totalsum/2 is an optimisation

            if (dp[n - 1][s1] == true) {

                min = Math.min(min, Math.abs((totalSum - s1) - s1));
            }
        }
        return min;
    }

}
