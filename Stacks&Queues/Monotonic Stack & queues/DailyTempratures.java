
// next greater to right using stack
// store the index of the element in the stack

import java.util.Stack;
class DailyTempratures {

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int[] ret = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;

            }

            stack.push(i);
        }

        return ret;

    }
}
