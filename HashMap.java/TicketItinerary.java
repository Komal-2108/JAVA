import java.util.*;

public class TicketItinerary{

    public static String getStart( HashMap<String,String> ticket){
        HashMap<String , String> revMap = new HashMap<>();
        for(String key : ticket.keySet()){
            revMap.put(ticket.get(key) , key);
        }
        for(String key : ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }

        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai" , "Benguluru");
        ticket.put("Mumbai" , "Delhi");
        ticket.put("Goa" , "Chennai");
        ticket.put("Delhi" , "Goa");

        String start = getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print("-->"+ ticket.get(start));
            start = ticket.get(start);

        }
        
    }

}