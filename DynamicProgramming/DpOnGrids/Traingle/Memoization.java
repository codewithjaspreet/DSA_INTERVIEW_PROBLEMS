class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return help(0, 0, triangle, dp);

    }

    public int help(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);

        if (dp[i][j] != -1)
            return dp[i][j];

        int down = triangle.get(i).get(j) + help(i + 1, j, triangle, dp);
        int dia = triangle.get(i).get(j) + help(i + 1, j + 1, triangle, dp);

        return dp[i][j] = Math.min(down, dia);

    }
}