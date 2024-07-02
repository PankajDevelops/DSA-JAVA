package Trees.Practice;

class Node {

    int val;

    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}

public class lowestCommonAncestor {

    public static Node makeRoot(int arr[], int idx) {

        if (idx >= arr.length || arr[idx] == -1)
            return null;

        Node root = new Node(arr[idx]);

        root.left = makeRoot(arr, 2 * idx + 1);
        root.right = makeRoot(arr, 2 * idx + 2);

        return root;

    }

    public static Node fixNode(Node root, int value) {

        if (root == null)
            return null;

        if (root.val == value)
            return root;

        Node leftRoot = fixNode(root.left, value);
        if (leftRoot != null)
            return leftRoot;

        return fixNode(root.right, value);

    }

    public static boolean contains(Node root, Node temp) {

        if (root == null)
            return false;
        if (root == temp)
            return true;

        return contains(root.left, temp) || contains(root.right, temp);

    }

    public static Node lca(Node root, Node p, Node q) {

        if (p == root || q == root)
            return root;
        if (p == q)
            return p;

        boolean leftP = contains(root.left, p);
        boolean rightQ = contains(root.right, q);

        if ((leftP && rightQ) || (!leftP && !rightQ))
            return root;
        if (leftP && !rightQ)
            return lca(root.left, p, q);
        if (!leftP && rightQ)
            return lca(root.right, p, q);

        return root;

    }

    // root=[3,5,1,6,2,0,8,null,null,7,4],p=5,q=4

    public static void main(String[] args) {

        int arr[] = { 3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4 };

        int pValue = 5;
        int qValue = 4;

        Node root = makeRoot(arr, 0);

        Node p = fixNode(root, pValue);
        Node q = fixNode(root, qValue);

        Node ans = lca(root, p, q);

        System.out.println(ans.val);

    }

}
