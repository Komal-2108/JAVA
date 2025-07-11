import java.util.LinkedList;
public class TRy {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
       
    }
    public static Node head ;

    public static void main(String args[]){
        LinkedList<Integer>ll = new LinkedList<>();
        
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        Integer head = ll.peekFirst();
        
        System.out.println(ll);
        System.out.println(head);
        System.out.println(ll.get(1));

    }
    
}
