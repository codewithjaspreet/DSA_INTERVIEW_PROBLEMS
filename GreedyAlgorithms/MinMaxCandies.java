class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        // code here

        ArrayList<Integer> ans = new ArrayList<Integer>();

        Arrays.sort(candies);

        int buy = 0;
        int free = N - 1;
        int min = 0;

        while (buy <= free) {

            min = min + candies[buy];
            buy++;
            free = free - K;
        }

        int max = 0;
        buy = N - 1;
        free = 0;

        while (free <= buy) {

            max = max + candies[buy];
            buy--;
            free = free + K;
        }

        ans.add(min);
        ans.add(max);

        return ans;
    }
}