package StringBinaryTree;

public class Node {
	public String val = null;
	public Node left = null;
	public Node right = null;
	
	public Node() {}
	
	public Node(String val) {
		
		this.val = val;
	}
	
	public void addNode(Node n) {
		
		if(shouldGoRight(n.val)) {
			
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
	
	public boolean search(String val) {
		
		if(this.val == val) return true;
		else {
			
			if(this.left != null && shouldGoRight(val)) return this.left.search(val);
			
			if(this.right != null && shouldGoLeft(val)) return this.right.search(val);
		}
		
		return false;
	}
	
	private boolean shouldGoRight(String val) {
		boolean shouldGoRight = false;
		
		for(int i = 0; i < val.length() && i < this.val.length(); i++) {
			
			if(this.val.charAt(i) <= val.charAt(i)) {
				
				shouldGoRight = true;
			}
		}
		
		return shouldGoRight;
	}
	
	private boolean shouldGoLeft(String n) {
		boolean shouldGoLeft = false;
		
		for(int i = 0; i < val.length(); i++) {
			
			if(this.val.charAt(i) > val.charAt(i)) {
				
				shouldGoLeft = true;
			}
		}
		
		return shouldGoLeft;
	}
}