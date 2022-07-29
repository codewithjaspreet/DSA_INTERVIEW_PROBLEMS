
// boundary - >

// left bountdary + leaf nodes + right boundary in reverse order

// below written are all four functions

// time - O(H)

class Solution {
    ArrayList<Integer> boundary(Node node) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (isLeaf(node) == false)
            ans.add(node.data);

        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);

        return ans;

    }

    public static boolean isLeaf(Node node) {

        if (node.right == null && node.left == null)
            return true;
        return false;
    }

    public static void addLeftBoundary(Node node, ArrayList<Integer> ans) {

        Node cur = node.left;

        if (cur != null) {

            if (isLeaf(cur) == false)
                ans.add(cur.data);

            if (cur.left != null)
                cur = cur.left;

            else
                cur = cur.right;
        }
    }

    public static void addRightBoundary(Node node, ArrayList<Integer> ans) {

        Node cur = node.right;
        ArrayList<Integer> temp = new ArrayList<>();

        if (cur != null) {

            if (isLeaf(cur) == false)
                ans.add(cur.data);

            if (cur.right != null)
                cur = cur.right;

            else
                cur = cur.right;
        }
        int i;

        for (i = temp.size() - 1; i >= 0; i--) {

            ans.add(temp.get(i));
        }
    }

    public static void addLeaves(Node root, ArrayList<Integer> ans) {

        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        if (root.left != null)
            addLeaves(root.left, ans);
        if (root.right != null)
            addLeaves(root.right, ans);
    }

}
