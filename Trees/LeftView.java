
// level order implemented 

class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // Your code here
        // return if the tree is empty

        if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // create an empty queue and enqueue the root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // calculate the total number of nodes at the current level
            int n = queue.size();

            // process every node of the current level and enqueue their
            // non-empty left and right child

            for (int i = 0; i < n; i++) {

                Node temp = queue.remove();

                if (i == 0) {
                    ans.add(temp.data);
                }

                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);

            }

        }

        return ans;

    }
}