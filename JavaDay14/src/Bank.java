
public class Bank {
	
	public void getRateOfInterest() {
		
		System.out.println("Personal Loan: ");
		System.out.println("Home Loan: ");
		System.out.println("Car Loan: ");
	}
}

class Axis extends Bank {
	
	@Override
	public void getRateOfInterest() {
		
		System.out.println("Personal Loan: 13.5");
		System.out.println("Home Loan: 9.0 ");
		System.out.println("Car Loan: 11.0");
	}
}

class ICICI extends Bank {
	
	@Override
	public void getRateOfInterest() {
		
		System.out.println("Personal Loan: 13.0");
		System.out.println("Home Loan: 8.8");
		System.out.println("Car Loan: 10.5");
	}
}


class HDFC extends Bank {
	
	@Override
	public void getRateOfInterest() {
		
		System.out.println("Personal Loan: 13.25");
		System.out.println("Home Loan: 9.0");
		System.out.println("Car Loan: 10.0");
	}
}
