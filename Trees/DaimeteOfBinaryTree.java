
// naive - n*n

class Solution {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int ans = maxDepth(root.left) + maxDepth(root.right);
        ans = Math.max(diameterOfBinaryTree(root.left), ans);
        ans = Math.max(diameterOfBinaryTree(root.right), ans);

        return ans;
    }

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

}

// O(n ) TIME AND SPACE
class Solution {

    static int maxi = Integer.MIN_VALUE;

    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here

        int[] d = new int[1];

        height(root, d);

        return d[0];

    }

    public static int height(Node root, int[] d) {

        if (root == null)
            return 0;

        int left = height(root.left, d);
        int right = height(root.right, d);

        d[0] = Math.max(d[0], 1 + left + right);

        return 1 + Math.max(left, right);
    }

}