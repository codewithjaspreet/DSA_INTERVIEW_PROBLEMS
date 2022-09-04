
// time x space complexity - O(n^3) 
class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int res = 0;

        int mod = (int) 1e9 + 7;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; i++) {

                int min = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {

                    min = Math.min(min, arr[i]);

                }

                res = (res + min) % mod;

            }
        }

        return res;
    }

    class Solution {
        public int sumSubarrayMins(int[] arr) {
            int res = 0;
            int n = arr.length;
            int mod = (int) 1e9 + 7;
            for (int end = 0; end < n; end++) {
                int min = arr[end];
                for (int start = end; start >= 0; start--) {
                    min = Math.min(min, arr[start]);
                    res = (res + min) % mod;
                }
            }
            return res;

        }
    }

}
