import java.util.*;
public class MinDistancebtwnodes {
    static class Node{
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
       
    }
    //LCA 
    public static Node lca2(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
           return root ; 
        }
        Node leftLca = lca2(root.left , n1 , n2);
        Node rightLca =lca2(root.right , n1 , n2);

        if(leftLca == null){
           return rightLca;
        }
        if(rightLca == null){
           return leftLca;
        }
        return root;
   }

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n ){
            return 0 ; 
        }
        int leftDist = lcaDist(root.left , n );
        int rightDist = lcaDist(root.right , n);
        if(leftDist == -1 && rightDist == -1 ){
            return -1;
        }else if(leftDist == -1){
            return rightDist +1 ;
        }else{
           return  leftDist + 1;
        }

    }

    public static int minDistance(Node root , int n1, int n2){
        
        Node LCA = lca2(root , n1 , n2);
        int dist1 = lcaDist(LCA , n1);
        int dist2 = lcaDist(LCA , n2);

        return dist1 + dist2 ;

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(minDistance(root , 4 , 6));
    }
    
}
