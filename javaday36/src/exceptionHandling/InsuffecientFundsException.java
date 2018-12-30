package exceptionHandling;

public class InsuffecientFundsException extends Exception {
	
	public InsuffecientFundsException(String error) {
		super(error);
	}
}
