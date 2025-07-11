import java.util.*;
public class ValideBST {
    static class Node{
        Node left ; 
        Node right;
        int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data >val){
            //left subtree
           root.left = insert(root.left , val);
        }else{
            //right subtree
            root.right = insert(root.right , val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root== null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static boolean isValidBST(Node root , Node min , Node max){
        if(root == null){
          return  true;
        }
        //check right node
        if(min != null && root.data <= min.data){
            return false;
        }
        //left node
        if(max != null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min, root)&&
        isValidBST(root.right,root, max);

    }
    public static void main (String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

        System.out.println(isValidBST(root,null,null));

       
    }
    
}
