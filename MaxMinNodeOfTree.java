import java.util.Scanner;
public class Main {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
       
        System.out.println(maximum(root));
        System.out.println(minimum(root));
    }


    static Node createTree() {
        Node root = null;

        System.out.println("enter the data");

        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    static int maximum(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    static int minimum(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
