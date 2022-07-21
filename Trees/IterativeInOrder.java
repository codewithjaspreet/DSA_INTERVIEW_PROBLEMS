
// O(N) time and space

class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code

        ArrayList<Integer> ans = new ArrayList<Integer>();

        helper(ans, root);

        return ans;

    }

    public static void helper(ArrayList<Integer> ans, Node root) {

        Node temp = root;

        Stack<Node> st = new Stack<>();

        while (true) {

            if (root != null) {

                st.push(root);
                root = root.left;
            }

            else {

                if (st.size() == 0) {

                    break;
                }

                root = st.pop();

                ans.add(root.data);

                root = root.right;

            }
        }
    }

}
