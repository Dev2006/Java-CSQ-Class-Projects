package cloning;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Order {
	static Food[] dishes = new Food[] {new Food("Pizza", 200), 
			new Food("Hakka Noodles", 150), 
			new Food("Butter Chicken", 250)};
	static ArrayList<Food> order = new ArrayList<>();
	
	public static void main(String[] args) {
		while (true) {
			int choice = Integer.parseInt(JOptionPane.showInputDialog("Press 0 to order Pizza" + '\n' +
					"Press 1 to order Hakka Noodles" + '\n' +
					"Press 2 to order Butter Chicken" + '\n' +
					"Press 3 to get bill"));
			
			if (choice < 3) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("How many do you want?"));
				
				addDish(dishes[choice], num);
			} else {
				printBill();
				System.exit(0);
			}
		}
	}
	
	private static void addDish(Food f, int num) {
		order.add(f);
		
		try {
			for (int i = 1; i < num; i++)
				order.add((Food) f.clone());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void printBill() {
		int amount = 0;
		
		Iterator<Food> itr = order.iterator();
		while (itr.hasNext()) {
			Food f = itr.next();
			amount += f.getPrice();
		}
		
		System.out.println("Your total amount is " + amount);
	}
}
