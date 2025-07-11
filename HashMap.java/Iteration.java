import java.util.*;

public class Iteration {
    public static void main(String args[]){
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India",150);
        hm.put("China" , 200);
        hm.put("Indonesia" , 50);
        hm.put("USA" , 50);
        hm.put("Nepal" , 55);
        hm.put("Bhutan" , 75);

        //Iterate
        Set<String>keys = hm.keySet();
        System.out.print(keys);

        for (String k : keys) {
            System.out.println("key =  "+ k + ", value = "+ hm.get(k));
            
        }
    
    }
    
}
