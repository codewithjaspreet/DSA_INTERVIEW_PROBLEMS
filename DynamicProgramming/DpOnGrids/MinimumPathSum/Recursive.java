
// TLE BEACAUSE FO EXPONENTIAL TC
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        return find(grid, m, n);
    }

    public int find(int grid[][], int m, int n) {
        if (m < 0 || n < 0)
            return Integer.MAX_VALUE;
        if (m == 0 && n == 0)
            return grid[0][0];

        return grid[m][n] + Math.min(find(grid, m - 1, n), find(grid, m, n - 1));
    }
}