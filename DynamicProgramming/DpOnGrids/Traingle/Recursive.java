class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        return help(0, 0, triangle);

    }

    public int help(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);

        int down = triangle.get(i).get(j) + help(i + 1, j, triangle, dp);
        int dia = triangle.get(i).get(j) + help(i + 1, j + 1, triangle, dp);

        return Math.min(down, dia);

    }
}