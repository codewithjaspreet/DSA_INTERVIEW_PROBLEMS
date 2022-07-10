// tle with exponential

class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {

            min = Math.min(min, solve(n - 1, j, matrix));
        }

        return min;
    }

    private int solve(int i, int j, int[][] matrix) {

        if (i < 0 || j < 0 || j > matrix[0].length - 1)
            return (int) Math.pow(10, 9);
        if (i == 0)
            return matrix[0][j];

        int up = matrix[i][j] + solve(i - 1, j, matrix);

        int ld = matrix[i][j] + solve(i - 1, j - 1, matrix);

        int rd = matrix[i][j] + solve(i - 1, j + 1, matrix);

        return Math.min(up, Math.min(ld, rd));

    }
}
