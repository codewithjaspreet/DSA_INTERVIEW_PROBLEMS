
// flag variable - >  alter on each level

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