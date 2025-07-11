import java.util.*;

public class Root2Node {
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
    public static void printpath(ArrayList<Integer>path){
        for(int i = 0 ; i<path.size() ; i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void root2Node(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
           printpath(path);
        }
        root2Node(root.left , path);
        root2Node(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main (String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root , values[i]);
        }

        inOrder(root);
        System.out.println();
        root2Node(root,new ArrayList<>());

       
    }
    
}