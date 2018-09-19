package StringBinaryTree;

import java.util.Scanner;

public class BinaryTree {
	
	public Tree makeTree() {
		Scanner reader = new Scanner(System.in);
		Tree t;
		
		System.out.println("Enter value of root node:");
		String root = reader.next();
		
		t = new Tree(root);
		
		for(;;) {
			
			System.out.println("\n" + "Do you want to add a value (y/n)");
			char choice = reader.next().charAt(0);
			
			if(choice == 'y'||choice == 'Y') {
				
				System.out.println("\n" + "enter value to add to tree");
				String value = reader.next();
				t.addValue(value);
			} else if(choice == 'n'||choice == 'N') {
				
				break;
			}
		}
		
		reader.close();
		return t;
	}
	
	public Tree makeTree(String[] vals) {
		Tree t = new Tree();
		
		for(int i = 0; i < vals.length; i++) {
			
			t.addValue(vals[i]);
		}
		
		return t;
	}
}
