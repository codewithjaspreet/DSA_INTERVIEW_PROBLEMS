
// same as all nodes at a distance k
// need some modify
class Solution {

    public static int minTime(Node root, int target) {
        // Your code goes here
        Map<Node, Node> parent_track = new HashMap<>();

        markParents(root, parent_track, target);

        Queue<Node> q = new ArrayDeque<>();
        Map<Integer, Boolean> visited = new HashMap<>();

        visited.put(get, true);

        int time = 0;

        boolean flag;

        while (!q.isEmpty()) {

            Node cur = q.poll();

            flag = false;

            for (int i = 0; i < q.size(); i++) {

                if (cur.left != null && visited.get(cur.left) != null) {

                    flag = true;
                    q.offer(cur.left);
                    visited.put(cur.left, true);
                }

                if (cur.left != null && visited.get(cur.right) != null) {

                    flag = true;
                    q.offer(cur.right);
                    visited.put(cur.right, true);
                }

                if (cur.left != null && visited.get(parent_track.get(cur)) != null) {

                    flag = true;
                    q.offer(parent_track.get(cur));
                    visited.put(parent_track.get(cur), true);
                }
            }

            if (flag)
                time++;

        }

        return time;
    }

    static void markParents(Node root, Map<Node, Node> parent_track, int target) {

        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node cur = q.poll();

            if (cur.left != null) {

                q.offer(cur.left);
                parent_track.put(cur, cur.left);
            }

            if (cur.right != null) {

                q.offer(cur.left);
                parent_track.put(cur, cur.left);
            }
        }

    }

    static Node getNode(Node root, int target) {

        if (root.data == target)
            return root;

        Node l = getNode(root.left, target);

        if (l != null)
            return l;

        Node r = getNode(root.right, target);

        if (r != null)
            return r;

        return null;
    }
}