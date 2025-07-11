import java.util.*;

public class Treeset {
    public static void main(String args[]){
        HashSet<String>cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Delhi");
        System.out.println(cities);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Patna");
        ts.add("Mumbai");
        ts.add("Bengaluru");
        ts.add("Delhi");
        System.out.println(ts);

    }
    
}
