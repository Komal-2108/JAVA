import java.util.*;

public class buildBST {
    static class Node{
        Node left ; 
        Node right;
        int data;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = right;
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
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();

    }
    
}
