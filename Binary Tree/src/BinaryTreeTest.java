import StringBinaryTree.*;

public class BinaryTreeTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Tree test1 = new Tree("Dev");
		String[] vals = new String[] {"Mohit", "Pragati", "Manvi", "Moe", "Peggy", "Manvi"};
		
		test1.addValue("Mohit");
		test1.addValue("Pragati");
		test1.addValue("Manvi");
		test1.addValue("Moe");
		test1.addValue("Peggy");
		test1.addValue("Manvi");
		
		test1.traverse();
		System.out.println("\n" + test1.root.left.val);
		
		if(test1.search("Manvi") == true) System.out.println("\n" + "found");
		else System.out.println("\n" + "not found");
	}
}