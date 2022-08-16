// brute force
// o(n) Approach
class Solution {

    private int ans = 0;

    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        ans += 1;
        int countLNodes = countNodes(root.left);
        int countRNodes = countNodes(root.right);

        return ans;

    }
}

// optimised

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

// idea is to use property of complete binary tree

// everytime your visit a node compute the left and right height

// if they are equal , return ans using formula = (2 << lh) - 1;

// if not - 1 + recur(root.left) + recur(root.right);

// time - > o(logn^2)
// space - > o(logn)

class Solution {
    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if (lh == rh)
            return (2 << lh) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);

    }

    static int getLeftHeight(TreeNode root) {

        int lh = 0;

        while (root.left != null) {

            lh++;
            root = root.left;
        }

        return lh;
    }

    static int getRightHeight(TreeNode root) {

        int rh = 0;

        while (root.right != null) {

            rh++;
            root = root.right;
        }

        return rh;
    }
}