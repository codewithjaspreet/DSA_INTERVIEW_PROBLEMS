
class Tupple {
    TreeNode node;
    int vertical;
    int level;

    public Tupple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tupple> q = new LinkedList<Tupple>();
        q.offer(new Tupple(root, 0, 0));
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        while (!q.isEmpty()) {
            Tupple t = q.poll();
            TreeNode node = t.node;
            int vertical = t.vertical;
            int level = t.level;

            if (!map.containsKey(vertical)) {
                map.put(vertical, new TreeMap<>());
            }
            if (!map.get(vertical).containsKey(level)) {
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.val);

            if (node.left != null)
                q.offer(new Tupple(node.left, vertical - 1, level + 1));
            if (node.right != null)
                q.offer(new Tupple(node.right, vertical + 1, level + 1));

        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ls : map.values()) {
            List<Integer> sublist = new ArrayList();
            for (PriorityQueue<Integer> nodes : ls.values()) {
                while (!nodes.isEmpty()) {
                    sublist.add(nodes.poll());
                }
            }
            result.add(sublist);

        }
        return result;

    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {

// static class Pair {

// int hd;
// TreeNode node;

// Pair(int hd , TreeNode node){

// this.hd = hd;
// this.node = node;
// }

// }

// public List<List<Integer>> verticalTraversal(TreeNode root) {

// Queue<Pair> q = new ArrayDeque<>();

// List<List<Integer>> ans = new ArrayList<>();

// Map<Integer , ArrayList<Integer>> map = new TreeMap();

// q.add(new Pair(0 , root));

// while(!q.isEmpty()){

// Pair rem = q.poll();

// if(map.containsKey(rem.hd)){

// map.get(rem.hd).add(rem.node.val);
// }

// else{

// ArrayList<Integer> arr = new ArrayList<>();
// arr.add(rem.node.val);
// map.put(rem.hd , arr);

// }

// if(rem.node.left != null){

// q.add(new Pair(rem.hd - 1 , rem.node.left ));

// }

// if(rem.node.right != null){

// q.add(new Pair(rem.hd + 1 , rem.node.right ));

// }

// }

// ArrayList<Integer> temp = new ArrayList<>();

// for(Map.Entry<Integer , ArrayList<Integer>> entry : Map.entrySet()){

// temp.addAll(entry.getValue());
// }

// ans.add(temp);

// return ans;

// }
// }
