import java.util.*;

class Solution {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // adding new arraylists to 'adj' to add neighbour nodes
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(4);
        adj.get(2).add(1);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(5).add(1);

        ArrayList<Integer> ans = dfsOfGraph(5, adj);
        printAns(ans);
    }

    // Function to return a list containing the DFS traversal of the graph.
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        boolean[] vis = new boolean[V];

        ArrayList<Integer> ans = new ArrayList<>();

        dfs(0, vis, adj, ans);

        return ans;

    }

    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {

        vis[node] = true;

        ans.add(node);

        for (Integer it : adj.get(node)) {

            if (vis[it] == false) {

                dfs(it, vis, adj, ans);
            }
        }

    }

    // Output:

    // 1 2 4 3 5

    // Time complexity: O(N+E), Where N is the time taken for visiting N nodes and E
    // is for travelling through adjacent nodes.

    // Space Complexity:O(N+E)+O(N)+O(N) , Space for adjacency list, Array,Auxiliary
    // space.

}
