
public class CountNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }static int i = 0 ;
    public static int countnode(Node root){
        if(root == null){
            return 0;
        }

        int lc = countnode(root.left);
        int rc = countnode(root.right);
        return lc+rc + 1  ;
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
         System.out.println(countnode(root));
         
    }
    
    
}
