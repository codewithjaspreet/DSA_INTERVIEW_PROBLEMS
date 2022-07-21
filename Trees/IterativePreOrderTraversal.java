
// use stack DS  ,and make sure put right child first then left
// to get the output and left pop first

class Tree {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        // Code

        ArrayList<Integer> ans = new ArrayList<Integer>();

        helper(root, ans);

        return ans;

    }

    public static void helper(Node root, ArrayList<Integer> ans) {

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {

            Node rem = st.pop();
            ans.add(rem.data);

            if (rem.right != null) {
                st.push(rem.right);
            }

            if (rem.left != null) {
                st.push(rem.left);
            }
        }

    }

}