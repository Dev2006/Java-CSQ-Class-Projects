package intBinaryTree;

public class Node {
	public int val = 0;
	public Node left = null;
	public Node right = null;
	
	public Node() {
		
		this.val = 0;
	}
	
	public Node(int val) {
		
		this.val = val;
	}
	
	public void addNode(Node n) {
		
		if(this.val >= n.val) {
			
			if(this.left == null) this.left = n;
			else this.left.addNode(n);
		} else {
			
			if(this.right == null) this.right = n;
			else this.right.addNode(n);
		}
	}
	
	public void visit() {
		
		if(!(this.left == null)) {
			
			this.left.visit();
			System.out.print(this.val + ", ");
		} else {
			
			System.out.print(this.val + ", ");
		}
		
		if(!(this.right == null)) {
			
			this.right.visit();
		}
	}
	
	public boolean search(int val) {
		
		if(this.val == val) return true;
		else {
			
			if(this.left != null && this.val > val) return this.left.search(val);
			
			if(this.right != null && this.val < val) return this.right.search(val);
		}
		
		return false;
	}
	
}
