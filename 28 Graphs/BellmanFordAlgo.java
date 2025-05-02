import java.util.*;

public class BellmanFordAlgo {
    // Edge class to represent a directed edge in the graph
    static class Edge {
        int src; // Source vertex
        int dest; // Destination vertex
        int wt; // Weight of the edge

        // Constructor to initialize the edge
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Method to create a graph using an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize each vertex's adjacency list
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 1, 2)); // Edge from vertex 0 to vertex 1 with weight 2
        graph[0].add(new Edge(0, 2, 4)); // Edge from vertex 0 to vertex 2 with weight 4

        graph[1].add(new Edge(1, 2, -4)); // Edge from vertex 1 to vertex 2 with weight -4

        graph[2].add(new Edge(2, 3, 2)); // Edge from vertex 2 to vertex 3 with weight 2

        graph[3].add(new Edge(3, 4, 4)); // Edge from vertex 3 to vertex 4 with weight 4

        graph[4].add(new Edge(4, 1, -1)); // Edge from vertex 4 to vertex 1 with weight -1
    }

    // Bellman-Ford algorithm to find the shortest path from a source vertex
    public static void bellamnFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // Distance array to store shortest distances
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity for all vertices except the source
            }
        }
        int V = graph.length; // Number of vertices

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            // Iterate through all edges
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k); // Get the edge
                    // Relaxation: Update the distance if a shorter path is found
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
        }

        // Print the shortest distances from the source vertex
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    // Method to create a graph using a single list of edges
    public static void createGraph2(ArrayList<Edge> graph) {
        // Add edges to the graph
        graph.add(new Edge(0, 1, 2)); // Edge from vertex 0 to vertex 1 with weight 2
        graph.add(new Edge(0, 2, 4)); // Edge from vertex 0 to vertex 2 with weight 4

        graph.add(new Edge(1, 2, -4)); // Edge from vertex 1 to vertex 2 with weight -4

        graph.add(new Edge(2, 3, 2)); // Edge from vertex 2 to vertex 3 with weight 2

        graph.add(new Edge(3, 4, 4)); // Edge from vertex 3 to vertex 4 with weight 4

        graph.add(new Edge(4, 1, -1)); // Edge from vertex 4 to vertex 1 with weight -1
    }

    // Modified Bellman-Ford algorithm for a single list of edges
    public static void bellamnFordModified(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V]; // Distance array to store shortest distances
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity for all vertices except the source
            }
        }

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            // Iterate through all edges
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j); // Get the edge
                // Relaxation: Update the distance if a shorter path is found
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    dist[e.dest] = dist[e.src] + e.wt;
                }
            }
        }

        // Print the shortest distances from the source vertex
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Using adjacency list representation
        // Uncomment the following lines to use the adjacency list version
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);
        // bellamnFord(graph, 0);

        // Using a single list of edges
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph2(graph);
        bellamnFordModified(graph, 0, V);
    }
}