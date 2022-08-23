
// simple level order bfs 

// computing and updating level sum at each level
// at last result will be in the sum variable

class Solution {

    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(root);
        int sum = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode rem = q.poll();

                sum += rem.val;

                if (rem.left != null) {

                    q.add(rem.left);
                }

                if (rem.right != null) {

                    q.add(rem.right);
                }

            }

        }

        return sum;

    }

}