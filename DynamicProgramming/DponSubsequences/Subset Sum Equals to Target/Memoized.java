
// time  - O(N*TARGET) 

// space  = O(N) dp  +O(N) STACK SPACE

import java.util.Arrays;

public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]) {
        // Write your code here.
        int dp[][] = new int[n][k + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(n - 1, k, arr, dp);
    }

    public static boolean helper(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0)
            return true;

        if (ind == 0)
            return arr[0] == target;

        if (dp[ind][target] != -1)

            return dp[ind][target] == 0 ? false : true;

        boolean notTaken = helper(ind - 1, target, arr, dp);

        boolean taken = false;
        if (arr[ind] <= target)

            taken = helper(ind - 1, target - arr[ind], arr, dp);
        dp[ind][target] = notTaken || taken ? 1 : 0;

        return notTaken || taken;
    }
}
