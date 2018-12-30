package exceptionHandling;

public class TestException {
	static void ageValidate(int age)throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("You cannot come to this app");
		else
			System.out.println("Welcome to our app");
	}
	
	public static void main(String[] args) {
		try {
			ageValidate(12);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
