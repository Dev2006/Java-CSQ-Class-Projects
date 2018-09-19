package StringBinaryTree;

public class Tree {
	public Node root = null;
	
	public Tree() {
		
		this.root = new Node();
	}
	
	public Tree(String val) {
		
		this.root = new Node(val);
	}
	
	public void addValue(String val) {
		Node n = new Node(val);
		
		if(root.val == null) {
			
			root.val = val;
		} else {
			
			root.addNode(n);
		}
	}
	
	public boolean search(String val) {
		
		boolean found = root.search(val);
		return found;
	}
	
	public void traverse() {
		
		System.out.println("Ordered Binary Tree");
		this.root.visit();
	}
}