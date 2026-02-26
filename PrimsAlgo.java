import java.util.ArrayList;
import java.util.PriorityQueue;



public class PrimsAlgo {

     static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }




    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 3, 50));
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int weight;

        Pair(int v, int w) {
            this.v = v;
            this.weight = w;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.weight - p2.weight;
        }

    }


    public static  int primsMST(ArrayList<Edge>[] graph, int V) {
       boolean[] vis = new boolean[V];
         int minCost = 0;
         PriorityQueue<Pair> pq = new PriorityQueue<>();

            pq.add(new Pair(0, 0)); // starting from vertex 0 with weight 0
            while (!pq.isEmpty()) {
                Pair curr = pq.remove();

                if (!vis[curr.v]) {
                    vis[curr.v] = true;
                    minCost += curr.weight;

                    for (Edge edge : graph[curr.v]) {
                        if (!vis[edge.dest]) {
                            pq.add(new Pair(edge.dest, edge.weight));
                        }
                    }
                }
            }

            return minCost;
    }


    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

    
        int mstCost = primsMST(graph, v);
        System.out.println("Minimum Cost of Spanning Tree: " + mstCost);
    }
    
}
