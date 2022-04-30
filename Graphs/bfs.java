import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// bfs technique for visiting the nodes

public class bfs {
        public static ArrayList < Integer > bfsOfGraph(int V, ArrayList < ArrayList < Integer >> adj) {

            ArrayList < Integer > bfs = new ArrayList< >();
            boolean[] vis = new boolean[V];
            Queue< Integer > q = new ArrayDeque<>();

            q.add(0);
            vis[0] = true;

            while (!q.isEmpty()) {
                Integer node = q.poll();
                bfs.add(node);

                // Get all adjacent vertices of the dequeued vertex s
                // If an adjacent has not been visited, then mark it
                // visited and enqueue it
                for (Integer it: adj.get(node)) {
                    if (!vis[it]) {
                        vis[it] = true;
                        q.add(it);
                    }
                }
            }

            return bfs;

        }

        static void printAns(ArrayList < Integer > ans) {
            for (Integer an : ans) {
                System.out.print(an + " ");
            }
        }
        public static void main(String[] args) {

            ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
            for (int i = 0; i < 5; i++) {
                adj.add(new ArrayList < > ());
            }
            adj.get(0).add(1);
            adj.get(1).add(0);
            adj.get(0).add(2);
            adj.get(2).add(0);
            adj.get(0).add(3);
            adj.get(3).add(0);
            adj.get(2).add(4);
            adj.get(4).add(2);


            ArrayList < Integer > ans = bfsOfGraph(5, adj);
            printAns(ans);



        }
    }
