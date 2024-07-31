package Trees.BinaryTrees;

public class sizeSumMaxHeigth {

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

    public static int size(Node root){

        if(root==null) return 0;

       return 1 + size(root.left)+ size(root.right);

    }

    public static int sum(Node root){

        if(root==null) return 0;

       return root.val + sum(root.left)+ sum(root.right);

    }

    public static int max(Node root){

        if(root==null) return Integer.MIN_VALUE;

        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);

        return Math.max(a,Math.max(b,c));

    }

    public static int height(Node root){

        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        //for max depth just retun root==null ==0 only

       return 1 + Math.max(height(root.left),height(root.right));

    }

    public static int depth(Node root){

        if(root==null) return 0;

        return 1 + Math.max(depth(root.left),depth(root.right));
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        
        Node a = new Node(3);
        Node b = new Node(10);
        
        root.right = b;
        root.left = a;
        
        Node d = new Node(1);
        Node e = new Node(6);
        
        a.left = d;
        a.right = e;
        
        Node g = new Node(4);
        Node h = new Node(7);
        
        e.left=g;
        e.right=h;
        
        Node x = new Node(14);
        b.left = x;
        Node y = new Node(13);
        x.left=y;


        preOrder(root);
        System.out.println("Size of tree is : "+ size(root));
        System.out.println("Sum of tree is : "+ sum(root));
        System.out.println("Max value of tree is : "+ max(root));
        System.out.println("Height of tree is : "+ height(root));
        System.out.println("Max Depth of tree is : "+ depth(root));


        
    }
    
}
