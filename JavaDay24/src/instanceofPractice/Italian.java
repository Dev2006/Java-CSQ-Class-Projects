package instanceofPractice;

public abstract class Italian extends Dish {}

class Pizza extends Italian {

	@Override
	public void printDish() {
		
		System.out.println("Pizza");
	}
}

class Lasagna extends Italian {

	@Override
	public void printDish() {
		
		System.out.println("Lasagna");
	}
}

class Spaghetti extends Italian {

	@Override
	public void printDish() {
		
		System.out.println("Spaghetti");
	}
}