
// o(n) time and o(n) space
// using stack
// next greater to left
// backward traversal
import java.util.Stack;

public class Solution {

    public static int[] nearestSmallerToLeft(int[] arr, int n) {

        int[] nsl = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = ngl.length - 1; i >= 0; i--) {

            if (st.size() == 0) {
                ngl[i] = -1;
            }

            else if (st.size() > 0 && st.peek() < arr[i]) {
                ngl[i] = st.peek();
            }

            else if (st.size() > 0 && st.peek() >= arr[i]) {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }

                if (st.size() == 0) {
                    ngl[i] = -1;
                }

                else {
                    ngl[i] = st.peek();
                }
            }

            st.push(arr[i]);
        }

        reverseArray(ngl);

        return ngl;
    }

    void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
