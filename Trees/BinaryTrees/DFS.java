package Trees.BinaryTrees;

import java.util.*;
public class DFS{

    public static class Node{

        int val;

        Node left;
        Node right; 

        public Node (int val){
            this.val = val;
        }
    }

     static void DFS(Node root){

        Stack<Node> st = new Stack<>();

        if(root!=null)st.push(root);

        while(st.size()>0){
            Node temp = st.peek();
            if(temp.left!=null){
                st.push(temp.left);
                temp.left=null;
            }
            else{
                st.pop();
                System.out.print(temp.val+" ");
                if(temp.right!=null) st.push(temp.right);
            }
        }

    }

    public static void main(String[] args) {

         Node root = new Node(2);

        Node a = new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        DFS(root);
        
    }
    
}
