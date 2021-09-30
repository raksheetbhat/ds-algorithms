import java.util.List;
import java.util.ArrayList;
public class BST {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.left.left.left = new Node(0);

        //insert(root, 0);
        //insert(root, 7);

        //System.out.println(root.data);

        //inorder(root);
        //System.out.println();

        //root = create(root);
        inorder(root);
        System.out.println();
        //preorder(root);
        //System.out.println();

        int h = isBalanced(root);
        System.out.println("is bal: "+isBal+", ht: "+h);
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }

        if(data <= root.data) {
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }

        return root;
    }
    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root) {
        if(root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root, List<Node> list) {
        if(root == null) return;

        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
    public static Node create(Node root) {
        List<Node> list = new ArrayList<>();
        inorder(root, list);

        return build(list, 0, list.size()-1);
    }
    public static Node build(List<Node> list, int l, int r) {
        if(l > r) return null;

        int mid = (l+r)/2;
        Node n = list.get(mid);

        n.left = build(list, l, mid-1);
        n.right = build(list, mid+1, r);

        return n;
    }
    private static boolean isBal = true;
    public static int isBalanced(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = isBalanced(root.left);
        int rh = isBalanced(root.right);

        if(Math.abs(lh-rh) > 1) {
            isBal = false;
        }

        return Math.max(lh, rh) + 1;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
    }
}