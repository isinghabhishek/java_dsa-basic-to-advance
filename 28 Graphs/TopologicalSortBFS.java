import java.util.*;
// Topolocial Sort Using BFS
public class TopologicalSortBFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void calcInDegre(ArrayList<Edge> graph[], int inDegre[]) {
        for(int i=0; i<graph.length; i++) {
            int v = i; //vertex
            for(int j=0; j<graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                inDegre[e.dest]++;
            }
        }
    }
    public static void topologicalSort(ArrayList<Edge> graph[]) {
        int inDegre[] = new int[graph.length];
        calcInDegre(graph, inDegre);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<inDegre.length; i++) {
            if(inDegre[i] == 0) {
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" "); // topological sort print

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegre[e.dest]--;
                if(inDegre[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}
