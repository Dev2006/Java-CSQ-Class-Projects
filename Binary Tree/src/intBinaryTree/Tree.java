package intBinaryTree;

public class Tree {
	public Node root = null;
	
	public Tree() {
		
		this.root = new Node(0);
	}
	
	public Tree(int val) {
		
		this.root = new Node(val);
	}
	
	public void addValue(int val) {
		Node n = new Node(val);
		
		if(root.val == 0) {
			
			root.val = val;
		} else {
			
			root.addNode(n);
		}
	}
	
	public boolean search(int val) {
		
		boolean found = root.search(val);
		return found;
	}
	
	public void traverse() {
		
		System.out.println("Ordered Binary Tree");
		this.root.visit();
	}
}