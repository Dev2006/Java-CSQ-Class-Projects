package exceptionHandling;

public class InvalidAgeException extends Exception{

	public InvalidAgeException(String error) {
		super(error);
	}
}
