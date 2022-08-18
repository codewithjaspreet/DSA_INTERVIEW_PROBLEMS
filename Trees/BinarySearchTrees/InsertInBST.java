
// if present already not modified - gfg based

// Expected Time Complexity: O(Height of the BST).

// Expected Auxiliary Space: O(Height of the BST).
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here

        if (root == null)
            return new Node(key);

        if (search(root, key) == true)
            return root;

        Node cur = root;

        while (true) {

            if (cur.data <= key) {

                if (cur.right != null)
                    cur = cur.right;
                else {
                    cur.right = new Node(key);
                    break;
                }
            }

            else {

                if (cur.left != null)
                    cur = cur.left;

                else {
                    cur.left = new Node(key);
                    break;
                }
            }
        }

        return root;

    }

    boolean search(Node root, int x) {
        // Your code here

        if (root == null)
            return false;
        if (root.data == x)
            return true;

        boolean ans;
        if (x < root.data)
            ans = search(root.left, x);
        else
            ans = search(root.right, x);

        return ans;

    }
}