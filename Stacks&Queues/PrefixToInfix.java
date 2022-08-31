class Solution {

    static int prec(char c) {

        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;

    }

    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }

            // if the scanned character is an '(', push it to the stack.

            else if (c == '(') {
                stack.push(c);
            }

            // if the scanned character is an ')', pop and output from the stack until '('
            // is found
            else if (c == ')') {
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            // check for higher precedence operators

            else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}