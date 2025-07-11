import java.util.HashMap;

public class Operations {
    public static void main(String args[]){
        //create
        HashMap<String , Integer>hm = new HashMap<>();

        //insert
        hm.put("India" , 100);
        hm.put("China" , 200);
        hm.put("USA" , 50);
    
        System.out.println(hm);

        //Get 
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); // null value for non existing key

        //contains key
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        //remove
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonesia"));
        
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());


    }
    
}
