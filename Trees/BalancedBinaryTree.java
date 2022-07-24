// naive - o(N*2)

class Tree {

    // Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Your code here

        if (root == null)
            return true;

        int hleft = height(root.left);
        int hright = height(root.right);

        if (Math.abs(hright - hleft) > 1)
            return false;

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if (left || right)
            return false;

        return true;

    }

    public static int height(Node node) {

        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left, right);
    }
}

// O(N) - height of tree + 2 checks

class Tree {

    // Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Your code here
        return height(root) == -1 ? false : true;

    }

    public static int height(Node node) {

        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }
}
