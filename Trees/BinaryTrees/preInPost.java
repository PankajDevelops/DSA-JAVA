package Trees.BinaryTrees;

public class preInPost {

     public static class Node{

        int val;

        Node left;
        Node right;

        public Node (int val){
            this.val = val;
        }
    }

     public static void display(Node root){

        if(root==null) return ;

        System.out.print(root.val+" -> ");

        if(root.left!=null)
        System.out.print(root.left.val+" , ");

        if(root.right!=null)
        System.out.print(root.right.val);

        System.out.println("");

        display(root.left);
        display(root.right);

    }

    public static void preOrder(Node root){

        if(root==null) return;

        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root){

        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);

    }

    public static void postOrder(Node root){

        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");

    }

    public static void preOrderN(Node root, int n){

        if(root==null) return;
        if(n==1){
             System.out.print(root.val+" ");
             return;
        }

        preOrderN(root.left, n-1);
        preOrderN(root.right, n-1);
    }

    public static int height(Node root){

        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;

        return 1 +  Math.max(height(root.left),height(root.right));
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

        // display(root);

        preOrder(root);
        System.out.println("preOrder");

        inOrder(root);
        System.out.println("inOrder");

        postOrder(root);
        System.out.println("postOrder");

System.out.println("Print nth level elements:");
        //to print nth level elements
        preOrderN(root,3);
        System.out.println("");


        int n = height(root)+1;
        System.out.println(n);

        for(int i=1; i<=n; i++){
            preOrderN(root, i);
            System.out.println("");
        }
        
    }
    
}
