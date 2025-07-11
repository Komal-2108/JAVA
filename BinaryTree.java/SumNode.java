import java.util.*;

public class SumNode {
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
    public static int sumNode(Node root){
        if(root == null){
            return 0 ; 
        }
        int ls = sumNode(root.left);
        int rs = sumNode(root.right);
        return ls+rs+root.data;
    }
    public static void main(String args[] ){
        /*        1
                /   \
               2     3
              / \      \
             4   5      6
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right = new Node(3);
         root.right.left = new Node(6);
         System.out.println(sumNode(root));
         
    }

    
}
