import java.util.List;
import java.util.ArrayList;

public class Tree {
	// Node class
	public static class Node {
		// Private variables
		private float element;
		
		private Node parent;
		private List<Node> children;
		
		// Constructor
		public Node(float element, List<Node> children) {
			this.children = children;
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
		
		public String toString() {
			return "";
		}
	}
	
	// Private variables
	private Node head;
	
	// Constructors
	public Tree(Node head) {
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
			return "Tree -> " + head;
		} else {
			return "Tree";
		}
	}
}
