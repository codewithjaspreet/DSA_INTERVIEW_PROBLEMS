import java.io.*;

import java.util.*;

public class Main {
  static class Edge {
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }
  public static void main(String[] args) throws Exception {
    int vertices = 7; //0 1 2 3 4 5 6
    ArrayList[] graph = new ArrayList[7];

    //This is as per the diagram (fig-13)

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 20));

    graph[0].add(new Edge(1, 0, 10));
    graph[0].add(new Edge(1, 2, 30));
    graph[0].add(new Edge(1, 3, 50));
    graph[0].add(new Edge(1, 4, 40));

    graph[0].add(new Edge(2, 0, 20));
    graph[0].add(new Edge(2, 1, 30));
    graph[0].add(new Edge(2, 5, 80));

    graph[0].add(new Edge(3, 1, 50));
    graph[0].add(new Edge(3, 5, 70));

    graph[0].add(new Edge(4, 1, 40));
    graph[0].add(new Edge(4, 2, 80));
    graph[0].add(new Edge(4, 5, 60));

    graph[0].add(new Edge(5, 3, 70));
    graph[0].add(new Edge(5, 4, 60));

  }
}