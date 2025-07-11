import java.util.*;
public class SubTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node node , Node subroot){
        // node parametere yaha pe vo node h jisko check kr rhe h ki identical h ya nhi 
        if(node == null && subroot == null){
            return true ; 
        }else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }
        if(!isIdentical(node.left , subroot.left)){
            return false ;// agr node k left part subroot ke left part se identical nhi hoga to ye function true return krega aur hm false eturn kr denge ;
        }
        if(!isIdentical(node.right , subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root , Node subroot){
        if(root == null){
            return false; // because subroot is not empty 
        }
        if(root.data == subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }
        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot); //agr left me true return krt h to right me check krne ki jrurt nhi h . pr agr left wla false return krta h to hm check krenge ki kahi right me to exist nhi kta H .
    }
    public static void main(String args[] ){
        /*        1
                /   \
               2     3
              / \    /  \
             4   5   6   7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.left.left = new Node(4);
        //  root.left.right = new Node(5);
         root.right = new Node(3);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

        /**
                    2
                   / \
                  4   5
                  
         */         
         Node Subroot = new Node(2);
          Subroot.left = new Node(4);
          Subroot.right = new Node(5);
        System.out.println(isSubtree(root , Subroot));
        
         
    }

    
}
