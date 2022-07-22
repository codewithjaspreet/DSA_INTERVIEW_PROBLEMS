
// used two stacks here
// push root of node in stack 1 
// then pop it push to stack 2 and left and right child to stack1 if not null

class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here

        ArrayList<Integer> ans = new ArrayList<Integer>();

        helper(node, ans);

        return ans;
    }

    public static void helper(Node root, ArrayList<Integer> ans) {

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {

            Node rem = st1.pop();

            st2.push(rem);

            if (rem.left != null) {
                st1.push(rem.left);
            }

            if (rem.right != null) {
                st1.push(rem.right);
            }
        }

        while (!st2.isEmpty()) {

            Node r = st2.pop();
            ans.add(r.data);
        }
    }
}