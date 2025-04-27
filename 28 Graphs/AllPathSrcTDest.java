import java.util.*;

public class AllPathSrcTDest {

    // Edge class to represent a directed edge in the graph
    static class Edge {
        int src;  // Source vertex
        int dest; // Destination vertex

        // Constructor to initialize the edge
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create a directed graph using an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize each vertex's adjacency list
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 3)); // Edge from vertex 0 to vertex 3

        graph[2].add(new Edge(2, 3)); // Edge from vertex 2 to vertex 3

        graph[3].add(new Edge(3, 1)); // Edge from vertex 3 to vertex 1

        graph[4].add(new Edge(4, 0)); // Edge from vertex 4 to vertex 0
        graph[4].add(new Edge(4, 1)); // Edge from vertex 4 to vertex 1

        graph[5].add(new Edge(5, 0)); // Edge from vertex 5 to vertex 0
        graph[5].add(new Edge(5, 2)); // Edge from vertex 5 to vertex 2
    }

    // Recursive method to print all paths from source to destination
    // Time complexity: Exponential (due to recursion and multiple paths)
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path) {
        // Base case: If the source is the destination, print the path
        if (src == dest) {
            System.out.println(path + dest); // Print the complete path
            return;
        }

        // Explore all edges from the current source vertex
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i); // Get the edge
            // Recursive call to explore the next vertex
            printAllPath(graph, e.dest, dest, path + src);
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices in the graph
        ArrayList<Edge> graph[] = new ArrayList[V]; // Adjacency list representation of the graph

        // Create the graph
        createGraph(graph);

        int src = 5;  // Source vertex
        int dest = 1; // Destination vertex

        // Print all paths from source to destination
        printAllPath(graph, src, dest, "");
    }
}
