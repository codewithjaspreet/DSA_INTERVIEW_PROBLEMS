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