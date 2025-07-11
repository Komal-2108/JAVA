public class ZigZag {
    public class Node{
        int data;
        Node next ; 
        public  Node(int data){
            this.data= data ;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static Node size;

    //addfirst
    public void addFirst(int data){
    Node newnode = new Node(data);
    if(head==null){
        head=tail=newnode;
        return ;
    }
    newnode.next = head ;
    head = newnode;
    }
    public void addLast(int data){
        Node newnode= new Node(data);
        if(head==null){
            head= tail=newnode;
            return ;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp= head ;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.err.println("null");
    }
    public static void zigzag(){
        //mid
      Node slow = head ; 
      Node fast = head.next;
      while(fast!= null && fast.next!= null){
        slow = slow.next;
        fast= fast.next.next;
      }
      Node mid = slow ; 

        //reverse 2nd half 
        Node curr = mid.next;
        mid.next= null  ; 
        Node prev = null ;
        Node next ; 
        while (curr!=null){
            next = curr.next ;
            curr.next= prev ;
            prev = curr ;
            curr = next;
        }

        Node LH = head ;
        Node RH = prev ;
        Node nextL, nextR;

        //alt merge - zig zag
        while(LH != null && RH != null){
            nextL = LH.next ; 
            LH.next = RH;
            nextR = RH.next ;
            RH.next = nextL;

            RH = nextR;
            LH = nextL;

        }
        
    }

    public static void main (String args[]){
        ZigZag list = new ZigZag();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.print();
        list.zigzag();
        list.print();
    }
    
}
