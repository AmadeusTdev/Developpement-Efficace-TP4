public class BinaryTree {
	// Node class
	public static class Node {
		// Private variables
		private float element;
		
		private Node parent;
		private Node left;
		private Node right;
		private String operation;
		
		// Constructor
		public Node(Node left, String operation, Node right) {
			this.left = left;
			this.right = right;
			this.operation = operation;
			
			if (left != null) { left.setParent(this); }
			if (right != null) { right.setParent(this); }
		}
		public Node(float element) {
			this.element = element;
		}
		
		// Methods
		public float element() {
			return element;
		}
		public Node parent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
		
		public float result() {
			if (operation != null) {
				if (operation == "+") { return left.result() + right.result(); }
				else if (operation == "*") { return left.result() * right.result(); }
				else if (operation == "/") { return left.result() / right.result(); }
				else { return 0; }
			} else {
				return element;
			}
		}
		
		public String toString() {
			if (operation != null) {
				return "(" + left + operation + right + ")";
			} else {
				return "" + element;
			}
		}
	}
	
	// Private variables
	private Node head;
	
	// Constructors
	public BinaryTree(Node head) {
		if (head != null) {
			this.head = head;
		}
	}
	
	// Methods
	public Node root() {
		return head;
	}
	
	public String toString() {
		if (head != null) {
			return "BinaryTree -> " + head + " = " + head.result();
		} else {
			return "BinaryTree";
		}
	}
}
