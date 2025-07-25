import java.util.*;

public class PrintrangeBST {
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
    public static void print(Node root , int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            print(root.left , k1,k2);
            System.out.print(root.data + " ");
            print(root.right ,k1,k2);
        }
        else if (root.data>k2){
            print(root.right,k1,k2);
        }
        else{
            print(root.left , k1 , k2);
        }
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();
        print(root,5,12);

    }
}
