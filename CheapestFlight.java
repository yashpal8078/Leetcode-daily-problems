
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlight {

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }


    }

    static class Pair{
        int v, cost, stops;

        Pair(int n, int c, int s){
            this.v = n;
            this.cost = c;
            this.stops = s;
        }
    }

 public static void createGraph(int flight[][], ArrayList<Edge> graph []){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

       for(int i = 0;i<flight.length;i++){
           int src = flight[i][0];
           int dest = flight[i][1];
           int weight = flight[i][2];
           Edge e = new Edge(src,dest,weight);
           graph[src].add(e);
       }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
     @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);
 
        int[]  dist = new int[n];
        for(int i = 0; i < n; i++){
            if(i != src){

            dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Pair> pq = new LinkedList<>();
        pq.add(new Pair(src,0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(curr.stops > k){
                break;
            }


            for(int i = 0; i < graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest; 
                int wt = e.weight;  
                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    pq.add(new Pair(v, dist[v], curr.stops + 1));
                }
            }
        }

        return (dist[dest] == Integer.MAX_VALUE) ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        
        int n = 4;
        int flight[][] = {
            {0,1,100},
            {1,2,100},
            {2,0,100},
            {1,3,600},
            {2,3,200}
        };

        int src = 0;
        int dest = 3;   
        int k = 1;
        int ans = cheapestFlight(n, flight, src, dest, k);
        System.out.println("The cheapest flight cost is: " + ans);

       
    }

    
}
