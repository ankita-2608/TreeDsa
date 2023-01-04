import java.util.Scanner;
public class Main {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(height(root));
        System.out.println(size(root));
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

    static int size(Node root) {
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;
    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
