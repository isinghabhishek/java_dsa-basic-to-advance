import java.util.*;

public class ConnectingCitiesWMinCost {

    // Edge class to represent a connection between cities
    static class Edge implements Comparable<Edge> {
        int dest; // Destination city
        int cost; // Cost to connect to the destination city

        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        // Compare edges based on cost for priority queue (ascending order)
        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost; // Sort by cost
        }
    }

    // Prim's Algorithm to find the minimum cost to connect all cities
    public static int connectCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(); // Min-heap to store edges by cost
        boolean vis[] = new boolean[cities.length]; // Visited array to track connected cities

        // Start from city 0 with cost 0
        pq.add(new Edge(0, 0));
        int finalCost = 0; // Total cost to connect all cities

        // Process edges until the priority queue is empty
        while (!pq.isEmpty()) {
            Edge curr = pq.remove(); // Get the edge with the smallest cost

            // If the destination city is not visited
            if (!vis[curr.dest]) {
                vis[curr.dest] = true; // Mark the city as visited
                finalCost += curr.cost; // Add the cost to the total cost

                // Add all neighboring cities of the current city to the priority queue
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) { // If there is a connection
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost; // Return the total minimum cost
    }

    public static void main(String[] args) {
        // Adjacency matrix representing the graph
        // cities[i][j] represents the cost to connect city i to city j
        int cities[][] = {
            {0, 1, 2, 3, 4}, // Connections from city 0
            {1, 0, 5, 0, 7}, // Connections from city 1
            {2, 5, 0, 6, 0}, // Connections from city 2
            {3, 0, 6, 0, 0}, // Connections from city 3
            {4, 7, 0, 0, 0}  // Connections from city 4
        };

        // Print the minimum cost to connect all cities
        System.out.println(connectCities(cities));
    }
}
