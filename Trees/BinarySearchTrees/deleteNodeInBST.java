
// 3 cases

// when there are both child

// only left child
// only right child
// when both childs are null

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {

            if (root.left != null && root.right != null) {

                int lmax = max(root.left);
                root.val = lmax;
                root.left = deleteNode(root.left, lmax);

            } else if (root.left != null)
                return root.left;
            else if (root.right != null)
                return root.right;

            else
                return null;
        }

        return root;

    }

    static int max(TreeNode node) {

        if (node.right != null) {
            return max(node.right);
        }

        return node.val;
    }

}
