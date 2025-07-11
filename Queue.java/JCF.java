import java.util.*;
import java.util.LinkedList;
public class JCF {
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>(); //arraydeque
         q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
    }
    
}
