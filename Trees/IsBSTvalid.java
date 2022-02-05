import java.util.*;
// Inorder of BST is sorted
public class IsBSTvalid {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> list = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return isSortedArray();
    }

    private boolean isSortedArray() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

}


// class Solution {
//     private boolean isValid = true;
//     private TreeNode pre = null;
//     public boolean isValidBST(TreeNode root) {
//         helper(root);
//         return isValid;
//     }
    
//     private void helper(TreeNode root)  {
//         if (root == null) 
//             return;
//         helper(root.left);
//         if (pre != null && pre.val >= root.val) {
//             isValid = false;
//             return;
//         }
//         pre = root;
//         helper(root.right);
//     }
// } 