class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {

            Arrays.fill(row, -1);

        }

        return helper(m - 1, n - 1, dp, obstacleGrid);

    }

    public static int helper(int i, int j, int[][] dp, int[][] obstacleGrid) {

        if (i >= 0 && j >= 0 && obstacleGrid[i][j] == 1) // obstacle addition
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = helper(i - 1, j, dp, obstacleGrid);
        int left = helper(i, j - 1, dp, obstacleGrid);

        return dp[i][j] = up + left;
    }
}
