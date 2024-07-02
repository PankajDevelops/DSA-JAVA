package Trees.BinaryTrees;

class ArrayImplementation {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node binaryTree(int arr[], int idx) {

        if (idx >= arr.length)
            return null;

        Node temp = new Node(arr[idx]);
        temp.left = binaryTree(arr, 2 * idx + 1);
        temp.right = binaryTree(arr, 2 * idx + 2);

        return temp;
    }

    static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    static void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

    public static void main(String[] args) {

        int[] arr = { 11, 22, 3, 54, 15, 23, 21 };

        Node root = binaryTree(arr, 0);

        System.out.println("preOrder");
        preOrder(root);
        System.out.println("");

        System.out.println("inOrder");
        inOrder(root);
        System.out.println("");

        System.out.println("postOrder");
        postOrder(root);

    }

}
