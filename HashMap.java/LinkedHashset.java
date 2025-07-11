import java.util.*;

public class LinkedHashset {
    public static void main(String args[]){
         HashSet<String>cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Delhi");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Patna");
        lhs.add("Mumbai");
        lhs.add("Bengaluru");
        lhs.add("Delhi");
        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);
    }
    
}
