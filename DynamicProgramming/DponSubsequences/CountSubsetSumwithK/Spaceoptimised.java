public class Solution {
    public static int findWays(int num[], int tar) {
        // Write your code here..
        int n = num.length;

        int prev[] = new int[tar + 1];

        prev[0] = 1;

        if (num[0] <= tar)
            prev[num[0]] = 1;

        for (int ind = 1; ind < n; ind++) {
            int cur[] = new int[tar + 1];
            cur[0] = 1;
            for (int target = 1; target <= tar; target++) {

                int notTaken = prev[target];

                int taken = 0;
                if (num[ind] <= target)
                    taken = prev[target - num[ind]];

                cur[target] = notTaken + taken;
            }

            prev = cur;
        }

        return prev[tar];

    }

}