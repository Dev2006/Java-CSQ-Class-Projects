package instanceOf;

import javax.swing.JOptionPane;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Lion();
		
		System.out.println("Press 1 to check all Animals" + "\n" + "Press 2 to check Dog" + "\n" + "Press 1 to check Lion");
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter choice"));
		
		switch (choice) {
		case 1:
			a1.eat();
			a2.eat();
			break;
		case 2:
			if(a1 instanceof Dog)
				a1.eat();
			else
				System.out.println("No Dog found");
		case 3:
			if(a2 instanceof Lion)
				a2.eat();
			else
				System.out.println("No Lion found");
		}
	}
}
