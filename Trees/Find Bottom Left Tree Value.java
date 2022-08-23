
// simple bfs , o(H) time & stack space of (o(H))
// i ==0  storing first element of each level
// for the final level we will have the answer

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int res = 0;
        while (q.size() > 0) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode node = q.remove();
                if (i == 0) {
                    res = node.val;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        return res;

    }
}
