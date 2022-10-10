// Naive Solution
// two pointer approach
// o(n+m) approach
class Solution {
    public long kthElement(int A[], int B[], int m, int n, int k) {

        int t = 0, i = 0, j = 0;

        // Keep taking smaller of the current
        // elements of two sorted arrays and
        // keep incrementing k
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                t++;
                if (t == k)
                    return A[i];
                i++;
            } else {
                t++;
                if (t == k)
                    return B[j];
                j++;
            }
        }

        // If array B[] is completely traversed
        while (i < m) {
            t++;
            if (t == k)
                return A[i];
            i++;
        }

        // If array A[] is completely traversed
        while (j < n) {
            t++;
            if (t == k)
                return B[j];
            j++;
        }
        return -1;
    }
}