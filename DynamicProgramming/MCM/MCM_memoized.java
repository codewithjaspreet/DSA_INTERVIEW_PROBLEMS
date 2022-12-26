import java.util.Arrays;

class Solution {
    static int matrixMultiplication(int N, int arr[]) {

        int[][] dp = new int[arr.length + 1][arr.length + 1];

        for (int[] row : dp) {

            Arrays.fill(row, -1);
        }
        // code here

        return helper(arr, 1, N - 1, dp);

    }

    static int helper(int[] arr, int i, int j, int[][] dp) {

        if (i >= j)
            return 0;

        int min = Integer.MAX_VALUE;

        if (dp[i][j] != -1)
            return dp[i][j];

        for (int k = i; k < j; k++) {

            int c = helper(arr, i, k, dp) + helper(arr, k + 1, j, dp) +

                    arr[i - 1] * arr[k] * arr[j];

            if (c < min)
                min = c;
        }

        return dp[i][j] = min;
    }
}