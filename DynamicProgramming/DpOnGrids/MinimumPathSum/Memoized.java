
// time complexity - >  O(N*M);
// space  = > O(Path length)

class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length - 1;
        int n = grid[0].length - 1;

        int[][] dp = new int[m + 1][n + 1];

        for (int[] row : dp) {

            Arrays.fill(row, -1);

        }

        return find(grid, m, n, dp);
    }

    public int find(int grid[][], int m, int n, int[][] dp) {
        if (m < 0 || n < 0)
            return Integer.MAX_VALUE;
        if (m == 0 && n == 0)
            return grid[0][0];

        if (dp[m][n] != -1)
            return dp[m][n];

        return dp[m][n] = grid[m][n] + Math.min(find(grid, m - 1, n, dp), find(grid, m, n - 1, dp));
    }
}