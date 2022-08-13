//dfs approach with visited array

public class Solution {

    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0)
            return 0;
        m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (visited[i][j] == false && grid[i][j] == '1') {
                    DFSMarking(grid, i, j, visited);
                    ++count;
                }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1' || visited[i][j] == true)
            return;
        visited[i][j] = true;
        DFSMarking(grid, i + 1, j, visited);
        DFSMarking(grid, i - 1, j, visited);
        DFSMarking(grid, i, j + 1, visited);
        DFSMarking(grid, i, j - 1, visited);
    }
}

// bfs-- all 8 direction neighbour check

// Time Complexity ~ O(N² + NxMx9), N² for the nested loops, and NxMx9 for the
// overall DFS of the matrix, that will happen throughout if all the cells are
// filled with 1.

// Space Complexity: O(N²) for visited array max queue space O(N²), If all are
// marked as 1 then the maximum queue space will be N².
class Solution {

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                // if not visited and is a land
                if (vis[row][col] == 0 && grid[row][col] == '1') {
                    cnt++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return cnt;
    }

    private void bfs(int ro, int co, int[][] vis, char[][] grid) {
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        // until the queue becomes empty
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            // traverse in the neighbours and mark them if its a land
            for (int delrow = -1; delrow <= 1; delrow++) {
                for (int delcol = -1; delcol <= 1; delcol++) {
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    // check if neighbour row and column is valid, and is an unvisited land
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                            && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }
}