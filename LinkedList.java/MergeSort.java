public class MergeSort {
    public  class Node {
        int data;
        Node next  ; 
        public Node(int data){
            this.data= data;
            this.next = null;
        }

    }
    public static Node head ;
    public static Node tail;
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

    public  static  Node getMid(Node head){
        Node slow = head ; 
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow ;
    }
    private Node merge (Node head1 , Node head2 ){
        Node mergedLL = new Node(-1) ;
        Node temp = mergedLL;
        while(head1!= null && head2!= null){
            if(head1.data <= head2.data){
                temp.next = head1 ; 
                head1 = head1.next;
                temp = temp.next ; 
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            while(head1!=null){
                temp.next = head1 ; 
                head1 = head1.next;
                temp = temp.next ;
            }
            while(head2!=null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            
            }   
        }

        return mergedLL.next;
    }

    public  Node mergeSort(Node head){
        if(head==null || head.next == null){
            return head ; 
        }
        // find mid
        Node mid = getMid(head);
        //left and right MS 
        Node righthead = mid.next ; 
        mid.next = null ; 
       Node newLeft =  mergeSort(head); // ye hme ek sorted linkedlist k head reurn krega
       Node newright =  mergeSort(righthead);
        //merge
        return merge(newLeft , newright);
        
    }
    public void print(){
        Node temp = head ;
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        while(temp!= null){
            System.out.println(temp + "-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
        public static void main(String args[]){
        MergeSort ll = new MergeSort();
       
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(6);
        ll.addLast(5);
        //5->4->3->2->1
      ll.print();
    //   ll.head = ll.mergeSort(head);
    ll.mergeSort(head);
      ll.print();
       

           


    }
    
}
