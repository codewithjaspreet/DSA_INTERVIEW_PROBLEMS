class Solution {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here

        int i = 0;
        int j = 0;
        long max = Integer.MIN_VALUE;
        long sum = 0;

        while (j < N) {
            sum += Arr.get(j);

            if (j - i + 1 < K) {
                j++;
            }

            else if (j - i + 1 == K) {
                max = Math.max(max, sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }

        }

        return max;
    }

}