// Time Complexity: O(N*N)

// Reason: At max, there will be M*N calls of recursion to solve a new problem,

// Space Complexity: O(N) + O(N*M)

// Reason: We are using a recursion stack space: O(N), where N is the path length and an external DP Array of size ‘N*M’.

class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {

            min = Math.min(min, solve(n - 1, j, matrix, dp));
        }

        return min;
    }

    private int solve(int i, int j, int[][] matrix, int[][] dp) {

        if (i < 0 || j < 0 || j > matrix[0].length - 1)
            return (int) Math.pow(10, 9);
        if (i == 0)
            return matrix[0][j];

        if (dp[i][j] != -1)
            return dp[i][j];
        int up = matrix[i][j] + solve(i - 1, j, matrix, dp);

        int ld = matrix[i][j] + solve(i - 1, j - 1, matrix, dp);

        int rd = matrix[i][j] + solve(i - 1, j + 1, matrix, dp);

        return dp[i][j] = Math.min(up, Math.min(ld, rd));

    }
}
