package hashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		Food arr[] = new Food[] {
			new Food(19, "Pizza", "Veg"),
			new Food(20, "Pasta", "Non Veg"),
			new Food(21, "Noodles", "Veg")
		};
		LinkedHashSet<Food> set=new LinkedHashSet<Food>();
		
		for (Food food : arr) {
			set.add(food);
		}
		
		Iterator<Food> it = set.iterator();
		while (it.hasNext()) {
			
			Food food = it.next();
			System.out.println(food);
		}
	}
}
