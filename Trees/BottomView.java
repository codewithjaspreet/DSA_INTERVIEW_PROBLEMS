class Solution
{
    
    static class Pair{
        
        Node node;
        
        int hd;
        
        Pair(Node node, int hd){
            
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        q.add(new Pair(root , 0));
        
        while(!q.isEmpty()){
            
            Pair rem = q.poll();
            
            Node cur = rem.node;
            int hd = rem.hd;
            
            
            map.put(hd, cur.data);
            
            if(cur.left != null){
                
                q.add(new Pair(cur.left , hd  - 1));
                
                
            }
            
            if(cur.right != null){
                
                q.add(new Pair(cur.right , hd  + 1));
                
                
            }
            
        }
        
        for(int value : map.values()){
            
            ans.add(value);
        }
        
        return ans;
    }
}
