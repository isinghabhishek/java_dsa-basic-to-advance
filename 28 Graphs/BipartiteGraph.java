import java.util.*;

public class BipartiteGraph {

    // Edge class to represent an edge in the graph
    static class Edge {
        int src; // Source vertex
        int dest; // Destination vertex

        // Constructor to initialize the edge
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create a graph using an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize adjacency list for each vertex
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1)); // Edge from vertex 0 to vertex 1
        graph[0].add(new Edge(0, 2)); // Edge from vertex 0 to vertex 2

        graph[1].add(new Edge(1, 0)); // Edge from vertex 1 to vertex 0
        graph[1].add(new Edge(1, 3)); // Edge from vertex 1 to vertex 3

        graph[2].add(new Edge(2, 0)); // Edge from vertex 2 to vertex 0
        graph[2].add(new Edge(2, 4)); // Edge from vertex 2 to vertex 4

        graph[3].add(new Edge(3, 1)); // Edge from vertex 3 to vertex 1
        graph[3].add(new Edge(3, 4)); // Edge from vertex 3 to vertex 4

        graph[4].add(new Edge(4, 2)); // Edge from vertex 4 to vertex 2
        graph[4].add(new Edge(4, 3)); // Edge from vertex 4 to vertex 3
    }

    // Method to check if the graph is bipartite using BFS
    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length]; // Array to store colors of vertices
        Arrays.fill(col, -1); // Initialize all vertices as uncolored (-1)

        Queue<Integer> q = new LinkedList<>(); // Queue for BFS traversal

        // Check each connected component of the graph
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) { // If the vertex is not yet visited
                q.add(i); // Add the vertex to the queue
                col[i] = 0; // Assign the first color (0)

                // Perform BFS
                while (!q.isEmpty()) {
                    int curr = q.remove(); // Get the current vertex

                    // Traverse all neighbors of the current vertex
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j); // Get the edge

                        if (col[e.dest] == -1) { // If the neighbor is not yet colored
                            int nextCol = col[curr] == 0 ? 1 : 0; // Assign the opposite color
                            col[e.dest] = nextCol; // Color the neighbor
                            q.add(e.dest); // Add the neighbor to the queue
                        } else if (col[e.dest] == col[curr]) {
                            // If the neighbor has the same color as the current vertex
                            return false; // The graph is not bipartite
                        }
                    }
                }
            }
        }
        return true; // The graph is bipartite
    }

    public static void main(String[] args) {
        /*
         * Graph structure:
         * 0 ------ 2
         * / /
         * / /
         * / 4
         * 1 /
         * \ /
         * \ /
         * \ /
         * 3
         */
        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // Adjacency list representation of the graph

        // Create the graph
        createGraph(graph);

        // Check if the graph is bipartite and print the result
        System.out.println(isBipartite(graph)); // Output: true or false
    }
}