// removed stack space

class Solution {
    public int coinChange(int[] arr, int T) {

        int n = arr.length;

        int dp[][] = new int[n][T + 1];

        for (int i = 0; i <= T; i++) {
            if (i % arr[0] == 0)
                dp[0][i] = i / arr[0];
            else
                dp[0][i] = (int) Math.pow(10, 9);
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= T; target++) {

                int notTake = 0 + dp[ind - 1][target];
                int take = (int) Math.pow(10, 9);
                if (arr[ind] <= target)
                    take = 1 + dp[ind][target - arr[ind]];

                dp[ind][target] = Math.min(notTake, take);
            }
        }

        int ans = dp[n - 1][T];
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }

}