// Time Complexity: O(N*K)

// Reason: There are two nested loops

// Space Complexity: O(N*K)

// Reason: We are using an external array of size ‘N*K’. Stack Space is eliminated.

public class Solution {
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int n = num.length;

        int[][] dp = new int[n][tar + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        if (num[0] <= tar)
            dp[0][num[0]] = 1;

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= tar; target++) {

                int notTaken = dp[ind - 1][target];

                int taken = 0;
                if (num[ind] <= target)
                    taken = dp[ind - 1][target - num[ind]];

                dp[ind][target] = notTaken + taken;
            }
        }

        return dp[n - 1][tar];

    }

}