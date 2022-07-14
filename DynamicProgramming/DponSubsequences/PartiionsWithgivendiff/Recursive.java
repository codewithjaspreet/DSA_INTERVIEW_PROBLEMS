import java.util.Arrays;

public class Solution {
    public static int countPartitions(int n, int d, int[] arr) {
        // Write your code here.

        int totSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totSum += arr[i];
        }

        // Checking for edge cases
        if (totSum - d < 0)
            return 0;
        if ((totSum - d) % 2 == 1)
            return 0;

        int s2 = (totSum - d) / 2;

        return countPartitionsUtil(n - 1, s2, arr);
    }

    static int mod = (int) (Math.pow(10, 9) + 7);

    static int countPartitionsUtil(int ind, int target, int[] arr) {

        if (ind == 0) {
            if (target == 0 && arr[0] == 0)
                return 2;
            if (target == 0 || target == arr[0])
                return 1;
            return 0;
        }

        int notTaken = countPartitionsUtil(ind - 1, target, arr);

        int taken = 0;
        if (arr[ind] <= target)
            taken = countPartitionsUtil(ind - 1, target - arr[ind], arr);

        return (notTaken + taken) % mod;
    }
}