
// o(N) , O(N)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);
        while (mq.size() > 0) {
            int count = mq.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < count; i++) {

                if (mq.peek().left != null) {
                    mq.add(mq.peek().left);
                }

                if (mq.peek().right != null) {
                    mq.add(mq.peek().right);
                }

                arr.add(mq.poll().val);

            }
            res.add(arr);

        }
        return res;
    }
}
