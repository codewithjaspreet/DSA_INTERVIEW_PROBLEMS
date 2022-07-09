
// TC  -O(N *M)  drop from exponential one

// SC - O(pathlength) = O(n-1 + m -1) + O(N*M) (dp length)

class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int[] row : dp) {

            Arrays.fill(row, -1);

        }

        return helper(m - 1, n - 1, dp);
    }

    public static int helper(int i, int j, int[][] dp) {

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = helper(i - 1, j, dp);

        int left = helper(i, j - 1, dp);

        return dp[i][j] = up + left;
    }
}