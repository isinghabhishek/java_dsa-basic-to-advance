import java.util.*;

public class DepthFirstSearch {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]) { // O(n)
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 5));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(5, 2, 1));
        graph[4].add(new Edge(5, 3, 1));
        graph[4].add(new Edge(5, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[3].add(new Edge(3, 6, 5));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            dfsUtil(graph, i, visited);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
        //O(V+E)
        //visit
        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }
    
    // O(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if(src == dest) {
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
               1 ---- 3
               /      | \
              0       |   5 -- 6
              \       |  /
               2 ---- 4
         */

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        //dfs(graph, 0, new boolean[V]);

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
