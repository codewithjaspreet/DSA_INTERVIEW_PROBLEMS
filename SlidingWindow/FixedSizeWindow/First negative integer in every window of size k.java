import java.util.*;
public class Solution {
	public static int[] firstNegative(int[] arr, int n, int k) {
        // Write your code here.

		int[] ans = new int[n-k +1];
		int ind = 0;
		int i  = 0 ; int j = 0;

		    Queue<Integer> q = new LinkedList<>();

    while (j < n) {
        // If current element is negative, add it to the queue
        if (arr[j] < 0) {
            q.offer(arr[j]);
        }

        // If the window size is not reached yet, increment j
        if (j - i + 1 < k) {
            j++;
        } 
        else { // Window size is reached

            // If the queue is empty, there are no negative numbers in the window
            if (q.isEmpty()) {
                ans[ind] = 0;
            } 
            else { // Queue is not empty, so the first negative number in the window is the head of the queue
                ans[ind] = q.peek();
                // Remove the head of the queue if it is outside the current window
                if (arr[i] == q.peek()) {
                    q.poll();
                }
            }

            ind++;
            i++;
            j++;
        }
    }

    return ans;
}

}
