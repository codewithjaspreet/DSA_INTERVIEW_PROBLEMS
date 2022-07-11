
// Time Complexity: O(N*K)

// Reason: There are three nested loops

// Space Complexity: O(K)

// Reason: We are using an external array of size ‘K+1’ to store only one row.

public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]) {
        // Write your code here.

        boolean prev[] = new boolean[k + 1];

        prev[0] = true;

        if (arr[0] <= k)
            prev[arr[0]] = true;

        for (int ind = 1; ind < n; ind++) {
            boolean cur[] = new boolean[k + 1];
            cur[0] = true;
            for (int target = 1; target <= k; target++) {
                boolean notTaken = prev[target];

                boolean taken = false;
                if (arr[ind] <= target)
                    taken = prev[target - arr[ind]];

                cur[target] = notTaken || taken;
            }
            prev = cur;

        }

        return prev[k];
    }
}
