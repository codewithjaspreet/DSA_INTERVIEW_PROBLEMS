// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(K)

class Compute {

    public long[] printFirstNegativeInteger(long A[], int N, int K) {

        ArrayList<Long> ans = new ArrayList<>();
        Deque<Long> q = new ArrayDeque<>();
        int left = 0;
        int right = 0;
        while (right < N) {
            // calculations
            if (A[right] < 0) {
                q.add(A[right]);
            }
            if (right - left + 1 < K) {
                right++;
            } else if (right - left + 1 == K) {
                // take ans from calculations and remove from queue
                if (q.isEmpty()) {
                    ans.add((long) 0); // no negative number found in window
                } else {
                    ans.add(q.peek());
                    // sliding the window
                    if (A[left] == q.peek()) {
                        q.poll();
                    }
                }
                right++;
                left++;
            }
        }
        long[] a = new long[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            a[k] = ans.get(k);
        }
        return a;
    }
}