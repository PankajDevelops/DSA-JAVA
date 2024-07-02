package Trees.Practice;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}

public class arrayInputTest {

    private static final int NULL_VALUE = -1;

    public static Node makeNode(int arr[], int idx) {
        if (idx >= arr.length || arr[idx] == NULL_VALUE)
            return null;

        Node root = new Node(arr[idx]);
        root.left = makeNode(arr, 2 * idx + 1);
        root.right = makeNode(arr, 2 * idx + 2);

        return root;
    }

    public static boolean contains(Node root, Node temp) {
        if (root == null)
            return false;
        if (root.val == temp.val)
            return true;
        return contains(root.left, temp) || contains(root.right, temp);
    }

    public static Node lca(Node root, Node p, Node q) {
        if (root == null || root.val == p.val || root.val == q.val)
            return root;

        boolean leftP = contains(root.left, p);
        boolean leftQ = contains(root.left, q);

        if (leftP && leftQ)
            return lca(root.left, p, q);
        if (!leftP && !leftQ)
            return lca(root.right, p, q);

        return root;
    }

    public static Node findNode(Node root, int value) {
        if (root == null)
            return null;
        if (root.val == value)
            return root;
        Node leftResult = findNode(root.left, value);
        if (leftResult != null)
            return leftResult;
        return findNode(root.right, value);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4 };
        Node root = makeNode(arr, 0);

        int pValue = 5;
        int qValue = 4;

        // Find nodes with the given values
        Node p = findNode(root, pValue);
        Node q = findNode(root, qValue);

        Node ans = lca(root, p, q);

 
        System.out.println("LCA: " + ans.val);
 
    }
}
