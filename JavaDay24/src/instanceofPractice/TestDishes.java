package instanceofPractice;

import javax.swing.JOptionPane;

public class TestDishes {
	
	public static void main(String[] args) {
		Dish[] dishes = new Dish[9];
		
		dishes[0] = new Rajma();
		dishes[1] = new Chole();
		dishes[2] = new MixedVeg();
		dishes[3] = new Pizza();
		dishes[4] = new Lasagna();
		dishes[5] = new Spaghetti();
		dishes[6] = new Manchurian();
		dishes[7] = new Momo();
		dishes[8] = new HakkaNoodles();
		
		System.out.println("Press 1 for all dishes" + "\n" + 
		"Press 2 for Punjabi dishes" + "\n" + 
		"Press 3 for Italian dishes" + "\n" + 
		"Press 4 for Chinese dishes" + "\n");
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter choice"));
		
		switch (choice) {
		case 1:
			for(Dish dish : dishes) {
				if(dish instanceof Dish)
					dish.printDish();
			}
			break;
		case 2:
			for(Dish dish : dishes) {
				if(dish instanceof Punjabi)
					dish.printDish();
			}
			break;
		case 3:
			for(Dish dish : dishes) {
				if(dish instanceof Italian)
					dish.printDish();
			}
			break;
		case 4:
			for(Dish dish : dishes) {
				if(dish instanceof Chinese)
					dish.printDish();
			}
			break;
		}
	}
}
