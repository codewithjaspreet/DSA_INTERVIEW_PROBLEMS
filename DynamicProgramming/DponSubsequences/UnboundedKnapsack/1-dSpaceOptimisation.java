class Solution {
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.

        
        int[] prev = new int[w+1];
        
        for (int i = weight[0]; i <= w; i++) {
            prev[i] = ((int) i / weight[0]) * profit[0];
        }

        for (int ind = 1; ind < n; ind++) {
            for (int cap = 0; cap <= w; cap++) {

                int notTaken = 0 + prev[cap];

                int taken = Integer.MIN_VALUE;
                if (weight[ind] <= cap){
                    taken = profit[ind] + prev[cap - weight[ind]];
                }
                prev[cap] = Math.max(notTaken, taken);
                
            }
        }

        return prev[w];

    }
}