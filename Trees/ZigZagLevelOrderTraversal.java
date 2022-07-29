
// flag variable - >  alter on each level

// gfg : 

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean lefttoRight = true;
        while (!q.isEmpty()) {

            int level = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < level; i++) {

                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                temp.add(curr.data);

            }

            if (lefttoRight != true) {
                Collections.reverse(temp);

            }

            for (int i = 0; i < temp.size(); i++) {

                ans.add(temp.get(i));
            }

            lefttoRight = !lefttoRight;

        }

        return ans;
    }
}

// leetcode :

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> op = new LinkedList<>();
        if (root == null) {
            return op;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean odd = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> res = new LinkedList<>();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (odd) {
                    res.add(node.val);
                } else {
                    res.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
            op.add(res);
            odd = !odd;
        }
        return op;
    }
}