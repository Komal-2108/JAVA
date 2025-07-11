
import java.util.*;
public class HSiteration {
    public static void main(String args[]){
        HashSet<String>cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Delhi");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        //Advanced Loops
        for(String city :cities){
            System.out.println(city);

        }

    }
    
}
