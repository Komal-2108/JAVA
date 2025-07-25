import java.util.*;

public class BSTtoBalancedBST {
    static class Node{
        int data;
        Node left ;
        Node right;

        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
    }
    public static void inOrder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        inOrder(root.left , inorder);
       inorder.add(root.data);
        inOrder(root.right, inorder);

    }
    public static Node arr2BST(ArrayList<Integer> inorder, int st , int end  ){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = arr2BST(inorder,st , mid-1);
        root.right = arr2BST(inorder,mid+1,end);
        return root;
       
        
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(2);
        root.right = new Node(10);
        root.right.right = new Node (11);
        root.right.right.right = new Node (12);
       ArrayList<Integer> inorder = new ArrayList<>();
       inOrder(root,inorder);
       arr2BST(inorder , 0, inorder.size()-1);
       preOrder(root);
    }
    
}
