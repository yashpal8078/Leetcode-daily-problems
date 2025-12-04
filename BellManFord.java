import java.util.*;

public class BellManFord {

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
        
    }
    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }
    public static void bellmanFord(ArrayList<Edge> graph[], int src,int V) {
        int[] dist = new int[graph.length];

        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 1; i < V-1; i++) {


            for (int j = 0; j < graph.length; j++) {
                for(int k = 0;k<graph[j].size();k++){
                    Edge edge = graph[j].get(k);
                    if (dist[edge.src] != Integer.MAX_VALUE &&
                        dist[edge.src] + edge.weight < dist[edge.dest]) {
                        dist[edge.dest] = dist[edge.src] + edge.weight;
                    }
                }
            }
        }
    

        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }



    public static void main(String[] args) {

        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        bellmanFord(graph, 0, v);
    }
}