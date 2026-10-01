import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		// Test arbre binaire
		BinaryTree.Node n1 = new BinaryTree.Node(1);
		BinaryTree.Node n2 = new BinaryTree.Node(5);
		BinaryTree.Node o3 = new BinaryTree.Node(n1, "+", n2);
		BinaryTree.Node n4 = new BinaryTree.Node(2);
		BinaryTree.Node n5 = new BinaryTree.Node(8);
		BinaryTree.Node o6 = new BinaryTree.Node(n4, "*", n5);
		BinaryTree.Node o7 = new BinaryTree.Node(o3, "/", o6);
		
		BinaryTree myTree = new BinaryTree(o7);
		System.out.println(myTree);
		
		BinaryTree.Node n11 = new BinaryTree.Node(5);
		BinaryTree.Node n12 = new BinaryTree.Node(2);
		BinaryTree.Node n13 = new BinaryTree.Node(8);
		BinaryTree.Node o14 = new BinaryTree.Node(n11, "+", n12);
		BinaryTree.Node o15 = new BinaryTree.Node(o14, "*", n13);
		
		BinaryTree myTree2 = new BinaryTree(o15);
		System.out.println(myTree2);
		
		// Test arbre normal
		Tree.Node n21 = new Tree.Node(5);
		Tree.Node n22 = new Tree.Node(8);
		
		List<Tree.Node> myList = new ArrayList<Tree.Node>();
		myList.add(n21);
		myList.add(n22);
		
		Tree.Node n23 = new Tree.Node(5, myList);
		
		BinaryTree myTree3 = new Tree(n23);
		System.out.println(myTree2);
	}
}
