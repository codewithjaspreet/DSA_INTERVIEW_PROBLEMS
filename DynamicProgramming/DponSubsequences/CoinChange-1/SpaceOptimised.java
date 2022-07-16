
// two row optimisation
// O(N*target) 
// space - O(target)
class Solution {
    public int coinChange(int[] arr, int T) {

        int n = arr.length;

        int prev[] = new int[T + 1];
        int cur[] = new int[T + 1];

        for (int i = 0; i <= T; i++) {
            if (i % arr[0] == 0)
                prev[i] = i / arr[0];
            else
                prev[i] = (int) Math.pow(10, 9);
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= T; target++) {

                int notTake = 0 + prev[target];
                int take = (int) Math.pow(10, 9);
                if (arr[ind] <= target)
                    take = 1 + cur[target - arr[ind]];

                cur[target] = Math.min(notTake, take);

            }
            prev = cur;
        }

        int ans = prev[T];
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }

}