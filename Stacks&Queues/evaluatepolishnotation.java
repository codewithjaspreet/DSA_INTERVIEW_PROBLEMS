import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    private static final Set<String> operations = new HashSet<>(Set.of("+", "-", "*", "/"));

    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {

        for (String t : tokens) {
            if (!operations.contains(t)) {
                stack.push(Integer.parseInt(t));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (t.equals("+")) {
                    stack.push(a + b);
                } else if (t.equals("-")) {
                    stack.push(a - b);
                } else if (t.equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }
}



