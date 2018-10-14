package instanceofPractice;

public abstract class Punjabi extends Dish {}

class Rajma extends Punjabi {

	@Override
	public void printDish() {
		
		System.out.println("Rajma");
	}
}

class Chole extends Punjabi {

	@Override
	public void printDish() {

		System.out.println("Chole");
	}
}

class MixedVeg extends Punjabi {

	@Override
	public void printDish() {

		System.out.println("Mixed Veg");
	}
}