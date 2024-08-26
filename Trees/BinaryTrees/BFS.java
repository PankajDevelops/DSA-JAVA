package Trees.BinaryTrees ;

import java.util.*;
public class BFS{

    public static class Node{

        int val;

        Node left;
        Node right;

        public Node (int val){
            this.val = val;
        }
    }

    public static void bfs(Node root){

        Queue<Node> q = new LinkedList<>();

        if(root!=null) q.add(root);

        while(q.size()>0){
            
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        
        Node a = new Node(2);
        Node b = new Node(3);
        
        root.left = a;
        root.right = b;
        
        Node d = new Node(4);
        Node e = new Node(5);
        
        a.left = d;
        a.right = e;
        
        Node g = new Node(6);
        Node h = new Node(7);
        
        b.left=g;
        b.right=h;

        bfs(root);
        
    }
    
}
