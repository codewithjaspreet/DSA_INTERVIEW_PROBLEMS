
// time complexity: O(n) space complexity: O(1)
// approach: greedy approach

class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int p = 0;

        for (int i = 1; i < prices.length; i++) {

            int cost = prices[i] - min;

            p = Math.max(cost, p);

            min = Math.min(min, prices[i]);

        }

        return p;

    }
}