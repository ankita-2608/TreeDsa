import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();

        printLevel(root);
      
    }
  
    static Node createNode() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("enter for left" + data);
        root.left = createNode();
        System.out.println("Enter for right" +data);
        root.right = createNode();
        return root;
    }
   
        static void printLevel(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q!=null) {
            Node curr = q.poll();
            if(curr==null) {
                if(q.isEmpty()) return;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.data);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
  
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }
}
