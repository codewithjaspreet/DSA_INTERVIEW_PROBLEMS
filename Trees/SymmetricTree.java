// bfs travesal

// logic for the traversal  - > 

// root.left | root.right
// root left right | root right left

class Solution {
    public boolean isSymmetric(TreeNode root) {

        return root == null || util(root.left, root.right);

    }

    private boolean util(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null)
            return root1 == root2;
        if (root1.val != root2.val)
            return false;

        return util(root1.left, root2.right) && util(root1.right, root2.left);
    }

}
