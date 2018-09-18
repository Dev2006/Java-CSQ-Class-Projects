
public class TestBank {
	
	public static void main(String[] args) {
		
		Axis axisBank = new Axis();
		ICICI iciciBank = new ICICI();
		HDFC hdfcBank = new HDFC();
		
		System.out.println("Axis bank" + "\n");
		axisBank.getRateOfInterest();
		
		System.out.println("ICICI bank" + "\n");
		iciciBank.getRateOfInterest();
		
		System.out.println("HDFC bank" + "\n");
		hdfcBank.getRateOfInterest();
	}
}
