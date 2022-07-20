class Tree {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> arr = new ArrayList<>();

        helper(root, arr);

        return arr;
    }

    public static void helper(Node root, ArrayList<Integer> res) {

        if (root != null) {

            helper(root.left, res);
            helper(root.right, res);
            res.add(root.data);
        }
    }
}
