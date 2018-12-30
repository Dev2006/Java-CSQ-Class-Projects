package instanceofPractice;

public abstract class Chinese extends Dish {}

class Manchurian extends Chinese {

	@Override
	public void printDish() {
		
		System.out.println("Manchurian");
	}
}

class Momo extends Chinese {

	@Override
	public void printDish() {
		
		System.out.println("Momo");
	}
}

class HakkaNoodles extends Chinese {

	@Override
	public void printDish() {
		
		System.out.println("Hakka Noodles");
	}
}