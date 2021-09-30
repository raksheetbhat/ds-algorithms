import java.util.Queue;
import java.util.LinkedList;
public class Traversals {
    public static void main(String[] args) {
        /*
                  1
              2       5
            3   4   6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        dfs(root);
    }

    public static void preorder(Node r) {
        if(r == null) return;

        System.out.print(r.data+" ");
        preorder(r.left);
        preorder(r.right);
    }

    public static void inorder(Node r) {
        if(r == null) return;

        inorder(r.left);
        System.out.print(r.data+" ");
        inorder(r.right);
    }

    public static void postorder(Node r) {
        if(r == null) return;

        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data+" ");
    }

    public static void dfs(Node r) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(r);
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.print(n.data+" ");
            if(n.left != null) queue.add(n.left);
            if(n.right != null) queue.add(n.right);
        }
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