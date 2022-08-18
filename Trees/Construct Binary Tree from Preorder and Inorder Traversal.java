
// hashmap can also be used to reduce each time searching of element in inorder

// o(n)

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

// utility function to insert node in the list
class TUF {
    static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0,
                inorder.length - 1, inMap);
        return root;
    }

    static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
            Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder,
                inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder,
                inRoot + 1, inEnd, inMap);

        return root;
    }

    public static void main(String args[]) {

        int preorder[] = { 10, 20, 40, 50, 30, 60 };
        int inorder[] = { 40, 20, 50, 10, 60, 30 };
        TreeNode root = buildTree(preorder, inorder);
    }

}

// (on^2)

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = preorder.length;

        return preInTree(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public static TreeNode preInTree(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei) {
        if (psi > pei)
            return null;

        TreeNode node = new TreeNode(preorder[psi]);

        int idx = isi;
        while (inorder[idx] != preorder[psi])
            idx++;

        int tnel = idx - isi; // total no of elements.

        node.left = preInTree(preorder, psi + 1, psi + tnel, inorder, isi, idx - 1);
        node.right = preInTree(preorder, psi + tnel + 1, pei, inorder, idx + 1, iei);

        return node;
    }
}