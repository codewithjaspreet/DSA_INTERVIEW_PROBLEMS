
// top view , pair class concept + level order 
// hashmap  implemented

import java.util.Map;

class Solution {

    static class Pair {

        int hd;
        Node node;

        Pair(int hd, Node node) {

            this.hd = hd;
            this.node = node;

        }

    }

    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        // Code here

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, root));

        while (!q.isEmpty()) {

            Pair r = q.poll();

            if (!map.containsKey(r.hd)) {
                map.put(cur.hd, cur.node.data);
            }

            if (r.node.left != null) {

                q.add(new Pair(r.hd - 1, r.node.left));

            }

            if (r.node.right != null) {

                q.add(new Pair(r.hd + 1, r.node.right));

            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;

    }
}