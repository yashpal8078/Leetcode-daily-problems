import java.util.*;

class KruskalAlgo{

    // Edge class
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        // Sort edges by weight
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    // Disjoint Set Union (Union-Find)
    static class DSU {
        int[] parent;
        int[] rank;

        public DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]); // path compression
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) return;

            // union by rank
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    // Kruskal's MST function
    public static int kruskalMST(int vertices, List<Edge> edges) {
        // Sort edges by weight
        Collections.sort(edges);

        DSU dsu = new DSU(vertices);
        int mstWeight = 0;
        int edgesUsed = 0;

        for (Edge edge : edges) {

            // If parents are different → no cycle → pick edge
            if (dsu.find(edge.src) != dsu.find(edge.dest)) {
                dsu.union(edge.src, edge.dest);
                mstWeight += edge.weight;
                edgesUsed++;

                if (edgesUsed == vertices - 1)
                    break;  // MST completed
            }
        }

        return mstWeight;
    }

    // Driver
    public static void main(String[] args) {

        int vertices = 4;

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        int result = kruskalMST(vertices, edges);
        System.out.println("Minimum cost of MST = " + result);
    }
}