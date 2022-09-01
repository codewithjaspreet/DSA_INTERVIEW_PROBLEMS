
// o(n) time and o(n) space
// using stack
// next greater to left
// forward traversal

import java.util.Stack;

public class Solution {

   public static int[] nextGreaterToLeft(int[] arr, int n) {

      int[] ngl = new int[n];

      Stack<Integer> st = new Stack<>();

      for (int i = 0; i < ngl.length; i++) {

         if (st.size() == 0) {
            ngl[i] = -1;
         }

         else if (st.size() > 0 && st.peek() > arr[i]) {
            ngl[i] = st.peek();
         }

         else if (st.size() > 0 && st.peek() <= arr[i]) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
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

      return ngl;
   }
}
