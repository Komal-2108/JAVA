import java.util.*;
public class CheapestFlightKStops {
    static class Edge{
        int src ; 
        int dest ; 
        int wt ; 

        public Edge(int s , int d , int w ){
            this.src = s ; 
            this.dest = d ; 
            this.wt = w ; 
        }
    } 
    public static void createGraph(  int flights[][] , ArrayList<Edge> graph[] ){
        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0 ; i<flights.length ; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src , dest , wt );
            graph[src].add(e);
        }
    }
    static class Info{
        int v ; 
        int cost ; 
        int stops;

        public Info(int v , int c , int s){
            this.v = v ; 
            this.cost = c; 
            this.stops = s ; 

        }
    }
    public static int cheapestFlight(int n , int flights[][] , int sour , int dst , int k ){
        ArrayList<Edge> graph[]= new ArrayList[n]; 
        createGraph(flights , graph);

        int dist [] = new int [graph.length];
        for(int i = 0 ; i<graph.length ; i++){
           if(i != sour){
            dist[i] = Integer.MAX_VALUE;
           }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(sour , 0 , 0));

        while(!q.isEmpty()){
            Info curr = q.remove(); 
            if(curr.stops > k ){
                break ; 
            }
            for(int i = 0 ; i<graph[curr.v].size() ; i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src ; 
                int v = e.dest ; 
                int w = e.wt ; 
            
                if( curr.cost+w < dist[v] && curr.stops <=k){
                    dist[v] = curr.cost + w ; 
                    q.add(new Info(v , dist[v] , curr.stops+1  ));
                }
            }
        }

        if(dist[dst] == Integer.MAX_VALUE){
            return -1 ; 
        } 
       else{
        return dist[dst];
       }


    }

    public static void main(String args[]){
        int n = 4 ; 
        int flights[][] = {{0,1,100} , {1,2,100} , {2,0,100} , {1,3,600} , {2,3,200}};
        int  sour = 0 ; int  dst = 3 ; int k = 1 ; 
        System.out.println(cheapestFlight(n , flights , sour , dst , k));
        



    }

    
}
