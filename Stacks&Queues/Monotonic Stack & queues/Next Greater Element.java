
// brute force o(n^2)

class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here

        long[] nge = new long[n];

        Arrays.fill(nge, -1);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {

                    nge[i] = arr[j];
                    break;
                }
            }
        }

        return nge;
    }
}