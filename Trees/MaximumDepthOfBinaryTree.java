
// approach 1 : Recursive 
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(height of the tree)

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here

        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left, right);
    }
}

// approach 2 : level Order Traversal
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(height of the tree) + Space of Queue as O(N)

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here

        // code here
        int ans = 0;
        Queue<Node> q = new LinkedList<>();

        if (node == null)
            return ans;
        q.offer(node);

        while (!q.isEmpty()) {

            int level = q.size();
            ans++;

            for (int i = 0; i < level; i++) {

                Node rem = q.poll();

                if (rem.left != null)
                    q.offer(rem.left);

                if (rem.right != null)
                    q.offer(rem.right);
            }

        }

        return ans;
    }
}
