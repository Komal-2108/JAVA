import java.util.LinkedList;
public class JavaFramework {
    public static void main(String args[]){
        //create -- we store only objects not primitive datatyoe 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll); 
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
