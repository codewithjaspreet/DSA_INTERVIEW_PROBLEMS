
// time  - O(N*TARGET) 

// space  = O(N) dp  +O(N) STACK SPACE

import java.util.Arrays;

public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]) {
        // Write your code here.

        return helper(n - 1, k, arr);
    }

    public static boolean helper(int ind, int target, int[] arr) {
        if (target == 0)
            return true;

        if (ind == 0)
            return arr[0] == target;

        boolean notTaken = helper(ind - 1, target, arr);

        boolean taken = false;
        if (arr[ind] <= target)

            taken = helper(ind - 1, target - arr[ind], arr);

        return notTaken || taken;
    }
}
