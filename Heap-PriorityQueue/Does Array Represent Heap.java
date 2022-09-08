
// approach
// element at index i has left child at 2*i + 1
// element at index i has right child at 2*i + 2
// element at index i has parent at (i-1)/2
// if left child is greater than parent then it is not a min heap
// if right child is greater than parent then it is not a min heap
// vice versa for max heap
class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here

        for (long i = 0; i <= n / 2; i++) {
            long index = i * 2 + 1;
            if (index < n) {
                if (arr[(int) i] < arr[(int) index]) {
                    return false;
                }
            }
            if (index + 1 < n) {
                if (arr[(int) i] < arr[(int) index + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}