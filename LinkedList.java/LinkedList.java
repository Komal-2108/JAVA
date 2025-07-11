public class LinkedList {
    public static class Node{
        int data ; 
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0 ;

    public void addFirst(int data){
        
        Node newnode= new Node(data);
        size++;
        if(head== null){
            head= tail = newnode ; 
            return ; 
        }
        newnode.next= head;
        head = newnode;
    }
    public void addLast(int data){
        Node newnode= new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return ;
        }
        tail.next= newnode ; 
        tail = newnode;
    }
    public void print(){
        if(head== null){
            System.out.println("linked list is empty");
            return ; 
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next ; 
        }
        System.out.println("null");
    }

    
    public void addmiddle(int data , int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        int i = 0 ;
        Node temp = head;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i= idx -1  
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public int removefirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val ;
    }
    public int removelast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i = 0 ; i<size-2 ; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next= null;
        prev = tail;
        tail=prev;

        size--;
        return val ;

    }
    public void searchItr(int key){
        Node temp = head;
        for(int i = 0 ; i<size ; i++){
            if(temp.data == key ){
                System.out.println("found at index : " + i);
                return;
            }else {
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("key not found ");
                return ;
            }
        }
    }
    public void searchRec(int key , int i  , Node head){
        if(head == null){
            System.out.println("key not found");
            return ;
        }
        if(head.data == key){
            System.out.println("key found at " + i );
            return ;
        }else{
        searchRec(key , i+1 , head.next);
        }
    }
    public void reverse(){
        Node prev  = null;
        Node curr = tail= head;
        Node next ; 

       while (curr != null){
        next = curr.next;
        curr.next = prev ;
        prev = curr ; 
        curr= next;
       }

       head = prev ; 
    }
    public void removeNth(int n ){
        Node prev=head;
        if(n == size ){
            head = head.next ; 
            return ; 
        }
        int i = 1 ; 
        int iToFind = size - n ;
        while (i<iToFind){
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next ; 
        return ; 
        }


        public static boolean isCycle(){ //Floyd's Cycle finding Algorithm 
            Node slow = head ;
            Node fast = head ;

            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    System.out.println("Cycle exist ");
                    return true ;
                }
            }
            System.out.println("cycle does not exist");
            return false ;
        }
        public static void removeCycle (){
            //detect cycle 
            Node slow = head ;
            Node fast = head ;
            boolean cycle = false ;
            while (fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next ;
                if(fast ==slow ){
                    cycle = true ;
                    break;
                }
            }
           if(cycle == false){
            return  ;
           } 
            //find meeting point
             slow = head ;
             Node prev = null; // last node 
             while (slow != fast ){
                prev = fast ;
                slow = slow.next;
                fast = fast.next;
             }

            //remove cycle --> last.next = null 
            prev.next = null ;
        }
        
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList ();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;  
        // head.next.next= new Node(3);
        // head.next.next.next = temp; 
        //1->2->3->2

        ll.addLast(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // ll.addmiddle(3, 2 );
        // ll.print();
        // System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removelast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.searchItr(10);
        // ll.searchRec(45 , 0 ,head);
       
        // ll.reverse();
        // ll.print();
        
        // ll.removeNth(3);
        // ll.print();
        // System.out.println(isCycle());
        // removeCycle();
        // isCycle();
        ll.print();
     

    }   

    
}
