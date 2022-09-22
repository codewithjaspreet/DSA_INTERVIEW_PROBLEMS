
// this will return the largest subarray of sum k
// will work for only positive numbers
// Time Complexity: O(n)
class Solution {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int arr[], int n, int k) {
        // Complete the function
        int i = 0;
        int j = 0;

        int sum = 0;
        int mxl = Integer.MIN_VALUE;

        while (j < n) {
            sum += arr[j];

            if (sum > k) {
                while (sum > k)
                    sum = sum - arr[i++];
                // this is necessary because we have successfully handled case where we are
                // adding and then checking with k
                // what if we are subtracting and we get the result after it
                // we come out of while loop in two cases ie either sum == k or sum < k
                if (sum == k) {
                    mxl = Math.max(mxl, j - i + 1);

                }

                j++;

            } else if (sum == k) {
                mxl = Math.max(mxl, j - i + 1);
                j++;
            } else {
                j++;
            }
        }
        return mxl;
    }

}