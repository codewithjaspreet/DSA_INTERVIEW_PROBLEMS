// same as minimum allocation of pages

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int a : weights) {
            max = Math.max(a, max);
            sum += a;
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(weights, mid, days)) {

                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }

        }

        return ans;
    }

    public static boolean isPossible(int[] weights, int mid, int days) {

        int sum = 0;
        int count = 1;

        for (int a : weights) {

            sum += a;

            if (sum > mid) {

                count++;
                sum = a;

            }
        }

        return count <= days;
    }

}
