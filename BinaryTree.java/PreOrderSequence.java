import java.util.*;

public class PreOrderSequence {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;

        }
        public static void preOrder(Node root){ // O(n)
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left); // call line newnode.left where newnode is root.
            preOrder(root.right);
        }
        public static void inorder(Node root){
            if(root == null){
                System.out.print(-1 + " ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);

        }
        public static void postorder(Node root){
            if(root == null ){
                System.out.print(-1 + " ");
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnode = q.remove();
                if(currnode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data + " ");
                    if(currnode.left != null){
                        q.add(currnode.left);
                    }
                    if(currnode.right != null){
                        q.add(currnode.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees = new BinaryTree();
        Node root = trees.buildTree(nodes);
        // // trees.preOrder(root);
        // trees.inorder(root);
        // trees.postorder(root);
        trees.levelOrder(root);
    }
    
}
