import intBinaryTree.*;

public class BinaryTreeTest {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Tree test1 = new Tree(48);
		int[] vals = new int[] {733, 936, 563, 483, 415, 536, 295};
		
		test1.addValue(52);
		test1.addValue(72);
		test1.addValue(68);
		test1.addValue(118);
		test1.addValue(27);
		
		test1.traverse();
		
		if(test1.search(57) == true) System.out.println("\n" + "found");
		else System.out.println("\n" + "not found");
	}
}
