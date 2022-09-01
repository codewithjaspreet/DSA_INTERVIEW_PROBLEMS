
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

// using stack o(n)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
}
