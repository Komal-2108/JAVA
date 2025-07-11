import java.util.*;
public class Dequed {
    public static void main(String args[]){
        Deque<Integer>d = new LinkedList<>();
        d.addFirst(1);//1
        d.addFirst(2);// 2 1
        d.addLast(3); // 2 1 3 
        d.addLast(4); // 2 1 3 4 
        System.out.println(d);
        d.removeLast(); // 2 1 3
        System.out.println(d);

        System.out.println("first element = " + d.getFirst());
        System.out.println("last element = " + d.getLast());
    }
}
