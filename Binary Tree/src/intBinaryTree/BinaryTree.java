package intBinaryTree;

import java.util.Random;
import java.util.Scanner;

public class BinaryTree {
	
	public Tree randomVals() {
		Random rand = new Random();
		Tree t = new Tree();
		
		int reps = rand.nextInt(50);
		
		for(int i = 0; i < reps; i++) {
			int num = rand.nextInt(100);
			t.addValue(num);
		}
		
		return t;
	}
	
	public Tree randomVals(int maxSize, int reps) {
		Random rand = new Random();
		Tree t = new Tree();
		
		for(int i = 0; i < reps; i++) {
			int num = rand.nextInt(maxSize);
			t.addValue(num);
		}
		
		return t;
	}
	
	public Tree makeTree() {
		Scanner reader = new Scanner(System.in);
		Tree t;
		
		System.out.println("Enter value of root node:");
		int root = reader.nextInt();
		
		t = new Tree(root);
		
		for(;;) {
			
			System.out.println("\n" + "Do you want to add a value (y/n)");
			char choice = reader.next().charAt(0);
			
			if(choice == 'y'||choice == 'Y') {
				
				System.out.println("\n" + "enter value to add to tree");
				int value = reader.nextInt();
				t.addValue(value);
			} else if(choice == 'n'||choice == 'N') {
				
				break;
			}
		}
		
		reader.close();
		return t;
	}
	
	public Tree makeTree(int[] vals) {
		Tree t = new Tree();
		
		for(int i = 0; i < vals.length; i++) {
			
			t.addValue(vals[i]);
		}
		
		return t;
	}
}
