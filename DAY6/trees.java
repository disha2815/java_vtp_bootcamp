package DAY6;
import java.util.*;

class Node {
	int data;
	Node left,right;
	Node(int data) {
		this.data = data;
	}
}
class BT {
	Node root = null;
	void insert(int d) {
		if(root == null) //Tree is Empty  condition
			root = new Node(d); // add root

		// queue to store order level by level
		Queue<Node> obj = new LinkedList<>();

		//add frst parent to queue
		obj.offer(root);

		//   iterate until all parents are done condition
		while(!obj.isEmpty()) {

			// take out the frst parent
			Node parent = obj.poll();

			// no child in left condition
			if(parent.left == null)
				// add child to left if condition is true
			{
				parent.left = new Node(d);
				return;
			}

			// alrdy a child is there
			else
				// add it to the last of parent queue
				obj.offer(parent.left);
			// no child in right condition
			if(parent.right == null)
				// add child to right if condition is true
			{
				parent.right = new Node(d);
				return;
			}
			// alrdy a child is there
			else
				// add it to the last of parent queue
				obj.offer(parent.right);
		}
	}
	void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
}
public class trees {
        @SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		BT obj = new BT();
		@SuppressWarnings("unused")
		int a[]=new int[n];  // 7
		for(int i=0; i<n; obj.insert(sc.nextInt()),i++);{
           obj.inorder(obj.root); 
        }
		
	}
} 