package DAY6;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {

    Node root = null;

    void insert(int d) {
        root = insertRecursive(root, d);
    }

    Node insertRecursive(Node root, int d) {

        if (root == null)
            return new Node(d);

        if (d < root.data)
            root.left = insertRecursive(root.left, d);
        else if (d > root.data)
            root.right = insertRecursive(root.right, d);

        return root;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Level Order Traversal
    void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                q.offer(current.left);

            if (current.right != null)
                q.offer(current.right);
        }
    }
    Node delete(Node root, int target) {
      if(root == null) return root;
      if(target < root.data) {
        root.left = delete(root.left, target);
      } else if(target > root.data) {
        root.right = delete(root.right, target);
      } else {
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        root.data = minValue(root.right);
        root.right = delete(root.right, root.data);
      }
      return root;
    }
    int minValue(Node root) {
      int min = root.data;
      while(root.left != null) {
        min = root.left.data;
        root = root.left;
      }
      return min;
    }
}

public class trees2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BST obj = new BST();

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 8; i++) {
            obj.insert(sc.nextInt());
        }

        System.out.print("Inorder Traversal: ");
        obj.inorder(obj.root);

        System.out.println();

        System.out.print("Level Order Traversal: ");
        obj.levelOrder(obj.root);

        sc.close();
    }
}