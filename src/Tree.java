import java.util.List;

public class Tree<T> {
	// Node class
	public static class Node<T> {
		// Private variables
		private T element;
		
		private Node<T> parent;
		private List<Node<T>> children;
		
		// Constructor
		public Node(T element, List<Node<T>> children) {
			this.children = children;
			this.element = element;
		}
		public Node(T element) {
			this.element = element;
		}
		
		// Methods
		public T element() {
			return element;
		}
		public Node<T> parent() {
			return parent;
		}
		public void setParent(Node<T> parent) {
			this.parent = parent;
		}
		
		public String toString() {
			return "";
		}
	}
	
	// Private variables
	private Node<T> head;
	
	// Constructors
	public Tree(Node<T> head) {
		if (head != null) {
			this.head = head;
		}
	}
	
	// Methods
	public Node<T> root() {
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
