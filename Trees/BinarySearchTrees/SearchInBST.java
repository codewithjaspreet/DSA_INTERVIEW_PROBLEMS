
// easy left and right

// o(logn) height traversal -  time

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);

        } else if (val > root.val) {
            return searchBST(root.right, val);

        } else {
            return root;
        }
    }
}

// or

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {

            root = root.val < val ? root.right : root.left;
        }

        return root;
    }
}

class BST {

    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here

        if (root == null)
            return false;
        if (root.data == x)
            return true;

        boolean ans;
        if (x < root.data)
            ans = search(root.left, x);
        else
            ans = search(root.right, x);

        return ans;

    }
}
