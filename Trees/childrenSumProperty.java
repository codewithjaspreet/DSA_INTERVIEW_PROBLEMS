
// while going down increase node value with max u can to avoid shortage
// while coming back assign right and left value to node

// time - O(n)
// space  - O(Height of tree)
class Solution {
    public static void helper(Node root) {

        if (root == null)
            return;

        int child = 0;

        if (root.left != null)
            child += root.left.data;
        if (root.right != null)
            child += root.right.data;

        if (child >= root.data)
            root.data = child;

        else {

            if (root.left != null)
                root.left.data = root.data;

            else if (root.right != null)
                root.right.data = root.data;
        }

        helper(root.left);
        helper(root.right);

        int tot = 0;

        if (root.left != null)
            tot += root.left.data;
        if (root.right != null)
            tot += root.right.data;

        if (root.left != null || root.right != null)
            root.data = tot;

    }
}