
class Solution
{
    
    static class Pair{
        
        Node node;
        
        int hd;
        
        Pair(Node node , int hd){
            
            this.node = node;
            this.hd = hd;
        }
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
         ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Pair rem = q.poll();
            Node fn = rem.node;
            int hd = rem.hd;
            
            if (!map.containsKey(hd)) {
                map.put(hd, fn.data);
            }
            
            if (fn.left != null) {
                q.add(new Pair(fn.left, hd - 1));
            }
            if (fn.right != null) {
                q.add(new Pair(fn.right, hd + 1));
            }
        }
        
        // Traverse the map and add values to the answer list
        for (int value : map.values()) {
            ans.add(value);
        }
        
        return ans;
    }
}
