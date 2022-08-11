// time & space = O(N) ( Extra space of data structure)

// brute force - generate root to node path for both the nodes given
// & then traverse  both the arraylist simultaneously, the point where the values are different 
// return the the last similar node which is the LCA
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        nodeToRootPath(path1, root, p);
        nodeToRootPath(path2, root, q);

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {

            // System.out.println(path1.get(i) + " " + path2.get(i));
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i - 1);

    }

    public static boolean nodeToRootPath(ArrayList<TreeNode> path, TreeNode node, TreeNode x) {

        if (node == null)
            return false;

        path.add(node);

        if (node.val == x.val)
            return true;

        if (nodeToRootPath(path, node.left, x) || nodeToRootPath(path, node.right, x))
            return true;

        path.remove(path.size() - 1);

        return false;

    }

}

// optimised
// simple java DFS recursion: time: O(N), space: O(N) if we count stack space
// occupied by recursion

// when both left , right null return null
// one of them is null return non-null guy

// if both of them are not null then their parent is the LCA

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left == null ? right : left;
    }
}
