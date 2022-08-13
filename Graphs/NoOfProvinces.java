class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        // calculating no of vertices
        
        int v = isConnected.length;
        
        
        // creating the adjacency list
        // can be done via matrix also
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // adding new arraylist on each index
        
        for(int i=0;i<v;i++) {
            adj.add(new ArrayList<>());
        }
        
        // filling the list
        // undirected
        
        for(int i=0;i<v;i++) {
            for(int j=0;j<isConnected[i].length;j++) {
                if(isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
            // System.out.println(adj.get(i));
        }
        
        // visited boolean array for the dfs travel
        
        boolean[] vis = new boolean[v];
        int c=0;
        for(int i=0;i<v;i++) {
            if(!vis[i]) {
                
                c++;  // catch of this question
                
                dfs(i,vis,adj);
            }
        }
        return c;
    }
    
    //dfs 
    
    void dfs(int currVertex,boolean[] vis,ArrayList<ArrayList<Integer>> adj) {
        vis[currVertex] = true;
        for(Integer nbr:adj.get(currVertex)) {
            if(vis[nbr]) continue;
            dfs(nbr,vis,adj);
        }
    }
}