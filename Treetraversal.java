import java.util.Scanner;
public class Main {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    static Node createNode() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("enter data for left " +data);
        root.left = createNode();

        System.out.println("Enter data for right" +data);
        root.right = createNode();

        return root;
    }

    static void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }
}
